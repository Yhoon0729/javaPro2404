package ch04_controll;

import java.util.Scanner;

public class LoopEx7 {
	//ans : 1부터100사이의 임의의 수 저장하는 변수
	public static void main(String[] args) {
		int ans = (int) (Math.random()*100)+ 1;
		//System.out.println(ans);
		Scanner scan = new Scanner(System.in);
		int input;
		int cnt=0;
		do {
			System.out.println("1 ~ 100 사이의 숫자를 입력하세요");
			input = scan.nextInt(); 
			if(ans > input) {
				System.out.println("더 큰수 입니다.");
			} else if (ans < input) {
				System.out.println("더 작은 수 입니다.");
			} else {
				System.out.println("정답입니다..");
			}
			cnt++;
			
			
		} while (ans!=input);
		System.out.println("횟수 : "+cnt);
	}
	}