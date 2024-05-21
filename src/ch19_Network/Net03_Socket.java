package ch19_Network;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Net03_Socket {

	public static void main(String[] args) {
		String serverIp = "192.168.0.18";
		System.out.println("서버에 연결중입니다. 서버IP :" + serverIp);
		// 소켓을 생성하여 연결을 요청한다.
		try {
			Socket socket = new Socket(serverIp, 7000);
			// 소켓의 입력스트림을 얻는다.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);

			// 소켓으로 부터 받은 데이터를 출력한다.
			System.out.println("서버로부터 받은 메시지 :"+dis.readUTF());      
			System.out.println("연결을 종료합니다.");
			dis.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}//end class
