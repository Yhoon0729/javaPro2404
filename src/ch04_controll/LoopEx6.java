package ch04_controll;
public class LoopEx6 {

/*  1~10까지의 랜덤한 수를 만든다
 * 0<= Math.random() < 1 : 랜덤한 실수를 만들어냄 
 * 0<= Math.random()*10 < 10 : 랜덤한 실수를 만들어냄  
 * 0<= (int)(Math.random()*10) < 10 : 랜덤한 정수를 만들어냄 
 * 1<= (int)(Math.random()*10)+1 <= 10 : 랜덤한 정수를 만들어냄  
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = (int) (Math.random() * 10) + 1;
		int col = (int) (Math.random() * 10) + 1;
		System.out.println("row:" + row + ",  col:" + col);
		/*  row=3, col=5
		
		*****
		*****
		*****
		
		**/
		
		for (int i = 1; i <= row; i++) {
			
			for (int j = 1; j <= col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
		