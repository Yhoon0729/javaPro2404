package ch19_Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Net07_MultiChatServer {
	HashMap<String, DataOutputStream> clients;
	Net07_MultiChatServer() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);
	}
	
	public static void main(String[] args) {
		new Net07_MultiChatServer().init();
	} // end of main
	
	public void init() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(5000);
			System.out.println("서버가 시작 되었습니다.");
			
			while(true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress()
					+ ":" + socket.getPort() + "]");
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} // end of tryCatch
	} // end of init
	
	void sendToAll(String msg) {
		Iterator<String> it = clients.keySet().iterator();
		while(it.hasNext()) {
			try {
				String tname = it.next();
				String oname = "";
				if(!msg.startsWith("#")) {
					oname = msg.substring(1, msg.indexOf("]"));
					System.out.println(tname + ":" + oname);
				}
				DataOutputStream out = clients.get(tname);
				if(!tname.equals(oname)) {
					out.writeUTF(msg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} // end of tryCatch
		} // end of while
	} // end of sendToAll
	
	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			} // end of tryCatch
		} // end of ServerReceiver
		
		public void run() {
			String name = "";
			try {
				name = in.readUTF();
				sendToAll("#" + name + "님이 들어오셨습니다");
				clients.put(name, out);
				System.out.println("현재 접속자의 수는 " + clients.size() + "입니다.");
				while (in != null) {
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				sendToAll("#" + name + "님이 나가셨습니다");
				clients.remove(name);
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "]");
				System.out.println("현재 접속자의 수는 " + clients.size() + "입니다.");
			} // end of tryCatch
		} // end of run()
	} // end of class ServerReceiver
} // end of class Net07_MultiChatServer
