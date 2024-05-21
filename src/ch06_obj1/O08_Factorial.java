package ch06_obj1;
//call stack 영역
//재귀메서드(함수) : 자신이 자신메서드를 다시 호출하는 메서드
// => 스택 영역이 존재하므로 가능함.

public class O08_Factorial {

	public static void main(String[] args) {
		System.out.println("4!  ="+ factorial(4));

	}
	
	static int factorial(int i) {
		System.out.println(" i:"+i);
		return (i==1)?1:i*factorial(i-1); 
	}

}
