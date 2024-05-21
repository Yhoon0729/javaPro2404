package ch08_interface;
/*
 * final 변경불가.
 * final method : 재정의 불가. 오버라이딩 불가 메서드.
 */
public class Inter07_FinalValue {
	 public static void main(String[] args) {
		 FinalValue f1 = new FinalValue(200);
			 f1.NUM = 200; //NUM은 상수.
	}
}
class FinalValue  {
	final int NUM;   //1.명시적 초기화
	{	
	//	NUM = 300;
		}   //2.초기화 블럭

	FinalValue(int num) {
	//	NUM = num;     // 3.생성자에서 변경 한번 가능함.
		// this.NUM=num;
	}
}
