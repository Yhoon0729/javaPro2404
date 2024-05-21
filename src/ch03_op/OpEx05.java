package ch03_op;
/*
 * 산술 연산
 *  / : 나누기 연산자
 *      정수 = 정수/정수(int 이하)
 *  % : 나머지 연산자
 *      나머지연산의 결과값의 부호는 피젯수(나누어 지는수) 의 부호와 같다.
 */
public class OpEx05 {
	public static void main(String[] args) {
		System.out.println(10/8); //1
		System.out.println(10/-8);//-1
		System.out.println(-10/8);//-1
		System.out.println(-10/-8);//1
		
		System.out.println(10%8); //2
		System.out.println(10%-8);//2
		System.out.println(-10%8);//-2
		System.out.println(-10%-8);//-2
	}
}