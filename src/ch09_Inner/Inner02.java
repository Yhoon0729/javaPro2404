package ch09_Inner;

public class Inner02 {
	//로컬내부클래스에서 사용되는 메서드의 지역변수는 상수화(final) 되어야 한다.
	public static void main(String[] args) {
		Outer2 o = new Outer2();
		o.method(0);	}}

class Outer2 {
	private static int outercv = 20;	
	private int outeriv = 10;
	void method(final int pv) {
		int i = 0;
		//i++;		pv++;
		outercv++;
		outeriv++;
		class LocalInner { // 지역내부클래스
			int liv = outeriv; // 외부클래스의 private 멤버 접근 가능
			int liv2 = outercv;// 외부클래스의 private 멤버 접근 가능

			void method() {
				// 지역내부클래스에서 내부클래스가 속한 메서드의 지역변수는 final 이여야한다 
				// i = 100;
//				pv++;
				System.out.println("i=" + i);
				System.out.println("pv=" + pv);
				System.out.println(liv + "," + liv2);
				System.out.println(outeriv + "," + outercv);
				System.out.println(outeriv + "," + outeriv);
				// 외부클래스의 private 멤버 접근 가능
			}		}
		LocalInner l = new LocalInner();
		l.method();
		
		
	}	
}//end outer2
