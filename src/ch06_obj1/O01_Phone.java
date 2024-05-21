package ch06_obj1;
/*
 * 
 * 클래스 : 사용자 정의 자료형.
 *   속성 : 멤버변수
 *   기능 : 멤버메서드
 */
public class O01_Phone {

	public static void main(String[] args) {
		Phone p1;  //선언
		p1 = new Phone();  //생성 생성자
		p1.color="검정";
		p1.power=true;
		p1.no="01010101010";
		System.out.println(p1.color+","+p1.power+","+p1.no);
		p1.send("11111111");
		p1.receive("2222222");
		Phone p2 = new Phone();
		System.out.println(p2.color+","+p2.power+","+p2.no);
		p2.send("11111111");
		p2.receive("2222222");
		p2=p1;
		p2.send("11111111");		

	}

}

class Phone {
	//멤버 변수
	String color;
	boolean power;
	String no;
	//메소드
	//return 값이 없을때 void
	void power() { power = !power; }
	void send(String no) {
		System.out.println(no + "로 전화 송신중 ~~~");		
	}
	void receive(String no) {
		System.out.println(no + "전화 수신중 ~~~");
	}
}
