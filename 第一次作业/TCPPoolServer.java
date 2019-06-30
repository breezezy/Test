import java.io.*;
import java.net.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TCPPoolServer {
	 public static void main(String[] args) throws Exception {
		ServerSocket listenSocket=new ServerSocket(8189);
        Socket socket=null;
            
        int count=0;
        System.out.println("Server listening at 8189");
            
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,200,TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
        for(int i = 0;i < 15;i++)
        {
            socket = listenSocket.accept();
            count++;
            System.out.println("The total number of clients is " + count + ".");
            TCPThread serverThread=new TCPThread(socket);
            executor.execute(serverThread);
             System.out.println("The number of threads in the ThreadPool:"+executor.getPoolSize());
             System.out.println("The number of tasks in the Queue:" + executor.getQueue().size());
             System.out.println("The number of tasks completed:"+executor.getCompletedTaskCount());
        }
    }
}