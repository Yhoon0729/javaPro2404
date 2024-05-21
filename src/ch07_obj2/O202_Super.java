package ch07_obj2;
/*
 * super() 생성자 : 부모클래스의 생성자 호출시 사용함.
 */
public class O202_Super {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x + ","+c.y);

	}
}
class Parent {
	int x;
	public Parent(int x) {
		this.x=x;
	}
	
}
class Child extends Parent {
	

	public Child() {
		super(10);
		// TODO Auto-generated constructor stub
	}

	int y;
			
}







