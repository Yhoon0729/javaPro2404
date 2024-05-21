package ch06_obj1;

public class ExOop07 {
	/*	  
	 * Cube 
	 * 변수 : length 
	 * method: 
	 * int volume(), 
	 * int surfaceArea()
	 * 출력
	 * 정육면체 a의 부피(volume): 27, 겉넓이(surfaceArea): 54 
	 * 정육면체 b의 부피: 125, 겉넓이: 150
	 */
	public static void main(String[] args) {
		 // 두 정육면체 객체 생성
	    Cube a = new Cube(3);
	    Cube b = new Cube(5);
	    
	    System.out.printf
	    ("정육면체 a의 부피(volume): %d, 겉넓이(surfaceArea): %d \n", 
	    		a.volume(), a.surfaceArea());
	    System.out.printf
	    ("정육면체 a의 부피(volume): %d, 겉넓이(surfaceArea): %d \n", 
	    		b.volume(), b.surfaceArea());

	}

}
class Cube {
	int length;
	public Cube(int length) {
		this.length=length;
	}
	int volume() {
		return length*length*length;
	}
	int surfaceArea() {
		return length*length*6;
	}
}
