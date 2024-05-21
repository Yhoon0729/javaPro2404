package ch05_array;
/*
 * 가변 배열 예제
[9][9]=1
[8][8]=2,[9][8]=3
[7][7]=4,[8][7]=5,[9][7]=6
[6][6]=7,[7][6]=8,[8][6]=9,[9][6]=10
 */

/*
 *  
  46
  47  37
  48  38  29
  49  39  30  22
  50  40  31  23  16
  51  41  32  24  17  11
  52  42  33  25  18  12   7
  53  43  34  26  19  13   8   4
  54  44  35  27  20  14   9   5   2
  55  45  36  28  21  15  10   6   3   1
 */
public class ArrayEx11 {
	public static void main(String[] args) {
		int[][] arr = new int[10][]; // 가편배열
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];//초기화
		}
		int data=0;
		for (int col = arr.length-1 ; col >=0  ; col--) {
			//System.out.println(col);
			for (int row = col; row < arr.length; row++) {
				//System.out.print(row +":"+col +" ");
				arr[row][col]=++data;
				System.out.print("["+row+"]["+col+"]="
				+arr[row][col] + " ");
			}
			System.out.println();
			
		}
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.printf("%4d", arr[row][col]);
			}
			System.out.println();
		}
		
		

	}
}