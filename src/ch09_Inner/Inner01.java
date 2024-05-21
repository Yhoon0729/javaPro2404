package ch09_Inner;

public class Inner01 {
	/*
	 * 내부 클래스 
	 * 
	 *  인스턴스 내부클래스 :  (static)클래스 멤버를 가질 수 없다. 단 상수는 가능    =====> x
	 *  static 내부클래스 : (static)클래스 멤버를 가질 수 있다.   =======> x
	 *  지역내부클래스        : 메서드 내에 선언된 클래스. 메서드 내부에서만 사용이 가능함.
	 *  이름없는(무명의)내부클래스 : 클래스 없이 객체화 가능한 클래스
	 *                        추상클래스,인터페이스 의 객체화 가능함.
	 */
	public static void main(String[] args) {
		Outer1.StaticInner si = new Outer1.StaticInner();
		System.out.println(si.iv);//300
		System.out.println(Outer1.StaticInner.cv);//400
		System.out.println(Outer1.StaticInner.MAX);//500
		
		//Outer1.InstanceInner ii1 = new Outer1.InstanceInner();
		Outer1.InstanceInner ii1 = (new Outer1()).new InstanceInner();
		
		Outer1 outer = new Outer1();
		Outer1.InstanceInner ii2 = outer.new InstanceInner();
		
		System.out.println(ii2.iv);//100
		System.out.println("Outer1.InstanceInner.cv:"
		+Outer1.InstanceInner.cv);
		System.out.println(Outer1.InstanceInner.MAX);  //상수 
		outer.method();
		
		
	}
}
class Outer1 {
	class InstanceInner {  //인스턴스 내부클래스
		static int num;
		int iv = 100;
		static int cv = 10; 
		final static int MAX = 200; 
	}
	static class StaticInner { //static 내부클래스
		static int num;
		int iv = 300;
		static int cv = 400; 
		final static int MAX = 500;
	}
	
	void method() {
		class LocalInner { // 지역 내부 클래스
			int iv = 600;
			static int cv = 700; 
			final static int MAX = 700;
			
		} // 상수는 가능.
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv); // 600
		System.out.println(lc.MAX);// 700
		System.out.println(LocalInner.MAX);
		System.out.println(LocalInner.cv);
		
	}
	void method1() {
	//	LocalInner lc = new LocalInner();
	}
}















