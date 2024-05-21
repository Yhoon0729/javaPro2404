package ch04_controll;
import java.util.Scanner;

public class ExCont05 {
	/*
	 * 숫자로 이루어진 문자열을 입력받아 각 자리수 합을 구하기 : 
	 * String str = scan.next();  //123
	 * str.length() : 3. 문자열 길이
	 * str.charAt(0) => '1' 
	 * str.charAt(1) => '2' 
	 * str.charAt(2) => '3'
	 * str.charAt(3) => 사용안됨
	 * for  구문 이용 
	 * System.out.println('a'-'A')-> 32
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();  //String
		int sum=0;
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			sum +=(str.charAt(i)-'0');
		}
		System.out.println("자리수의 합:"+sum);
		System.out.println('a'-'A');
	}

}





