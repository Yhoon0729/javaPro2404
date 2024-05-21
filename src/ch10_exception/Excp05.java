package ch10_exception;

/*
 * throws 예외 처리 
 * throws Exception를 처리한 메소드는 콜한 메소드에서 처리 하여야함   
 * 단 RuntimeException은 처리 하지 않아도 됨
 * throws 를 처리 하지 않으면 마지막 method에서 처리 한다
 */
public class Excp05 {
	public static void main(String[] args) {
				try {
				first();
			} catch (Exception e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
				System.out.println("==========");
			}  //1
			System.out.println("main");
	}
	private static void first()  {

		second();//2
		System.out.println("first");
	}
	private static void second()  {
		System.out.println("second 메서드");//3
		// NumberFormatException 예외 발생
		
		System.out.println(Integer.parseInt("abc"));

	}
}
