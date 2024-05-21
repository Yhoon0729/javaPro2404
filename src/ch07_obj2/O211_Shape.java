package ch07_obj2;

public class O211_Shape {
	/*
	 * 추상 클래스
	 *   추상메서드를 가질 수 있는 클래스. abstract 예약어로 구현됨.
	 *   객체화 불가 => 객체화는 반드시 상속을 통해서 자손클래스의 객체화로 객체화가 가능함.
	 *   이때 자손클래스에서는 추상메서드를 반드시 오버라이딩 해야함.
	 *   그외는 일반클래스와 동일. (생성자, 멤버변수, 멤버메서드 ...)
	 *   업무의 표준화시 사용함.
	 *   
	 * 추상메서드 : 선언부만 존재하는 메서드. 구현부가 없다.
	 *           자손클래스에서 반드시 오버라이딩 해야함. 
	 * 추상클래스간에도 상속은 가능.             
	 */
	
	public static void main(String[] args) {
		Shape Shapes[] = new Shape[2];
		Shapes[0] = new Circle(10);
		Shapes[1] = new Rectangle(10, 10);
		
		for (Shape s : Shapes) {
			System.out.println(s);
		}

	}

}
abstract class Shape {  //추상 클래스
	String type;
	public Shape(String type) {
		this.type=type;
	}
	abstract double area();
	abstract double length();  //추상메소드
	
}
class Circle extends Shape {
	int r;
	public Circle(int r) {
		super("원");
		this.r=r;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return Math.PI*2*r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r +", type="+type+ ", area()=" 
	      + area() + ", length()=" + length() + "]";
	}
	
}

class Rectangle extends Shape{
    int width, height;
	public Rectangle(int width, int height) {
		super("사각형");
		this.width=width;
		this.height=height;
		// TODO Auto-generated constructor stub
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return width * height;
	}
	@Override
	double length() {
		// TODO Auto-generated method stub
		return (width + height) * 2;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", type=" + type 
				+ ", area()=" + area()
				+ ", length()=" + length() + "]";
	}
	
	
	
}



