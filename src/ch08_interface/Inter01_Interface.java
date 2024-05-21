package ch08_interface;


class A1 {
	void autoPlay(I1 i) {
		i.play();
	}}

interface I1 {    void play();	
}

/*
 * abstract interface I1 { public abstract void play();
 *  * }
 */

class B1 implements I1 {
	@Override
	public void play() {
		System.out.println("play in b class");
		
	}}

class C1 implements I1 {
	@Override
	public void play() {
		System.out.println("play in c class");
		
	}}

public class Inter01_Interface {
	/*
	모든 interface는  public interface이다
	interface의 변수는 public static final 이다
	interface의 메소드는 default method와, 
	static method외에 모든 메소드는 abstract method이다 
	*/
	public static void main(String[] args) {
		A1 a = new A1();
		a.autoPlay(new B1());
		a.autoPlay(new C1());
	}

}



