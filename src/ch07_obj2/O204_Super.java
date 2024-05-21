package ch07_obj2;

public class O204_Super {

	public static void main(String[] args) {
		Parent3 p = new Child3();
		
		p.method();
		System.out.println(p.x);// Parent의 x
		Child3 c = new Child3();
		c.method();
		System.out.println(c.x);  //Child의 x
	}
}
class Parent3 {
	int x = 10;
	void method() {
		System.out.println("Parent method");
	}
}
class Child3 extends Parent3 {
	int x=20;
	void method() {
		int x = 30;
		System.out.println("child method");
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}
