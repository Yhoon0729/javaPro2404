package ch07_obj2;
/*
 * 다형성 예제
 * 
 * 
 * Product 클래스
 *   멤버변수 : int 가격(price), int 포인트(point)
 *   생성자 : 가격을 입력받고, 가격의 10%를 포인트로 저장.
 * Tv 클래스 ( parent class:Product)
 *   생성자(int) :가격을 100 설정하기
 *   toString() 메서드에서 Tv를 리턴.   
 * Computer 클래스 ( parent class:Product)
 *   생성자(int) : 가격을 200 설정하기
 *   toString() 메서드에서 Computer를 리턴. 
 * SmartPhone 클래스     ( parent class:Product)
 *   생성자(int) : 가격을 150 설정하기
 *   toString() 메서드에서 SmartPhone를 리턴. 

출력
Tv
Computer
SmartPhone
 */

public class ExOop202 {
	public static void main(String[] args) {
	
		Tv tv = new Tv(100);  //100
		Computer com = new Computer(200); //200
		SmartPhone sp = new SmartPhone(300); //300
		System.out.println(tv);
		System.out.println(com);
		System.out.println(sp);
	}

}
class Product {
	int price, point;
	public Product(int price) {
		this.price=price;
		point=price/10;
		// TODO Auto-generated constructor stub
	}
}
class Tv extends  Product {

	public Tv(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tv:"+price;
	}
	
}

class Computer extends  Product {

	public Computer(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Computer:"+price;
	}
	
}

class SmartPhone extends  Product {

	public SmartPhone(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SmartPhone:"+price;
	}
	
}








