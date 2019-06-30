import java.io.*;
import java.net.*;

public class UDPMultiServer{
	public static void main(String[] args) throws Exception
	{
		int serverPort = 6789;
		
		DatagramSocket sock = new DatagramSocket(serverPort);
		DatagramPacket packet = null;
		byte[] data = null;
		int count = 0;
		System.out.println("Server start to listen:\n");

		while(true)
		{
			data = new byte[1000];
			packet = new DatagramPacket(data,data.length);
			sock.receive(packet);
			count++;
			System.out.println("The total number of clients is " + count + ".");
			UDPThread serverThread = new UDPThread(sock,packet);
			serverThread.start();
		}

	}
}