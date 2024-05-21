package ch11_API;
public class Api10_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aaa"; //100
		System.out.println(str1=="aaa");  //true
		String str2 = new String("aaa");  //200
		System.out.println(str2=="aaa");  //false
		System.out.println(System.identityHashCode(str1));//3.
		str1 = str1+"sss";  
		//str1 = "aaa";
		System.out.println(str1);
		
		
		System.out.println(System.identityHashCode(str1));//4.
		
	}

}