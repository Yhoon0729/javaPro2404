package ch11_API;
/*
 * String 클래스 예제
 * 1. String 클래스는 유일하게 리터럴값으로 대입을 해서 객체 생성이 가능함.
 *    리터럴값으로 대입할때에 같은 값으로 string 만들면 먼저 정해진 주소로 정한다 
 *    다른 클래스의 객체는  new 클래스명() 형태로 객체생성이 됨.
 * 2. String은 final 클래스임(다른 클래스가 상속 받을수 없음).
 * 3. +연산자 사용이 가능함. + 연산으로 모든형을 String 형으로 형변환 가능.
 *    참조변수.toString() 으로 타입을 변환하여 String으로 변환한다 
 */





public class Api07_String {
	public static void main(String[] args) {
		String s1 = "abc"; // 대입연산자로 객체 생성
		String s2 = "abc";
		String s3 = new String("abc"); // new 연산자로 객체 생성
		String s4 = new String("abc");
		if (s1 == s2)
			System.out.println("1:s1==s2 : 같은 객체");
		else			
			System.out.println("1:s1!=s2 : 다른 객체");
		
		if (s1.equals(s2))
			System.out.println("2:s1.equals(s2) : 같은 내용");
		else
			System.out.println("2:!s1.equals(s2) : 다른 내용");
		
		if (s3 == s4)	
			System.out.println("3:s3==s4 : 같은 객체");
		else
			System.out.println("3:s3!=s4 : 다른 객체");
		
		
		
		if (s3.equals(s4))			
			System.out.println("4:s3.equals(s4) : 같은 내용");
		else			
			System.out.println("4:!s3.equals(s4) : 다른 내용");
		
		if (s2 == s3)
			System.out.println("5:s2==s3 : 같은 객체");
		else			
			System.out.println("5:s2!=s3 : 다른 객체");
		
		if (s2.equals(s3))
			System.out.println("6:s2.equals(s3) : 같은 내용");
		else			
			System.out.println("6:!s2.equals(s3) : 다른 내용");
	}
}