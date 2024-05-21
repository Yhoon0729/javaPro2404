package ch06_obj1;

public class O17_Init {

	public static void main(String[] args) {
		Block b1 =  new Block();
		System.out.println("=============");
		Block b2 = new Block();
		Block b3 = new Block();
		Block b4 = new Block();
		Block b5 = new Block();

	}

}
/*
처음 class선언시에 한번 static {} 이 실행 됨
new Block()  시에는 매번 instance {}, 생성자가  실행됨
*/
class Block {
	
	
	public Block() {
	System.out.println("생성자");
	}
	
	static {
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
}
