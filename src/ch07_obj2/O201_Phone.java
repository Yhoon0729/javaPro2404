package ch07_obj2;

public class O201_Phone {
	/*
	 * 상속 
	 * 
	 * 1 자손객체의 객체 생성시 부모객체를 먼저 생성한다.
	 * 2.자손객체는 부모 객체의 멤버에 접근 할 수 있다.
	 * 3.클래스간의 상속은 단일 상속만 가능하다.
	 *   자손클래스의 부모는 한개만 가능하다.
	 * 4.모든 클래스는 Object 클래스를 상속받는다. 
	 *   모든 객체는 Object 클래스의 객체를 포함한다.
	 *   모든 객체는 Object 클래스의 멤버에 접근이 가능하다.   
	 */
	public static void main(String[] args) {
		MobilePhone  mp = new MobilePhone();
		System.out.println(mp.toString());
		mp.power=true;
		mp.send();
		mp.receive();
		mp.setApp("네이버");
		
	}}
class Phone {
	boolean power;
	int number;
	void power() {		power = !power;	}
	void send() {
		if (power)			System.out.println("전화걸기");	}
	void receive() {		if (power)	
		System.out.println("전화받기");	}
	@Override
	public String toString() {
		return "Phone [power=" + power + ", number=" + number + "]";
	}
	
}

class MobilePhone extends Phone {
	
	
	
	void setApp(String name) {
		if (power)
			System.out.println(name + " 설치 중 ~~");	}
	
}



