package ch05_array;

import java.util.Arrays;

/*
 * 로또 번호 추첨기
 */
public class ArrayEx03 {
	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;  //초기화 
		}
		// 문제 1 ~ 45 번호중에 랜덤한 6개의 번호를 중복 하지 않고 저장
		// balls 섞기
				for (int i = 0; i < 1000; i++) {
					int f = (int) (Math.random() * 45);
					int t = (int) (Math.random() * 45);
					// swap 알고리즘
					int tmp = balls[f];
					balls[f] = balls[t];
					balls[t] = tmp;	}
				// 6개의 번호 선택 0 ~ 5
				for (int i = 0; i < lotto.length; i++) {
					lotto[i] = balls[i];				}
				// 선택 번호출력
				
				
				
				
				for (int b : lotto) {
					System.out.print(b + ",");
				}
				System.out.println();
				
				Arrays.sort(lotto);
				
				for (int b : lotto) {
					System.out.print(b + ",");
				}
				System.out.println();
				
				
				for (int i = 0; i < lotto.length; i++) {
					boolean chg = true;
					for (int j = 0; j < lotto.length-1-i; j++) {
						if (lotto[j]>lotto[j+1]) {
							chg=false;
							int temp=lotto[j];
							lotto[j]=lotto[j+1];
							lotto[j+1]=temp;
						}
					}
					if (chg) break;
				}
				
				for (int b : lotto) {
					System.out.print(b + ",");
				}
				
				
	}
}


