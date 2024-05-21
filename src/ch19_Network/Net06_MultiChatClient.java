package ch19_Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Net06_MultiChatClient {
	static String name = "김영훈";
	
	public static void main(String[] args) {
		String serverIp = "127.0.0.1";
		// 소켓을 생성하여 연결을 요청한다.
		Socket socket;
		try {
			socket = new Socket(serverIp, 5000);
			System.out.println("서버에 연결되었습니다.");
			Thread sender = new Thread(new ClientSender(socket, name));
			Thread receiver = new Thread(new ClientReceiver(socket));
			
			sender.start();
			receiver.start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} // end of tryCatch
		
	} // end of main
} // end of class

class ClientSender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;
	
	public ClientSender(Socket socket, String name) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			this.name = name;
		} catch (Exception e) {
			
		}
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		try { 
			if (out != null) {
				out.writeUTF(name);
			}
			while (out != null) {
				out.writeUTF("[" + name + "]" + scanner.nextLine());
			} 
		} catch (IOException e) {
			
		}
	} // end of run
} // end of class

class ClientReceiver extends Thread {
	Socket socket;
	DataInputStream in;
	
	ClientReceiver(Socket socket){
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch(IOException e) {
			
		}
	}
	
	public void run() {
		while(in != null) {
			try {
				System.out.println(in.readUTF());
			} catch(IOException e) {
				
			}
		}
	} // end of run
} // end of class