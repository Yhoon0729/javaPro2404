package ch06_obj1;
/*
 * 생성자도 오버로딩이 가능하다.
 */
public class O16_Constructor {

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
class Car{
	String color;
	int number;

	public Car(String color, int number) {
		super();
		this.color = color;
		this.number = number;}
	
	public Car(String color) {
		//this.color=color;
		//number=1;
		this(color, 1);
	}
	public Car(int number) {
		//color="white";
		//this.number=number;
		this("white", number);
	}
	public Car(Car c) {
		//color=c.color;
		//number=c.number;
		this(c.color, c.number);
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", number=" + number + "]";
	}
	
}
