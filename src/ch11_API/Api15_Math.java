package ch11_API;


class Api15_Math {
	public static void main(String args[]) {
		double val = 90.7552;
		
		System.out.println("round("+ val +")="	
		+ Math.round(val));  // 반올림
		val *= 100;  //9076.52
		System.out.println("round("+ val +")=" 
		+ Math.round(val));  // 반올림
		System.out.println(Math.round(val));
		System.out.println("round("+ val +")/100  =" 
		+ Math.round(val)/100);  // 반올림
		System.out.println("round("+ val +")/100.0="   
		+ Math.round(val)/100.0);  // 반올림
		System.out.println();
		
		
		// 1.1와 가장 가까운 큰 정수 
		System.out.printf("ceil(%3.1f)=%3.1f%n",  1.1, 
				Math.ceil(1.1)); //2.0
		// 1.5와 가장 가까운  작은 정수	
		System.out.printf("floor(%3.1f)=%3.1f%n", 1.5, 
				Math.floor(1.5)); //1.0
		// 반올림
		System.out.printf("round(%3.1f)=%d%n",    1.1, 
				Math.round(1.1));  //1
		// 반올림
		System.out.printf("round(%3.1f)=%d%n",    1.5, 
				Math.round(1.5));//1
		// 1.3와 가장 가까운 정수 
		System.out.printf("rint(%3.1f)=%f%n",     1.3, 
				Math.rint(1.3));
		System.out.printf("round(%3.1f)=%d%n",   -1.5, 
				Math.round(-1.5)); // 반올림
		// -1.5와 가까운 정수
		System.out.printf("rint(%3.1f)=%f%n",    -1.5, 
				Math.rint(-1.5));  
		System.out.printf("ceil(%3.1f)=%f%n",    -1.5, 
				Math.ceil(-1.5));  // 올림
		System.out.printf("floor(%3.1f)=%f%n",   -1.5, 
				Math.floor(-1.5)); // 버림
		
	}
}