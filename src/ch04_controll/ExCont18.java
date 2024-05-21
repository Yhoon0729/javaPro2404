package ch04_controll;
import java.util.Scanner;

public class ExCont18 {
/*	
홀수를 입력하여 모래시계 그리기
	7
	*************
	 *********** 
	  *********  
	   *******   
	    *****    
	     ***     
	      *      
	     ***     
	    *****    
	   *******   
	  *********  
	 *********** 
	*************	
*/	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수를 입력하세요 ");
		int num = scan.nextInt();
		int start=1;
		int end = (num*2 -1);
		for (int i = 1; i <= (num*2 -1) ; i++) {
			for (int j = 1; j <= (num*2 -1); j++) {
			System.out.print((start<=j && end >= j)?"*":" ");
			}
			
			if (i<num) {start++;	end--;
			} else {	start--;	end ++;	}
			System.out.println();
		}
		
	}
	

	
}