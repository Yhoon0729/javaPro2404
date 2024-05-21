package ch03_op;

import java.util.Scanner;

/*
 * 10부터 99사이의 두자리 자연수를 입력받아 입력수보다 크거나 같은 가장 작은 10의 배수를 구하기
 * 10의배수에 입력수를 뺀 값을 출력하기 : 
 * [결과]
 * 10부터 99까지의 수를 입력하세요
 * 24
 * 30 - 24 = 6
 * 
 * 10부터 99까지의 수를 입력하세요
 * 20
 * 20 - 20 = 0
 * 
 * 10부터 99까지의 수를 입력하세요
 * 77
 * 80 - 77 = 3
 */
public class ExOp9 {
	public static void main(String[] args) {
		System.out.println("10부터 99까지의 두자리수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = (num+9)/10*10;
		
		System.out.println(result+"-"+num+"="+(result-num));
	}
}