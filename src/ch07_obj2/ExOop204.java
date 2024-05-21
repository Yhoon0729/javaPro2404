package ch07_obj2;

public class ExOop204 {
	/*
	 * 모든 식품(Food)은 가격(price)과 포인트(point)를 멤버로 가진다.
	 * 식품의 객체 생성시 가격을 입력받아야 하고, 가격의 10%를 포인트로 저장한다.
	 * 
	 * 식료품의 종류는 과일(Fruit),음료(Drink),과자(Snack)로 나눠 진다.
	 * 
	 * 과일 클래스는 당도(brix)를, 음료는 용량(ml), 과자는 무게(gram)을 멤버로 가진다
	 * 과일의 종류로는 사과(Apple),복숭아(Peach), 
	 * 음료의 종류로는 콜라(Coke) 와 사이다(Cider)
	 * 과자의 종류로는 비스킷(Biscuit)과 쿠키(Cookie) 가 있다.
	 * 사과,복숭아, 콜라, 사이다,비스킷,쿠키 클래스에 toString() 메서드를 구현하고
	 * 각각의 이름을 리턴한다.
	 * 
	 * 사과와 복숭아 생성시 가격과 당도를 , 
	 * 콜라,사이다 생성시 가격과 용량을
	 * 비스킷과 쿠키 생성시 가격과 무게를 입력받아 객체를 생성한다.  
	 * Food, Fruit, Drink,Snack,Apple,Peach,Coke,Cider, Biscuit,Cookie 클래스
	 * 10개를 구현하기 
	 */
	public static void main(String[] args) {
		Apple apple = new Apple(1000, 10.5);// 가격, 당도(brix)
		System.out.println("사과 가격:" + apple.price);
		System.out.println("사과 당도:" + apple.brix);
		
		Peach peach = new Peach(1000, 13.5);// 가격, 당도(brix)
		Coke coke = new Coke(500, 500); // 가격, 용량(ml)
		Cider cider = new Cider(1500, 1000);// 가격, 용량(ml)
		Biscuit bis = new Biscuit(10000, 500);// 가격, 무게(gram)
		Cookie cookie = new Cookie(500, 5000);// 가격, 무게(gram)
		System.out.println("============================");
		System.out.println(apple);
		System.out.println(peach);
		System.out.println(coke);
		System.out.println(cider);
		System.out.println(bis);
		System.out.println(cookie);

	}

}
class Food {
	int price, point;
	Food(int price) {
		this.price=price;
		point=price/10;
	}
}




class Fruit extends Food{
    double brix;
	Fruit(int price, double brix) {
		super(price);
		this.brix=brix;
	}	
}
class Apple extends Fruit{
	Apple(int price, double brix) {
		super(price, brix);
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사과";
	}
}
class Peach extends Fruit{

	Peach(int price, double brix) {
		super(price, brix);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "복숭아";
	}
	
}


class Drink extends Food{
    int ml;
	Drink(int price, int ml) {
		super(price);
		this.ml=ml;
		
	}
	
	
}
class Coke extends  Drink{

	Coke(int price, int ml) {
		super(price, ml);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "콜라";
	}
	
}
class Cider extends  Drink{
	Cider(int price, int ml) {
		super(price, ml);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사이다";
	}
}





class Snack extends Food{
    int gram;
	Snack(int price, int gram) {
		super(price);
		this.gram=gram;
		// TODO Auto-generated constructor stub
	}
	
}
class Biscuit extends  Snack{
	Biscuit(int price, int gram) {
		super(price, gram);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "비스켓";
	}
	
}
class Cookie extends  Snack{
	Cookie(int price, int gram) {
		super(price, gram);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "쿠키";
	}
}


