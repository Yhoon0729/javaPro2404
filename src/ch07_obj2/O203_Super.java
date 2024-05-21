package ch07_obj2;

public class O203_Super {

	public static void main(String[] args) {
		Child2  c = new Child2();
		c.method();
	}
}

class Parent2 {
	int x = 10;
	
	public Parent2(int x) {
		this.x=x;	}
	public Parent2() {	x=999;	}	
}
class Child2 extends Parent2 {
	int x=20;	
	void method() {
		int x = 30;
		System.out.println(x); //30
		System.out.println(this.x);//20
		System.out.println(super.x); //10
	}
}






