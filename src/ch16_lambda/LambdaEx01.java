package ch16_lambda;
public class LambdaEx01 {
	public static void main(String[] args) {
		//기존의 방식으로 코딩
		LambdaInterface1 fi = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("1) 기존방식으로 코딩");
			}	};
		fi.method();		
		fi = ()->{
			String str = "2) method call1";
			System.out.println(str);
		}; fi.method();
		fi = ()->{
			System.out.println("3) method call2");
		};fi.method();
        fi = ()->{
        	System.out.println("4) method call3");
		};fi.method();
        fi = ()-> System.out.println("5) method call4");
        fi.method();
        excute(() ->  {System.out.println("6)  LamdaInterface1 parameter");});
        excute(() ->   System.out.println("7)  LamdaInterface1 parameter"));
	}
	static void excute(LambdaInterface1 f1) {
		f1.method();
	}
	
}
@FunctionalInterface
interface LambdaInterface1 {	void method();}