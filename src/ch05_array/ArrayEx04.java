package ch05_array;

import java.util.Scanner;

/*
 * 10 진수를 2진수로 변경하기
 * 
 */
public class ArrayEx04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[32];
		char[] data = 
			{'0','1','2','3','4','5','6','7','8',
					'9','A','B','C','D','E','F'};
		System.out.println("변환할 10진수를 입력하세요");
		int num = scan.nextInt();
		int digit = 16; // 변환할 진수
		int dinum=num;
		int index=0;
		while(dinum != 0) {
			arr[index++]=dinum%digit;
			dinum /=digit;
		}
		for (int i = index-1 ; i>=0 ; i--) {
			System.out.print(data[arr[i]]+ " ");
		}
		System.out.println();
		
		
	}
}