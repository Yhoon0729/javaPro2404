package ch11_API;
import java.util.Random;

/*난수(임의의수)를 생성하는 기능을 가진 클래스다. 
* Math 클래스의 random() 메서드를 통해서 난수를 생성할 때는 double 자료형만 가능했으나, 
* Random 클래스를 이용하면  boolean, int, long, float, double 등 
* 자료형별 난수 발생이 가능 가능하다. 
* 또한 난수를 만드는 알고리즘에 사용되는 종자(seed)값을 설정하여 다양한 난수를 생성할 수 있다.*/
/*seed 값이 같은 Random 클래스는 같은 난수를 산출한다*/


public class Api35_Random {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(1); // seed 고정 설정
		Random rand2 = new Random();
		rand2.setSeed(System.currentTimeMillis());// seed 변경
		
		System.out.println("rand==>");
		for (int i = 0; i < 5; i++)
			// nextInt(100) : 0 ~99 정수형 난수 발생
			System.out.println(i + ":" + rand.nextInt(100));
		System.out.println();
		
		System.out.println("rand2==>");
		for (int i = 0; i < 5; i++)
			System.out.println(i + ":" + rand2.nextInt(100));
	}
}