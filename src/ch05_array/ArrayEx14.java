package ch05_array;

import java.util.Arrays;

/*
 * 배열의 복사 : Arrays  클래스 이용하기
 * int[] Arrays.copyOf(int[] original, int newLength)
 */
public class ArrayEx14 {
	public static void main(String[] args) {
		int score[] = {90,80,70};
		int score2[] =null;
		score2 = Arrays.copyOf(score, 5);
		
		for(int s : score2) {
			System.out.println(s);
		}
		
		System.out.println("Arrays.toString(score2)");
		System.out.println(Arrays.toString(score2));
	}
}