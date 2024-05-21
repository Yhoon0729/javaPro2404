package ch10_exception;

public class Excp09_Resource {

	public static void main(String[] args) {
		//jdk 1.7 이상 사용 가능
		
				try (AutoCloseableUse cr = new AutoCloseableUse()) {
					System.out.println("process");
		 		} 	System.out.println();

	}

}
class AutoCloseableUse  implements AutoCloseable{
	
	@Override
	public void close()  {
		System.out.println("close()가 호출됨===");
		
	}
}
