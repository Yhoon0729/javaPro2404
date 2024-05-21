package ch05_array;

import java.util.Scanner;

public class ExArray12 {

/*
 * 숫자 맞추기 게임
 * 시스템이 4자리의 서로 다른 수를 저장한 후
 * 사용자가 저장된 수를 맞추는 게임
 *    자리수도 맞는 경우 : 스트라익
 *    자리수는 틀리지만 숫자가 존재하면 : 볼
 *  4스트라익이 되면 정답
computer : 1234
user        :  1457
1 strike , 1ball
 */


	public static void main(String[] args) {
		  int numarr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		  //answer : 사용자가 맞춰야할 시스템의 4자리 숫자.
		  int answer[] = new int[4];
		  //1. 중복되지 않는 4자리수를 생성하기
		
		  for(int i=0;i<1000;i++) {
			 int f = (int)(Math.random() * 10 ); //4 numarr[4]
			 int t = (int)(Math.random() * 10 ); //1 numarr[1]
			 int temp = numarr[f];
			 numarr[f] = numarr[t];
			 numarr[t] = temp;
		  }
		  for(int i=0;i<answer.length;i++) {
			  answer[i] = numarr[i];
			  System.out.print(answer[i]);
		  }
		  System.out.println();
		  
		  Scanner scan = new Scanner(System.in);
		  int[] data = new int[4];
		  while(true) {
			  String input = scan.next();
			
			//  int input = scan.nextInt();
			  // arr data 초기화
			 for (int i = 0; i < data.length; i++) {
				data[i] = input.charAt(i)-'0';
			} 
			 
			 int strike = 0;
			 int ball = 0;
			 for (int i = 0; i < answer.length; i++) {
				for (int j = 0; j < data.length; j++) {
					//System.out.println(answer[i]+"="+data[j]);
					if (answer[i]==data[j]) {
						if (i==j)  strike++;
						else ball++;
					}
				}
			}
			 if (strike == 4) {
				 System.out.println("정답 입니다 ");
				 break;
			 } else {
				 System.out.println(strike + "스트라익,"+ball +"볼" );
			 }
			 
		  }
		  
		  
		  
		  
}}















