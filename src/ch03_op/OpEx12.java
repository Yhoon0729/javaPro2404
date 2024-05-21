package ch03_op;
public class OpEx12 {
	public static void main(String[] args) {
		/*
		 *  7: 0111
		 * 
		 *  15  : 1111
		 *  7+1 : 1000
		 *  ================
		 *        0111 + 1 =  1000 =  - 8 
		 *   
		 */
		
		int n1 = 7;
		System.out.println('0'+Integer.toBinaryString(n1));
	
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toBinaryString(n1+1));
		System.out.println(Integer.toBinaryString(-8));
		
	}
}