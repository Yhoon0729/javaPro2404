package ch11_API;

import java.util.StringTokenizer;

class Api26_StringTokenizer { 
	public static void main(String[] args){ 
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source, ",");
		//반복자 
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		System.out.println("==========================");
		
		String expression = "x=100*(200+300)/2";
		StringTokenizer st1 = 
				new StringTokenizer(expression, "+-*/=()", true);
		
		while(st1.hasMoreTokens()){
			System.out.println(st1.nextToken());
		}
	} // main의 끝
} 