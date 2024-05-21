package ch06_obj1;

public class O03_LocalVal {
	static String grade2;
	public static void main(String[] args) {
		
			//args : 지역변수
			int num=10;   //지역변수는 반드시 초기화 해야 한다 
			boolean b = true; //지역변수
			if(b) num = 100;
			System.out.println(num);
			String grade;
			int score = 80; //지역변수
			switch(score/10) {
			case 9 : grade ="A";break;
			case 8 : grade ="B";break;
			case 7 : grade ="C";break;
			case 6 : grade ="D";break;
	    	//default : grade="F";
			}		System.out.println("학점 :" + grade2);
		}

	}


