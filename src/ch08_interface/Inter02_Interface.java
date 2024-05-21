package ch08_interface;

public class Inter02_Interface {

	public static void main(String[] args) {
		A2 a = new A2();
		a.methodA2();

	}

}
class A2 {
	void methodA2() {
		I2 i = InstanceManager.getInstance();
		i.methodB2();
		System.out.println(i);
	}
}
interface I2 {
	void methodB2();
}

class InstanceManager {
	public static I2 getInstance() {
		return new C2();
	}
}
class B2 implements I2 {

	@Override
	public void methodB2() {
		System.out.println("method b2 입니다");
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "B2 입니다";
	}
	
}

class C2 implements I2 {

	@Override
	public void methodB2() {
		System.out.println("method C2 입니다");
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "C2 입니다";
	}
	
}





