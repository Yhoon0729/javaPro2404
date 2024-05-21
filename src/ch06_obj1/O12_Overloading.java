package ch06_obj1;

public class O12_Overloading {

	public static void main(String[] args) {
		Math3 m = new Math3();
		System.out.println(m.add(10));
		System.out.println(m.add(10.3));
		System.out.println(m.add("번"));

	}

}
/*
 * 오버로딩 예제 
 *   같은 클래스 내부에 같은 이름을 가진 메서드가 여러개 존재할 수 있다.
 *   단 매개변수의 자료형의 갯수, 순서, 타입이 달라야 한다.
 *   => 매개변수이름이 아니고 자료형으로 판단함.
 */
class Math3 {
	int a = 100;
	/*
	 * int add(int b) { System.out.print("int:"); return a+b; }
	 */
	
	long add(long b) {
		System.out.print("long:");
		return a+b;
	}
	
	double add(float b) {
		System.out.print("float:");
		return a+b;
	}
	
	
	double add(double b) {
		System.out.print("double:");
		return a+b;
	}
	
	String add(String b) {
		System.out.print("String:");
		return a+b;
	}	
	
}
