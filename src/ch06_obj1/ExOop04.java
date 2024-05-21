package ch06_obj1;

public class ExOop04 {

	public static void main(String[] args) {
		Rectangle2[] reArr = new Rectangle2[3];
		reArr[0]=new Rectangle2(10, 10);
		reArr[1]=new Rectangle2(20, 10);
		reArr[2]=new Rectangle2(25, 25);
		for (Rectangle2 r : reArr) {
			System.out.println(r);	}
	}

}
/*
 * Rectangle2 클래스 구현하기
 *  멤버변수 : width,height, serialNo, sno(객체화시 사각형의번호를 생성 )
 *  생성자 : 가로와 세로를 입력받고, 가로,세로 값을 초기화함.
 *  멤버메서드 : 
 *      int area() : 넓이 값 리턴
 *      int length() : 둘레 값 리턴
 *      boolean isSquare() : 정사각형 여부 리턴
 */
/*
 * 출력
 * 1번사각형 : (10,10) 넓이:100, 둘레:40 정사각형
   2번사각형 : (20,10) 넓이:200, 둘레:60 직사각형
   3번사각형 : (25,25) 넓이:625, 둘레:100 정사각형
 */
class Rectangle2 {
	int width;	int height;	int serialNo;
	static int sno;
	public Rectangle2(int width, int height) {
		this.width=width;		this.height=height;
		serialNo=++sno;
	}
	int area() {		return (width*height);	}
	int length() {		return (width+height)*2;	}
	
	boolean isSquare() {		return width==height;	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return serialNo+"번 사각형 : ("+width+","+height+") ==> 넓이:"
				+area()+", 둘레:"+length()+(isSquare()?" 정사각형":" 직사각형");
	}
}