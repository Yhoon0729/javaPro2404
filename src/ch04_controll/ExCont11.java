package ch04_controll;
import java.util.Scanner;

public class ExCont11 {
	/*
	 * 화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기  
	 * [결과]
	  삼각형의 높이를 입력하세요
	  3
	  ***
	   **
	    *
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형 높이를 입력하세요 : ");
		int len = scan.nextInt();
		for (int i = 1; i <=len; i++) {
			//System.out.println(i);
			for (int j = 1; j <= len ; j++) {
				if (j<i)System.out.print(" ");
				else
				System.out.print("*");
			}
			System.out.println();
		}
	}
}




