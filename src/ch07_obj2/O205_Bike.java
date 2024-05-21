package ch07_obj2;

public class O205_Bike {

	public static void main(String[] args) {
		AutoBike  ab = new AutoBike(2);
		
		System.out.println(ab.drive());
		System.out.println("바퀴 "+ab.wheel + "개가 굴러간다 ");
		System.out.println(ab.stop());
		System.out.println("===============");
		Bike  b = new Bike(3);
		
		System.out.println(b.drive());
		System.out.println("바퀴 "+b.wheel + "개가 굴러간다 ");
		System.out.println(b.stop());
	}

}
class Bike {
	int wheel;
	public Bike(int wheel) {
		this.wheel=wheel;
	}
	String drive() {
		return "bike 페달을 밟는다";
	}
	String stop() {
		return "bike 브레이크를 밟는다";
	}
}
class AutoBike extends Bike {
	boolean power;  //false
	public AutoBike(int wheel) {
		super(wheel);
		// TODO Auto-generated constructor stub
	}
	void power() { power =!power; }
	
	@Override
	String drive() {
		if (!power) power();
		return "출발 버튼을 누른다";
	}
	@Override
	String stop() {
		if (power) { 
			power();
			return "정지 버튼을 누른다";
		} else {
		return "이미 정지되어 있음";
		}
	}
	
}










