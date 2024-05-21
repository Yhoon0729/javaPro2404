package ch16_lambda;
public class LambdaEx02 {
	public static void main(String[] args) {
		System.out.println("main 시작");
		Runnable r0 = new Runnable() {
			@Override
			public void run() {
				int sum=0;
				for(int i=1;i<=100;i++) {
					sum+=i;			}
				System.out.println("1부터100까지의 합1:" + sum);
			}	};
		Runnable r = ()->{
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum+=i;			}
			System.out.println("1부터100까지의 합1:" + sum);};
			
		Thread t = new Thread(r);
		Thread t2 = new Thread(()-> {
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum+=i;
			}
			System.out.println("*****1부터100까지의 합2:" + sum);
		});
		t.start();		t2.start();	System.out.println("main 종료");	}}