package ch03_op;
public class OpEx06 {
	public static void main(String[] args) {
		System.out.println("6 & 3 = "+(6 & 3));
		/*  6 : 0110
		 *  3 : 0011
		 *  --------
		 *  &   0010  : 2 */
		System.out.println("6 | 3 = "+(6 | 3));
		/*  6 : 0110
		 *  3 : 0011
		 *  --------
		 *  | : 0111  : 7   */
		System.out.println("6 ^ 3 = "+(6 ^ 3));
		/*  같으면 0, 다르면 1
		 *  6 : 0110
		 *  3 : 0011
		 *  --------
		 *  ^ : 0101  : 5   */
		System.out.println("~10 =" + ~10); //-11
		/* 0 --> 1, 1 --> 0
		 * 10 : 00001010
		 * ---------------
		 * ~  : 11110101   : ?		 * 		 */	}}