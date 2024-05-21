package ch07_obj2;

public class O212_Abstract {
	/*
	 * 추상 클래스간의 상속도 가능함. 
	 * 추상클래스가 자손 클래스인 경우 부모의 추상 메서드를 구현하지 않아도 됨.
	 * 단 추상 클래스를 상속받은 일반 클래스는 모든 추상 메서드를 구현해야 함.
	 */
	public static void main(String[] args) {
		Abs1 a1 = new Normal();
		System.out.println(a1.getA()); //10
	//	System.out.println(a1.getB()); 
		Abs2 a2 = (Abs2)a1;
		System.out.println(a2.getA()); //10
		System.out.println(a2.getB()); //20
		Normal n = (Normal)a2;
		System.out.println(n.getA()); //10
		System.out.println(n.getB()); //20
	//	a2 = new Abs2(); 

	}

}
abstract class Abs1 {
	int a = 10;
	abstract int getA();
}
abstract class Abs2 extends Abs1 {
	int b = 20;
	abstract int getB();
}
class Normal extends Abs2 {

	@Override
	int getB() {
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	
}
