package ch06_obj1;

public class O07_Method {

	public static void main(String[] args) {
		Math2 m = new Math2();
		m.a=10;
		m.b=20;
		System.out.println("add1:"+m.add1());//30
		System.out.println("add2:"+m.add2(100, 200));//300
		System.out.println("x:"+m.x); 
		System.out.println("add2:"+Math2.add2(100, 200));//300

	}

}

class Math2 {
	int a, b; // 인스턴스변수
	int x;
	int add1() {	
		for (int i = 0; i < 5; i++) {		int x=7;		}
		System.out.println(x);
		return a + b;	}

	static int add2(int a, int b) {
		int x=5;
		return a + b;	}}