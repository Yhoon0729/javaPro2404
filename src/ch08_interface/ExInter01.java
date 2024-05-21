package ch08_interface;

public class ExInter01 {
	public static void main(String[] args) {
		Animal a = new Dove();  //100
		a.eat();
		if (a instanceof Flyable) { // true
			System.out.println(a.name + "은 날아 다니는 새입니다.");
		//	Flyable f = (Flyable) a;
			//f.fly();
			}
		a = new Monkey();  //200
		a.eat();
		if (a instanceof Flyable) {// false
			//((Flyable) a).fly();
			}
	}
}
abstract class Animal {
	String name;
	Animal(String name) {		this.name = name;	}
	abstract void eat();
}
interface Flyable {
	//	void fly();
}

class Dove extends Animal implements  Flyable{
	Dove() {
		super("비둘기");	
	}
	@Override
	void eat() {
		System.out.println(name + "는 작은 벌레를 잡아 먹는다.");
		
	}
	//@Override
	public void fly() {
		System.out.println(name + "은 날아 다니는 새입니다.");
		
	}}
class Monkey extends Animal {
	Monkey() {
		super("원숭이");
		// TODO Auto-generated constructor stub
	}
	@Override
	void eat() {
		System.out.println(name+"는 나무에서 열매를 따 먹는다.");
		
	}}















