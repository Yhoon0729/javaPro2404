package ch06_obj1;
/*
 * Rectangle 객체를 3개 저장할 배열 을 생성하기
 * 0번직사각형 : 가로 : 10, 세로 : 20
 * 1번직사각형 : 가로 : 11, 세로 : 21 
 * 2번직사각형 : 가로 : 12, 세로 : 22 
 * 인 객체를 생성하고, 
 * 각각의 넓이와 둘레 출력하기
 * */
public class ExOop02 {
	public static void main(String[] args) {
		//Rectangle 객체를 3개 저장할 배열
		//Rectangle 객체를 참조할 참조변수의 배열
		Rectangle[] rarr = new Rectangle[3];
		for(int i=0;i < rarr.length;i++) {
			rarr[i] = new Rectangle(10 + i,20 + i ); //Rectangle 객체화
		//	rarr[i] = new Rectangle(); //Rectangle 객체화
		//	rarr[i].width=10+i;
		//	rarr[i].height=20+i;
			
			System.out.print(i+"번 사각형 넓이:");
			rarr[i].area();
			System.out.print(i+"번 사각형 둘레:");
			rarr[i].length();
		}
	}
}