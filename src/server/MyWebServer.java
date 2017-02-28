package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyWebServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(9999);
		Socket s=ss.accept();
		
		System.out.println(s.getInetAddress()+"连接成功!");
		
	}
}
