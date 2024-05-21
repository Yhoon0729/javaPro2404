package ch16_lambda;

import java.util.function.IntBinaryOperator;

/*
 * Operator 인터페이스 예제 : apply 계열 추상 메서드 소유
 *   매개변수 있고, 리턴값도 존재. =>
 *    단 매개변수의 자료형과 리턴값의 자료형이 같다.
 *   Function 인터페이스의 하위 인터페이스임.
 *   result = op.applyAsInt(result, next);
 */
public class LambdaEx09 {
	private static Student[] list = {
			new Student("홍길동",90,80,"경영"),
			new Student("김삿갓",95,70,"컴공"),
			new Student("이몽룡",100,70,"수학")};
	public static void main(String[] args) {
		System.out.print("최대 수학값:");
		int max = maxOrMinMath((a, b) -> (a>=b)?a:b);
		 max = maxOrMinMath((a, b)-> 
		 { if (a>=b) return a; else return b; });
		 max = maxOrMinMath((a, b)-> { return ((a>=b)?a:b); });
		 System.out.println(max);
		 System.out.println("최소 수학값:");
		 System.out.println(maxOrMinMath((a,b)->(a<=b)?a:b));
		 System.out.println("최대 평균값:");
		 System.out.println(maxOrMinAvg((a,b)->(a>=b)?a:b));
		 System.out.println("최소 평균값:");
		 System.out.println(maxOrMinAvg((a,b)->(a<=b)?a:b));
		
	}
	
	static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for (Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}		return result;
	}
	static int maxOrMinAvg(IntBinaryOperator op) {
		int result = (list[0].getMath()+list[0].getEng())/2;
		for (Student s : list) {
			result = op.applyAsInt(result, (s.getMath()+s.getEng())/2);
		}		return result;
	}
	/* int applyAsInt(a,b) { return (a>=b)?a:b }
	 * 
	 */
	
	}