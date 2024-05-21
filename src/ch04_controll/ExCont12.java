package ch04_controll;

import java.util.Scanner;

public class ExCont12 {
	/*
	삼각형의 높이를 입력하세요
	8
	       *       
	      ***      
	     *****     
	    *******    
	   *********   
	  ***********  
	 ************* 
	***************
	 */
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		for (int i = 1; i <= len; i++) {
			
			for (int j = 0; j <= (len * 2 - 1); j++) {
				if (len -i < j && j < len + i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}