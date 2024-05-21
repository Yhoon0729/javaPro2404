package ch04_controll;

public class LoopEx3 {
	/*
	 * 중첩 반복문 : 반복문 내부에 반복문이 구현됨.
	 * 구구단 출력하기 (2단 ~ 9단)
	 */
	public static void main(String[] args) {
        
		for (int i = 2; i <=9 ; i++) {
			System.out.println("\n" + i +"단");
			
			for (int j = 2; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" +i * j);
			}
			
		}
	}
}