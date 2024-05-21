package ch04_controll;
public class LoopEx2 {
	/*
	 * 반복문(for, while, do while) 을 이용하여 1부터 10까지의 합 구하기
	 */
	public static void main(String[] args) {
		System.out.println("for 구문으로 1부터 10까지의 합 구하기");
		int sum=0;	int i = 1;		
		for (i = 1; i <= 10; i++) {
			sum+=i;		}
		System.out.println("합:"+sum);
		
		sum=0;		i = 1;
		System.out.println("while 구문으로 1부터 10까지의 합 구하기");
		while (i <= 10) {	sum+=i;
			i++;		}
		System.out.println("합:"+sum);
		sum=0;		i = 1;
		System.out.println("do while 구문으로 1부터 10까지의 합 구하기");
		sum=0;		i = 1;
		do {
			sum+=i;
			i++;
		} while (i <= 10);
		System.out.println("합:"+sum);
		sum=0;
		i = 1;
	}
}