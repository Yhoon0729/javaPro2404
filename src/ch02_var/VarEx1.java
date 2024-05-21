package ch02_var;

public class VarEx1 {

	public static void main(String[] args) {
		byte b1 = -22;  //변수의 선언과 초기화
		byte b2=10;  //변수의 선언 
		// byte :  (1byte=8bit)
		//byte 범위 : -128 ~ 127
		// 1(sign bit: 1 음수, 0 양수)  1 1 1 1 1 1 1  
	
		// 0 1111111 = 127
		// 1 0000000 = -128
		
		System.out.println(b1+":"+b2);
		
		short s1 = -220;
		int i1 = 1000;
		long l1 = 3000;
		
		   
		 System.out.println(b1); 
		 System.out.println(b2); 
		 
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		// block 주석설정   ctl + shift + /
		// block 주석해제   ctl + shift + \
		// value가 정수 ----> int,  실수 ---> double
		float f1 = 10;  //auto casting
		float f2 = 10.0f;  //float type
		float f3 = (float) 10.0;
		
		double  d1 = 10.0;
		double  d2 = 10.0d;
		System.out.println(f2);
		System.out.println(d1);
	}
	/*
	 * 1. 리터럴이  정수 ----> int, 실수 ---> double
	 * 2. 접미사
	 *    float : 10f, 10F
	 *    double : 10d, 10D
	 *    long : 10l, 10L
	 */
}
