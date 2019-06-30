import java.io.*;
import java.net.*;

public class UDPThread extends Thread{

	DatagramSocket aSocket = null;
	DatagramPacket request = null;
	public UDPThread(DatagramSocket aSocket,DatagramPacket packet)
	{
		this.aSocket = aSocket;
		this.request = packet;
	}

	public void run()
	{
		
		try{
			byte[] buffer = new byte[1000];
			while(true)
			{
				
				DatagramPacket reply = new DatagramPacket(request.getData(),
					request.getLength(), request.getAddress(), request.getPort());
				aSocket.send(reply);
			}
		}catch ( SocketException e)
		{
			System.out.println("Socket: " + e.getMessage());
		}catch (IOException e) {
			System.out.println("IO: " + e.getMessage());
		} finally {
			if (aSocket != null) aSocket.close();
		}
		
	}
}