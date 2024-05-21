package ch10_exception;

public class Excp06 {

	public static void main(String[] args) {
		try {
			badmethod();
		} catch (Exception e) {
			System.out.println("main 에서 예외 처리");
			e.printStackTrace();
		}

	}
	private static void badmethod() throws Exception  {
		try {
		   throw new Exception("예외 강제 발생"); //예외 발생
		} catch (Exception e) {
			System.out.println("badmethod 에서 예외 처리");
		//	e.printStackTrace();
			throw e;  //예외 재발생.
		}		   
	}

}
