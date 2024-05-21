package ch06_obj1;

public class O13_Overloading {

	public static void main(String[] args) {
		Math4 m = new Math4();
		System.out.println(m.add(10,10));
		System.out.println(m.add(10,10L));
		System.out.println(m.add(10L,10));
		System.out.println(m.add(10L,10L));
		

	}

}
/*
 * 오버로딩 예제 
 *   같은 클래스 내부에 같은 이름을 가진 메서드가 여러개 존재할 수 있다.
 *   단 매개변수의 자료형의 갯수, 순서, 타입이 달라야 한다.
 *   => 매개변수이름이 아니고 자료형으로 판단함.
 */
class Math4 {
	int add(int a, int b) {
		System.out.println("int a, int b :");
		return a+b;
	}
	/*
	 * int add(int x, int y) { System.out.println("int a, int b :"); return x+y; }
	 */
	
	long add(int a, long b) {
		System.out.println("int a, long b :");
		return a+b;
	}
	long add(long a, int b) {
		System.out.println("long a, int b :");
		return a+b;
	}
	long add(long a, long b) {
		System.out.println("long a, long b :");
		return a+b;
	}
	
}
