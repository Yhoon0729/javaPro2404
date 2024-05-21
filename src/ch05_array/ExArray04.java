package ch05_array;

public class ExArray04 {
	/*
	 * 1부터9까지 숫자 중 중복되지 않는 3자리 숫자를 임의로 생성하는 프로그램 작성하기
	 */
	public static void main(String[] args) {
		int[] arr = new int[9];
		//초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;
		}
		// swap 
		for (int i = 0; i < 1000 ; i++) {
			int f = (int) (Math.random()* 9);  //index 0 ~ 8
			int t = (int) (Math.random()* 9);
			int tmp  = arr[f];
			arr[f]=arr[t];
			arr[t]=tmp;
		}
		//3개 프린트
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}