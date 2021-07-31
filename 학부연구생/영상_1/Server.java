package experiment;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket();
		server.bind(new InetSocketAddress("localhost",5000));
		
		System.out.println("server start!");
		
		Socket socket = server.accept(); //접속기다림
		
		System.out.println("connected ...");
	    DataInputStream dis = new DataInputStream(socket.getInputStream());
	    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
	    
	    //data communication
	    
	    String str = dis.readUTF();
	    
	    System.out.println(str);
	    
	    socket.close();
	    server.close();
	    
	    System.out.println("Terminated...");

	}

}
