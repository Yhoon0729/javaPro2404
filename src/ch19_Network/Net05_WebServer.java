package ch19_Network;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Net05_WebServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5000);
			while (true) {
				System.out.println("클라이언트 접속 대기");
				Socket socket = server.accept();
				System.out.println("스레드 생성");
				HttpThread ht = new HttpThread(socket);
				ht.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static class HttpThread extends Thread {
		private Socket socket;
		BufferedReader br;
		PrintWriter pw;

		HttpThread(Socket client) {
			this.socket = client;
			try {
			br = new BufferedReader(
			new InputStreamReader(socket.getInputStream())); // url read
			pw = new PrintWriter(socket.getOutputStream()); // index.html 파일을 보냄
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void run() {
			BufferedReader sfile = null;
			String pathname = "src/ch19_Network/";   //web   webapp, webContent view위치
			String line;
			try {
			line = br.readLine();   //http://192.168.0.122:5000/
			System.out.println("[" + line + "]");
			// -----------------
			if (!line.startsWith("GET /favicon.ico")) {
				line = line.substring(line.indexOf("/") + 1);
				line = line.substring(0, line.indexOf(" "));
				
				System.out.println("1:" + line);
				pathname += line;			
			System.out.println("파일이름 :"+pathname);
			sfile = new BufferedReader(new FileReader(pathname));
			pw.println("HTTP/1.0 200 OK\r\nContent-Type: text/html\r\n\r\n");
			String fileLine = "";
			while((fileLine=sfile.readLine())!=null) {
				pw.println(fileLine);
				pw.flush();		}
			}
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}}}