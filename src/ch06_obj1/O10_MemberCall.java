package ch06_obj1;

public class O10_MemberCall {
	static int cv1 = 10;
	static int cv2 = cv1;
	int iv1 = 100;
	int iv2 = iv1;
	int iv3 = cv1;
	//static int cv3 = iv1;
	static int cv3 = new O10_MemberCall().iv1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void method1() {
		System.out.println(cv1+cv2);
		System.out.println(iv1+iv2);
	}
	static void method2() {
		System.out.println(cv1+cv2);
	//	System.out.println(iv1+iv2);
		O10_MemberCall m = new O10_MemberCall();
		System.out.println(m.iv1+m.iv2);
		
	}

}
