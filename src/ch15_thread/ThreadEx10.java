package ch15_thread;
public class ThreadEx10 {
	public static void main(String[] args) {
		Account acc = new Account();
		Thread mother = new Mother(acc);
		Thread son = new Son(acc);
		son.start(); mother.start();
	}
}
class Account {
	int money; //잔액
	synchronized void output() { //출금
		while(money == 0) {
			try {
				wait(); //son 스레드 대기
			} catch(InterruptedException e) {}
		}
		notifyAll(); //wait() 상태인 스레드 모두 Runnable 상태로 변환
		System.out.println(Thread.currentThread().getName() 
				+ ":" + money + "원 출금");
		money = 0;	}
	synchronized void input() { //입금
		while(money > 0) {
			try {
				wait(); //엄마스레드가 wait()
			} catch(InterruptedException e) {}
		}
		money = ((int)(Math.random() * 3) + 1) * 10000;//1만,2만,3만
		notifyAll();
		System.out.println(Thread.currentThread().getName() 
				+ ":" + money + "원 입금");
	}
}class Mother extends Thread {
	Account account;
	Mother(Account account) {
		super("엄마스레드");
		this.account = account;	}
	public void run() {
		for(int i=0;i<20;i++) {
			account.input();
			try {
				sleep((int)(Math.random() * 3000));//0 ~ 3초 동안 임의로 sleep
			} catch(InterruptedException e) {}
		}	}}
class Son extends Thread {
	Account account;
	Son(Account account) {
		super("아들스레드");		this.account = account;	}
	public void run() {
		for(int i=0;i<20;i++) {
			account.output();
			try {
				sleep((int)(Math.random() * 1000)); //0 ~ 1초
			} catch(InterruptedException e) {}
		}
	}}