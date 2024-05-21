package ch07_obj2;

public class O208_Casting {

	public static void main(String[] args) {
		Car car1 = new Car();
		// 생성자 type에 따라 (child, parent) 
		// 명시적 casting에서 error가 생길 수 있다
		Car car2 = null;
		FireEngine fe = null;
		car1.drive();
		fe=(FireEngine) car1;  //error
		fe.drive();
		car2=fe;
		car2.drive();

	}

}
class Car {
	String color; int door;
	void drive() {
		System.out.println("drive, 붕~~~");
	}
	void stop() {
		System.out.println("stop!!!!");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("water !!!!!");
	}
}
