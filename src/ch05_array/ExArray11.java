package ch05_array;
public class ExArray11 {

	/*
	 * 11 사이즈의 배열에 0~9 수를 2번 중복 하여넣고 
	 * 나머지는 1번 넣어서 배열의 내용을 프린트 하세요 
	 * array length는 11임
	 *  예) {7,4,6,0,8,7,4,6,0,8,2,}  순서는 상관 없음
	 */

	public static void main(String[] args) {
		// 0 ~ 9의 임의 6자리 만듬
		int num[] = new int[10];
		//1. 초기화
		for (int i = 0; i < num.length; i++) {
			num[i]=i;		}
		
		//2 swap
		 for(int i=0;i<1000;i++) {
			 int f = (int)(Math.random() * 10 ); 
			 int t = (int)(Math.random() * 10 ); 
			 int temp = num[f];
			 num[f] = num[t];
			 num[t] = temp;		  }
		 
		 int answer[] = new int[11];
		 System.arraycopy(num, 0, answer, 0, 5);
		 System.arraycopy(num, 0, answer, 5, 5);
		  answer[10]=num[5];		  
		  for (int ans : answer) {
				System.out.print(ans + ",");
			}			System.out.println();	
		
	}}
		