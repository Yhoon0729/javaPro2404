package ch06_obj1;

/* 1) 직사각형(Rectangle) 클래스 만들기
 * 가로(width),세로(height)의 변수를 가지고 있는
 * 
 * 모든 멤버의 접근제한자는 생략한다 
 * 모든 멤버는 이스턴스 멤버이다 
 * 멤버 메서드로는 넓이를 print하는 area(),둘레를 print하는 length()를 가진다.
 */

/*
 * 넓이:10*5=50 
 * 둘레:(10+5)*2=30 
 * 넓이:30*20=600 
 * 둘레:(30+20)*2=100
 * 
 */
class Rectangle {
	int width;
	int height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
		
	}
	void area() {
		System.out.println("넓이:" + width + "*" + height + "=" 
	+ (width * height));

	}

	void length() {
		System.out.println("둘레:(" + width + "+" + height + ")*2=" 
	+ ((width + height) * 2));
	}
}

public class ExOop01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 5;
		System.out.print("넓이:");
		r1.area();
		System.out.print("둘레:");
		r1.length();
		// 가로 : 30, 세로가 20인 직사각형의 객체를 생성하고, 넓이, 둘레를 출력하기
		Rectangle r2 = new Rectangle();
		r2.width = 30;
		r2.height = 20;
		System.out.print("넓이:");
		r2.area();
		System.out.print("둘레:");
		r2.length();
	}
}