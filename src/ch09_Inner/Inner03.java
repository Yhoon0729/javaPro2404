package ch09_Inner;

public class Inner03 {
	/*
	 * 내부클래스 객체에서 사용되는 this
	 */
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner ii = out.new InstanceInner();
		ii.method();
	}}
class Outer3 {
	int iv = 30;
	int iv2 = 20;
	
	class InstanceInner {
		int iv = 100;
		void method() {
			int iv = 300;
			System.out.println(iv);
			System.out.println(this.iv);
			System.out.println(Outer3.this.iv);
		}
	}	
	
}
