package ch07_obj2;

public class O206_Bike {

	public static void main(String[] args) {
		AutoBike auto1 = new AutoBike(2);  //100
		AutoBike auto2;
		Bike bike; 		
		auto1.power();
		
		System.out.println(auto1.drive());
		System.out.println("바퀴 "+ auto1.wheel + "개가 굴러 간다 ");
		System.out.println(auto1.stop());
		bike=auto1;  //100   AutoBike
		//bike.power();
		bike = new Bike(2);//200
		auto2 = (AutoBike) bike;
		auto2.power();
		System.out.println(auto2.drive());
		System.out.println(auto2.stop());
	}

}
