package ch13_Anno;

public class Anno01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Parent {
	void parentMethod() { }
}

class Child extends Parent {
	@Override
	void parentmethod() { } // 조상 메서드의 이름을 잘못적었음. 
}
