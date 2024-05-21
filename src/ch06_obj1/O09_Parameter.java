package ch06_obj1;

public class O09_Parameter {

	public static void main(String[] args) {
		Value  v = new Value();
		v.val=100;
		change1(v.val);
		System.out.println(v.val);
		change2(v);
		System.out.println(v.val);

	}
	
	static void change1(int val) {
		
		val +=100;
		System.out.println("1:change1():"+val);
	}
	static void change2(Value v) {
		v.val +=100;
		System.out.println("2:change2():"+v.val);
	}

	
	
	
}
class Value {
	int val;
	
}
