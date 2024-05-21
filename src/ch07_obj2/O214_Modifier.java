package ch07_obj2;

import ch07_obj2.pack.Modifier2;

/*
 * 접근 제한자.
 *   private < (default) < protected < public
 *   class      package      상속        모두
 */
public class O214_Modifier {

	public static void main(String[] args) {
		Modifier m1 = new Modifier();
	//	System.out.println(m1.v1); //private
		System.out.println(m1.v2); //default
		System.out.println(m1.v3);  // same package
		m1.method();
		Modifier3 m3 = new Modifier3();
	//	System.out.println(m3.v1);//v1:Modifier2 -> private
	//	System.out.println(m3.v2); //v2:Modifier2  -> default
	//	System.out.println(m3.v3);//v2:Modifier2  -> protected 상속 아님
		System.out.println(m3.v4);
		System.out.println(Math.PI);
		//Math m = new Math();
		//Math는 생성자의 접근 제어자가 private임. 객체생성 불가
	}

}
class Modifier {
	private int v1 = 100;
	int v2 = 200;
	protected int v3 = v1;

	public void method() {
		System.out.println("ch07_obj2.Modifier.method() 메서드임");
		System.out.println("v1 =" + v1);
		System.out.println("v2 =" + v2);	}}


class Modifier3 extends Modifier2 {
	public void method() {
	//	System.out.println("v1="+v1); //v1:Modifier2 -> private
	//	System.out.println("v2="+v2);  //v2:Modifier2  -> default
		System.out.println("v3=" + v3);  //v3 :Modifier2  -> protected
		System.out.println("v4=" + v4);//v4 :Modifier2 -> public
	}}


