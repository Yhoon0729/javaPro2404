package ch06_obj1;

public class O11_MemberCall {
	int iv1;
	int iv2;
	static int cv1;
	static int cv2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O11_MemberCall m = new O11_MemberCall();
		cv2 = m.iv1; 
		m.method1();
		method2(); 
	}
	void method1() {
		System.out.println(cv1 + cv2);
		System.out.println(iv1 + iv2);
	}
	static void method2() {
		O11_MemberCall m = new O11_MemberCall();
		System.out.println(cv1 + cv2);
		System.out.println(m.iv1 + m.iv2); 
	}

}
