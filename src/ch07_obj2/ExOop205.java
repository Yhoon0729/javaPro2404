package ch07_obj2;

public class ExOop205 {
	/*
	 * Buyer2 클래스 구현하기
	 * 고객은 돈(money=10000)과 포인트(point)와 장바구니(cart:20개)를 멤버로 가진다. 
	 * 총 식료품 구매 건수(cnt)를 가진다. 
	 * 메서드 : 
	 * void buy(.....) : 
	 * 
	 * 물건 구매시 보유금액에서 물품가격만큼 차감 
	 * 물품의 포인트 만큼 포인트 증가. 
	 * 소유 금액보다 물품값이 큰경우 "잔액부족"메세지 출력하고 메서드 종료 
	 * 물품의 물품명과 가격을 화면에 출력. 해당 물품은 장바구니에 추가. 
	 * 
	 * 
	
	출력
	    사과 가격:1000
		사과 당도:10.5
		============================
		사과:   가격1000 구입
		복숭아:   가격1000 구입
		콜라:   가격500 구입
		사이다:   가격1500 구입
		비스켓  잔액 부족
		쿠키:   가격500 구입
		===========================
		고객 잔액:5500
		고객 포인트:450
		========================
		총구매 금액 :4500,총구매건수5
		과일구매 금액 :2000,과일구매건수2
		과일 구매 목록:사과,복숭아,
		음료구매 금액 :2000,음료구매건수2
		음료 구매 목록:콜라,사이다,
		과자구매 금액 :500,과자구매건수1
		과자 구매 목록:쿠키,

	 */
	public static void main(String[] args) {
		Apple apple = new Apple(1000, 10.5);// 가격, 당도(brix)
		System.out.println("사과 가격:" + apple.price);
		System.out.println("사과 당도:" + apple.brix);
		Peach peach = new Peach(1000, 13.5);// 가격, 당도(brix)
		Coke coke = new Coke(500, 500); // 가격, 용량(ml)
		Cider cider = new Cider(1500, 1000);// 가격, 용량(ml)
		Biscuit bis = new Biscuit(10000, 500);// 가격, 무게(gram)
		Cookie cookie = new Cookie(500, 5000);// 가격, 무게(gram)
		System.out.println("============================");
		Buyer2 b = new Buyer2();		
		b.buy(apple);		b.buy(peach);
		b.buy(coke);		b.buy(cider);
		b.buy(bis);		b.buy(cookie);
		System.out.println("===========================");
		System.out.println("고객 잔액:" + b.money);
		System.out.println("고객 포인트:" + b.point);
		System.out.println("========================");
		b.summary();	

	}

}
class Buyer2 {
	 int money = 10000;
	 int point=0;
	 Food[] cart = new Food[20]; //물건3개 구매 가능 
	 int cnt; 
	 void buy(Food f) {
		 if (money < f.price) {
			 System.out.println(f + "  잔액부족");
			 return;
		 }
		 money -=f.price;
		 point +=f.point;
		 System.out.println(f +" 구입함");
		 cart[cnt++]=f;
		 
	 }
	 void summary() {
		    int total = 0;
		    int ftotal[] = new int[3];
		    int fcnt[] = new int[3];
		    String flist[] = {"","",""};
			for (int i=0 ; i<cnt ; i++) {
	       System.out.println(cart[i] + " 상품 : 가격=" 
	       + cart[i].price + ",포인트=" + cart[i].point);
	       total += cart[i].price;
	       int index=2;
	       if (cart[i] instanceof Fruit) {
	    	   index=0;
	       } else if (cart[i] instanceof Drink) {
	    	   index=1;
	       }
	       fcnt[index]++;
	       ftotal[index] +=cart[i].price;
	       flist[index] +=cart[i]+ ",";
			}
			System.out.println("총물품구매액:" + total
			+ "   총구매건수:" + cnt);	
			System.out.println("과일구매 금액 :" + ftotal[0] + ",과일구매건수" + fcnt[0]);
			System.out.println("과일 구매 목록:" + flist[0]);
			System.out.println("음료구매 금액 :" + ftotal[1] + ",음료구매건수" + fcnt[1]);
			System.out.println("음료 구매 목록:" + flist[1]);
			System.out.println("과자구매 금액 :" + ftotal[2] + ",과자구매건수" + fcnt[2]);
			System.out.println("과자 구매 목록:" + flist[2]);
			
			
	 }//end main
	 
}//end class

