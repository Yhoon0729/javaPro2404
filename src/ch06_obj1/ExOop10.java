package ch06_obj1;

public class ExOop10 {
	/*
	 * 
	 * Account class
	 * 변수 
	 * num : 통장번호
	 * balance : 잔고
	 * 생성자
	 * Account("123-45", 10000);
	 * method
	 * a.transfer(b, 3000); // 송금: 3천원씩 a 계좌에서 -> b계좌로!
	 * toString : source generate한다 
	출력
	잔액이 부족합니다.
	Account {num: 123-45, balance : 1000}
	Account {num: 567-89, balance : 19000}

	*/
	public static void main(String[] args) {
		// 객체 생성
				Account a = new Account("123-45", 10000);
				Account b = new Account("567-89", 10000);

				// 송금: 3천원씩 a 계좌에서 -> b계좌로!
				boolean result = true;
				while (result) {
					result = a.transfer(b, 3000);
				}
				System.out.println("====================");
				// 결과 출력
				System.out.println(a.toString()); // num : balance print
				System.out.println(b.toString());

	}

}
class Account {
	String num;
	int balance;
	public Account(String num, int balance) {
		this.num = num;
		this.balance = balance;	}
	boolean transfer(Account b,int amount) {
		if (balance < amount) {
			System.out.println("잔액이 부족합니다");
			return false;
		}
		balance -=amount;
		b.balance +=amount;
		System.out.println(this);
		return true;		
	}
	@Override
	public String toString() {
		return "Account [num=" + num + ", balance=" + balance + "]";
	}
	
}










