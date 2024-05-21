package ch06_obj1;
/*
 * 생성자도 오버로딩이 가능하다.
 */
public class O15_Constructor {

	public static void main(String[] args) {
		Car c1 = new Car("blue", 1234);  //String color, int number
		Car c2 = new Car("red");
		Car c3 = new Car(1234);
		Car c4 = new Car(c3);
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		System.out.println("c3:" + c3);
		System.out.println("c4:" + c4);

	}

}

	

