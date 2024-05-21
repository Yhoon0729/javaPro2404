package ch19_Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net01_InetAddress {

	public static void main(String[] args) 
			throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.naver.com");
		System.out.println("getByName 메서드 호출");
		System.out.println("hostname:" + ip.getHostName());
		System.out.println("ip address:" + ip.getHostAddress());
		InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
		System.out.println("getAllByName 메서드 호출");
		for (InetAddress i : ips) {
			System.out.println("ip 주소:" + i);
		}
		// getAddress() : ip주소값을 byte[]배열로 리턴
		byte[] ipAddr = ip.getAddress();
		// byte 자료형의 표현 범위 : -128 ~ 127
		// 127이상의 값은 음수로 표현됨.
		for (byte b : ipAddr) {
			System.out.print(((b < 0) ? b + 256 : b) + ".");
		//	System.out.print(b + ".");
		}
		System.out.println();
		System.out.println("getLocalHost 메서드 호출");
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내컴퓨터IP:" + local);
		

	

	}

}
