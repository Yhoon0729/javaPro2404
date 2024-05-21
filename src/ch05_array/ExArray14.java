package ch05_array;
import java.util.Iterator;
/*
 2차원 배열을 이용하여  모래시계 출력하기
 배열의 크기를 홀수개로 입력하세요 

홀수개의 배열 크기를 입력하세요
7
1  2  3  4  5  6  7  
   8  9  10 11 12    
      13 14 15       
         16          
      17 18 19       
   20 21 22 23 24    
25 26 27 28 29 30 31 
 */
import java.util.Scanner;
public class ExArray14 {
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
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j]>0) 
				System.out.print(matrix[i][j]+ (matrix[i][j]>9?" ":"  "));
				else 
				System.out.print("   ");
			}
			System.out.println();
			
		}
		
		
		
}}
