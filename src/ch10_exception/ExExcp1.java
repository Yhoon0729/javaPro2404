package ch10_exception;
//한줄만 변경하여 컴파일 오류 없애기.
public class ExExcp1 {

	public static void main(String[] args) {
		
			method();
		
	}

	private static void method()  {

		throw new MyException1("ExExcp1.method() 예외 강제 발생 ");
	}

}
class MyException1 extends RuntimeException {
	MyException1(String msg) {
		super(msg);
	}
}