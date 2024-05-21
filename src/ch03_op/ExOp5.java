package ch03_op;

import java.util.Scanner;
/*
 * 한개의 문자를 입력받아서 소문자인 경우는 대문자로 변경하여 출력하기 
 * 소문자가 아닌 경우는 "소문자아님" 출력하기
 */


public class ExOp5 {
	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next(); //문자열로 입력받기.  "A"
		char ch = str.charAt(0); //문자열 중 첫번째 문자  'A'
		System.out.println('a'-'A'); //32
		String result = (ch >= 'a' && ch <= 'z')?
				(char)(ch-32)+"":"소문자 아님";
		System.out.println(result);
	}
}