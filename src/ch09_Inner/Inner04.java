package ch09_Inner;


interface I {	void test();}
abstract class Abs {	abstract void test();}

public class Inner04 {

	public static void main(String[] args) {
		// I i = new I();
		//무명 클래스 
		I i = new I() {
			int iv = 100;
			@Override
			public void test() {
				System.out.println("iv=" + iv);
				System.out.println("this.iv=" + this.iv);
				System.out.println("I 내부 클래스의 test 메서드");	}
		};
		
		I i2 = new I() {
			int iv = 100;
			@Override
			public void test() {
				int iv=50;
				System.out.println("iv=" + iv);
				System.out.println("this.iv=" + this.iv);
				System.out.println("I2 내부 클래스의 test 메서드");	}
		};
		
		I i3 = () -> {
			int iv=50;
			System.out.println("iv=" + iv);
			System.out.println("lambda 내부 클래스의 test 메서드");
		};
		
		
		i3.test();
		System.out.println("======1");
		i.test();
		i2.test();
		System.out.println("======2");
		I i1 = new I1();
		i1.test();
		
		
		int iv =100;
		//iv++;
		Abs a1 = new Abs() {

			@Override
			void test() {
				System.out.println("iv=" + iv); 
				// 지역변수 final iv 출력
				System.out.println("Abs 내부 클래스의 test 메서드");
				
				
			}
			
		};
		a1.test();
		
		
	}

}

class I1 implements I {
	int iv = 100;
	@Override
	public void test() {
		int iv=50;
		System.out.println("iv=" + iv);
		System.out.println("this.iv=" + this.iv);
		System.out.println("I2 내부 클래스의 test 메서드");	}
}
