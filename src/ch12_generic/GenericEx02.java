package ch12_generic;
/*
제네릭을 이용 
타입을 정하지 않고  class를 구현하는 방법이다 
class의 멤버, 메소드 파라메터, 리턴 타입, 인터페이스의 타입을 실행시에 적용 할 수 있다
실행 사용시 제네릭 생략가능함  
제네릭 타입은 기본타입 불가함
*/
class Pool02<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}



public class GenericEx02 {
	public static void main(String[] args) {
		Pool02<String> gen1 = new Pool02<>();
		gen1.set("그랜져"); // Object <--- String type
		String name = gen1.get();
		System.out.println(name);
		gen1.set("소나타"); 
		name = gen1.get();
		System.out.println(name);
		
		Pool02<Integer> gen2 = new Pool02<>();
		gen2.set(100);
		System.out.println(gen2.get());
		
	}
}
