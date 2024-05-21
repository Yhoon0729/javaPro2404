package ch11_API;
public class Api11_String {
	public static void main(String[] args) {
		String str = "ABC";   //리터럴 값 대입시
		String str1 = "ABC";
		System.out.println("1)str  hashcode():"
		+System.identityHashCode(str)+","
		+System.identityHashCode(str1));
		System.out.println("main :" + str);
		change(str);  
		System.out.println("2)str  hashcode():"
		+System.identityHashCode(str)+","
				+System.identityHashCode(str1));
		System.out.println("change 이후 main 재설정 않함:" + str);
		str=change(str); 
		System.out.println("3)str 주소 재설정  hashcode():"
		+System.identityHashCode(str)+","
				+System.identityHashCode(str1));
		System.out.println("change 이후 main-재설정:" + str);	
	
		
		
	str="12345678";
	System.out.println("str :"+str+","+System.identityHashCode(str));
	System.out.println(str.substring(3));  // 재설정 하지 않음
	System.out.println("str :"+str +","+System.identityHashCode(str));
	str=str.substring(3); //재설정
	System.out.println("str :"+str +","+System.identityHashCode(str));
	
	
	
	}
	
	
	static String change(String str) {
		str += "456";  //주소가 변경된다
		System.out.println("change() s :" + str +":"
		+System.identityHashCode(str));
		return str;		
	}} //end