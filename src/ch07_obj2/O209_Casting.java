package ch07_obj2;

public class O209_Casting {
// child 안에 parent있다 
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();  //100
		FireEngine fe2 = null;
		fe.water();
		car = fe;   // 조상타입 <- 자손타입 auto casting
		//car.water();	
		fe2 = (FireEngine) car; 
		//100  자손타입 ← 조상타입  명시적 casting
		fe2.water();

	}

}
