package ch16_lambda;

import java.util.function.IntBinaryOperator;
/*Operator 함수적 인터페이스 
매개값과 리턴값이 모두 있는 추상 메소드 가짐
주로 매개값을 연산하고 그 결과를 리턴할 경우에 사용
매개 변수의 타입과 수에 따라 분류*/
public class LambdaEx10 {
	
	private static int[] scores = { 92, 95, 87 };
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin(
			(a, b) -> {
				if(a>=b) return a;
				else return b;
			}
		);
		System.out.println("최대값: " + max);
	}}