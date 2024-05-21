package ch06_obj1;

public class O05_Sonata {

	public static void main(String[] args) {
		Sonata2 car1 = new Sonata2();
		car1.color = "white";		car1.number = 1234;
		car1.serialNo = ++Sonata2.sno;
		Sonata2 car2 = new Sonata2();
		car2.color = "black";		car2.number = 2345;
		car2.serialNo = ++Sonata2.sno;
		System.out.println(car1);
		System.out.println(car2);
		Sonata2 car3 = new Sonata2();
		car3.color = "red";
		car3.number = 5678;
		car3.serialNo = ++Sonata2.sno;
		System.out.println(car3);
		System.out.println("==================");
		Sonata2 car4 = car3;
		System.out.println(car4); // car3과 같은 내용

	}

}
class Sonata2 {
	String color;
	int number;
	int serialNo;
	static int sno;
	static int width = 250;	
	static int height = 150;
	
	public String toString() {
		return "자동차고유번호:" + serialNo + "," + color + ":" + number
				+ "(" + width + "," + height + " :자동차 생산번호=" + sno
				+ ")";	}}