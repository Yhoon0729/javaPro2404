package ch02_var;

public class VarEx2 {
	/*
	 * 형변환 예제  
	 *   큰자료형  <=작은 자료형 : 자동형변환
	 *   작은자료형 <= 큰자료형 : 명시적 형변환
	 *   byte < short < int < long < float < double
	 *          char
	 *          
	 *  A=B : 같다 의 의미가 아니고, 대입의 의미임.
	 *        B의 값을 A에 입력함.
	 *  left value(A) : 대입연산자의 왼쪽의 값. 반드시 변수여야함.
	 *  right value(B) : 대입연산자의 오른쪽의 값, 변수, 리터널, 수식 가능             
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 10;
        char aa = 97;
        char c1 = 'a';
        System.out.println(aa);
        System.out.println(c1);
        String st1 = "aaaa";   //문자열 객체임
        boolean b = false;
        
        byte b1 = (byte) 255;
        // 11111111
        a=b1; // int <===  byte
        System.out.println(b1);
        
        
        long l1 = 10;
		float f1 = l1;
		long l2 =  (long) f1;
		char c2 = 'A';
		short s1 =  (short) c2;
		char c3 =  (char) b1;
        
        
        
        
        
        
	}

}
