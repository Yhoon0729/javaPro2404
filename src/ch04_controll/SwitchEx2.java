package ch04_controll;

public class SwitchEx2 {
	/*
	 * switch 구문에 사용되는 자료형
	 *    => byte, short, int, char, String 
	 *    
	 * switch 구문에 사용되지 않는 자료형
	 *    => boolean, long, float, double
	 *    
	 * 조건문 : if, switch
	 *    모든 switch 구문은 if문으로 변경 가능함.     
	 *    모든 if 구문을 switch 구문으로 변경할 수 없다. 
	 *    변경 가능것도 있고 변경 불가한 것도 있음 (switch는 범위 지정이 않됨)
	 */
	public static void main(String[] args) {
		int value=1;
		switch (value) {
		case 1 : System.out.println(value);  break;
		case 2 : System.out.println(value);  break;
		default:
			System.out.println(value);  break;
		}
	}
}