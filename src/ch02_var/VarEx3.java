package ch02_var;

public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 리터럴은  int
		// 실수 리터럴은  double
				byte b1 = 10;
				short s1 = 20;
				int i1 = 100;
				long l1= 1000;
				i1 = b1; //int(4byte) <= byte(1byte) auto casting type 
				s1 =  (short) l1; // 2byte   <= 4byte  명시적 casting
				float f = l1; //표현값의 범위
				l1 =  (long) f; //표현값의 범위
	}

}
