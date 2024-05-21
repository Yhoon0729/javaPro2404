package ch07_obj2;
/*
 * Buyer 클래스 : 
 * 멤버변수 :  int money = 500,
 *          int point=0;
 *          Product[3] cart = new Product[3]; 물건3개 구매 가능 
 *          int cnt; 
 * 멤버메서드 : buy(......?) {}
 *               p상품의 가격만큼 money 차감. 
 *               p상품의 포인트 만큼 point 증가. 
 *               화면에 구입한 제품 출력. 
 *               cart에 제품 추가. 
*/
/*
Tv:100 구입함
Computer:200 구입함
SmartPhone:300 구입함

Tv:100 상품 : 가격=100,포인트=10
Computer:200 상품 : 가격=200,포인트=20
SmartPhone:300 상품 : 가격=300,포인트=30
총물품구매액:600
총물품목록:Tv:100,Computer:200,SmartPhone:300,

*/
public class ExOop203 {

	public static void main(String[] args) {
		Tv tv = new Tv(100);  //100
		Computer com = new Computer(200); //200
		SmartPhone sp = new SmartPhone(300); //300
		Buyer b = new Buyer();
		b.buy(tv);
		b.buy(com);
		b.buy(sp);
		b.summary();

	}

}
class Buyer {
	 int money = 500;
	 int point=0;
	 Product[] cart = new Product[3]; //물건3개 구매 가능 
	 int cnt; 
	 void buy(Product p) {
		 money -=p.price;
		 point +=p.point;
		 System.out.println(p +" 구입함");
		 cart[cnt++]=p;
		 
	 }
	 void summary() {
		 int sum = 0;
			String productList = "";
			for (Product p : cart) {
				if (p == null) break;
	System.out.println(p + " 상품 : 가격=" + p.price + ",포인트=" + p.point);
				productList += p + ",";
				sum += p.price;
			}
			System.out.println("총물품구매액:" + sum);
			System.out.println("총물품목록:" + productList);
		 
	 }
	 
}
