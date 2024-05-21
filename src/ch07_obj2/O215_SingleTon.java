package ch07_obj2;

public class O215_SingleTon {

	public static void main(String[] args) {
		
		SingleObject s1 = SingleObject.getInstance();
		SingleObject s2 = SingleObject.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		A a1 = new A();
		A a2 = new A();
		System.out.println(a1);
		System.out.println(a2);
		if (a1==a2) {
			System.out.println
			("a1참조변수의 객체와 a2 참조변수의 객체는 같은 객체임.");
		}
		if (s1==s2) {
			System.out.println
			("so1참조변수의 객체와 so2 참조변수의 객체는 같은 객체임.");
		}
		
		System.out.println(s1.getValue());//100
		System.out.println(s2.getValue());//100
		s1.setValue(500);
		System.out.println(s1.getValue());//500
		System.out.println(s2.getValue());//500
		
		
	}

}
class A{}


class SingleObject {
	//Singleton은 이미 만들어진 참조 변수외에 다른 참조 변수를 만들수 없을때 작성함
	 private static SingleObject obj = new SingleObject();
	 private SingleObject() { }
	 private int value=100;
	 public static SingleObject getInstance() {
		 return obj;
	 }
	 public int getValue() { return value ; }
	 public void setValue(int value) 
	 {   this.value=value; }	
}
