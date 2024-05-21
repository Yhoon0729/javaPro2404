package ch05_array;
public class ExArray03 {
	/*
	 * 1 ~ 10 사이의 임의의 수 100개를 만들어서 
	 * 각수마나 나온 횟수 만큼 '*'를 프린트 하세요 
	3 9 2 1 5 1 8 9 5 6 
	1:**
	2:*
	3:*
	4:
	5:**
	6:*
	7:
	8:*
	9:**
	10:
	 * 
	 */
	public static void main(String[] args) {
		int[] arr= new int[10];  //0,0,0,0....
		for (int i = 0; i < 100; i++) {
			int temp = (int)((Math.random()*10)+1);
			//0,1,2,3,4,....
			//1,2,3,4,5,
			arr[temp-1]++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print((i+1) + ":");
			for(int j=0;j<arr[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}