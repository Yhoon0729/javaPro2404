package ch03_op;
class OpEx10 {
	public static void main(String args[]) { 
		long a = 1000000 * 1000000;
		long b = 1000000 * 1000000L;

		System.out.println("a="+a); //int type overflow
		System.out.println("b="+b); //long type 변경됨
	}
}