package ch19_Network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Net02_ServerSocket {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {	serverSocket = new ServerSocket(5000);
		} catch (IOException e) {	e.printStackTrace();	}
		System.out.println("서버가 준비되었습니다.");
	while(true) {
			System.out.println("연결요청을 기다립니다.");
			// 서버소켓은 클라이언트의 연결요청이 올 때까지 실행을 멈추고 계속 기다린다.
            // 클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 소켓을 생성한다.
			Socket socket;
			try {	socket = serverSocket.accept();
				System.out.println(socket.getInetAddress()
						+ "로부터 연결요청이 들어왔습니다.");
				// 소켓의 출력스트림을 얻는다.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				// 원격 소켓(remote socket)에 데이터를 보낸다.
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println("데이터를 전송했습니다.");
				// 스트림과 소켓을 닫아준다.
				dos.close();				socket.close();
			} catch (IOException e) {	e.printStackTrace();
	}}	}} //end class
