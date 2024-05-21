package ch15_thread;
/*
 * wait(), notify(), notifyAll()
 *   1. 동기화 영역(동기화블럭, 동기화 메서드)에서만 호출이 가능
 *   2. Object 클래스의 멤버 메서드 => 모든 객체는 wait, notify, notifyAll 메서드 실행가능
 *   3. wait() : 현재 실행 중인 Thread를 대기상태로 변환. 
 *               lock 해제함. notify, notifyAll 메서드를 이용하여
 *               대기상태에서 Runnable 상태로 변환이 가능함.
 *      notify() : wait() 상태인 스레드 중 한개만 Runnable 상태로 변환. 개발자가 지정 불가.
 *      notifyAll() : wait() 상태인 스레드 모두를 Runnable 상태로 변환.         
 */
public class ThreadEx09 {
	public static void main(String[] args) {
		ATM2 atm = new ATM2();		
		Thread son = new Thread(atm,"SON"); 
		Thread daughter = new Thread(atm,"DAUGHTER");
		son.start(); daughter.start();
	}
}
class ATM2 implements Runnable {
	private long money = 120000; //110000
	@Override
	public void run() {
		synchronized (this) { //동기화 블럭  daughter
			for(int i=0;i<10;i++) {
				if(money <= 0) { //60000
					System.out.println("잔액이 없습니다.");
					notify();	break;	}
				withDraw(10000);
				
				if(money % 20000 == 0) {
					try {	wait(); //
					}catch(InterruptedException e) {}
				} else {
					notify(); //daughter Runnable 상태
				}	}		}	}
	private void withDraw(int m) {
		if(money <= 0) return;
		money -= m;
		System.out.println(Thread.currentThread().getName() 
				+ " 출금. 잔액:" + money);		
	}
}
