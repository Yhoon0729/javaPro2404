package ch07_obj2;
/*
 * 1. Animal 클래스 => 추상클래스
 *    멤버변수 : 동물의 종류(type), 다리수(leg)
 *    생성자 : 동물의 종류랑 다리수 입력받기.
 *    멤버메서드 :
 *        void eat(); => 추상메서드
 *        void sound(); => 추상메서드
 * 2. Dog클래스  :  Animal 클래스의 자손클래스
 *    생성자의 매개변수 없음.
 *    멤버메서드 :
 *        void eat() :  "주인이 주는대로 먹는다" 출력
 *        void sound(); "멍멍";
 * 3. Lion클래스  :  Animal 클래스의 자손클래스
 *    생성자의 매개변수 없음.
 *    멤버메서드 :
 *        void eat() :  "초식동물을 잡아 먹는다" 출력
 *        void sound(); "어흥";
 *          
 */
/*출력
Dog=>멍멍
주인이 주는대로 먹는다
Lion=>어흥
초식동물을 잡아먹는다*/



public class  ExOop201 {
	public static void main(String[] args) {
		Animal[] animal = new Animal[2];
		animal[0] = new Dog();
		animal[1] = new Lion();
		for (Animal a : animal) {
			System.out.print(a.type + "=>");
			a.sound();
			a.eat();
		}
	}
}

abstract class Animal {
	String type;
	int leg;
	public Animal(String type, int leg) {
		super();
		this.type = type;
		this.leg = leg;
	}
	abstract void eat();
	abstract void sound();
	
	
}
class Lion extends Animal {
	public Lion() {
		super("Lion", 4);
		// TODO Auto-generated constructor stub
	}
	@Override
	void eat() {
		System.out.println("초식동물을 잡아먹는다");
		
	}
	@Override
	void sound() {
		System.out.println("어흥");
		
	}	
}
class Dog extends Animal {
	public Dog() {
		super("Dog", 4);
		// TODO Auto-generated constructor stub
	}
	@Override
	void eat() {
		System.out.println("주인이 주는데로 먹는다");
		
	}
	@Override
	void sound() {
		System.out.println("멍멍");
		
	}	
}
