package ch04_controll;

import java.util.Scanner;

public class ExCont04 {
	/*
	 * 화면에서 자연수를 입력받아 각각의 자리수의 합을 구하기.
	 * [결과]
	 * 자연수를 입력하세요
	 * 123
	 * 자리수 합 : 6
	 * 자연수를 입력하세요
	 * 1357
	 * 자리수 합 : 16
	 * */
	
	public static void main(String[] args) {
		System.out.println("자연수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
        int sum=0;
		
		for (int value = num ; value != 0 ; value /=10) {
			System.out.println(value%10);
			sum +=(value%10);
		}
		System.out.println("자리수 합 :" + sum);
		
		int value =num;
		sum=0;
        while(value != 0) {
        	sum +=(value%10);
        	value /=10;
        }
        System.out.println("자리수 합 :" + sum);
	}
		
		
		
	}
