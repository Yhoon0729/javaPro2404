package ch06_obj1;

public class ExOop08 {

	public static void main(String[] args) {
		// 주문을 위한 메뉴 선정
				Menu jjajang = new Menu("짜장", 4900);  
				//Menu(String name, int price)
				Menu jjambbong = new Menu("짬뽕", 5900);
				Menu tangsook = new Menu("탕수육", 13900);

				// 메뉴를 조합하여 주문을 생성
				Menu[] menuArr = { jjajang, jjambbong, tangsook };
				Order order = new Order(123, menuArr); 
				//Order(int orderNum, Menu[] menus)
				//method: totalPrice

				// 주문 결과 출력
				System.out.printf("주문 합계: %d원\n", order.totalPrice());
	}
}
class Menu {
	String name;
	int price;
	public Menu(String name, int price) {
		this.name=name;
		this.price=price;
		// TODO Auto-generated constructor stub
	}
	
}
class Order{
	int orderNum;
	Menu[] menus;
	public Order(int orderNum,Menu[] menus ) {
		this.orderNum=orderNum;
		this.menus=menus;
	}
	int totalPrice() {
		int sum=0;
		for (Menu m : menus) {
			sum +=m.price;
		}
		return sum;
	}
	
}





/*
주문 합계: 24700원
*/
