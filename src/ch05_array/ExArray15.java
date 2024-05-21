package ch05_array;

import java.util.Scanner;

/*
배열의 크기를 홀수로 입력하세요
5
17	16	15	14	13	
 	12	11	10	 	
 	 	9	 	 	
 	8	7	6	 	
5	4	3	2	1	
 */
public class ExArray15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("홀수개의 배열 크기를 입력하세요");
		int num = scan.nextInt();
		int[][] matrix = new int[num][num];
		int number=0;
		int left=0;
		int right=num-1;
		boolean chk=true;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (left<=j && j<=right) {
					matrix[i][j]=++number;
					
				} 
			}
			
			if (left==right) chk=false;
			if (chk) {
				left++; right--;
			} else {
				left--; right++;
			}
			
		}
		number++;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j]>0) 
				System.out.print(--number+ (number>9?" ":"  "));
				else 
				System.out.print("   ");
			}
			System.out.println();
			
		}
		
		
		
}}
