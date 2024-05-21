package ch11_API;

import java.util.Calendar;

public class Api33_Calendar

{
	static String[][] amon = new String[12][7];
	static int year;

	public static void main(String[] args)
	{	year = Integer.parseInt("2024");
		int END_DAY = 0;
		Calendar sDay = Calendar.getInstance(); // 시작일
		Calendar eDay = Calendar.getInstance(); // 끝일
		// 월의 경우 0 부터 11까지의 값을 가지므로 1을 빼주어야 한다.
		// 예를 들어, 2024년 11월 1일은 sDay.set(2004, 10, 1);과 같이 해줘야 한다.
	
		
		
		
		
		for (int mon = 0; mon < 12; mon += 1) {  //1 ~ 12 , 0 ~ 11
			sDay.set(year, mon, 1);
			eDay.set(year, mon + 1, 1);
			// 다음달의 첫날에서 하루를 빼면 현재달의 마지막 날이 된다.
			// 12월 1일에서 하루를 빼면 11월 30일이 된다.
			eDay.add(Calendar.DATE, -1);
			// 첫 번째 요일이 무슨 요일인지 알아낸다.
			int START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
			int END_DAY_OF_WEEK = eDay.get(Calendar.DAY_OF_WEEK);
			// eDay에 지정된 날짜를 얻어온다.
			END_DAY = eDay.get(Calendar.DATE);
			// System.out.println(END_DAY+":"+END_DAY_OF_WEEK);
			int col = 0;
			String montstr = "";
			// 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다.
			// 만일 1일이 수요일이라면 공백을 세 번 찍는다.(일요일부터 시작)
			for (int j = 1; j < START_DAY_OF_WEEK; j++) {
				montstr += "   ";	}
			
			for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
				montstr += (i < 10) ? "  " + i : " " + i;
				if (n % 7 == 0) {
					amon[mon][col] = montstr;
					//System.out.println(montstr);
					montstr = "";col++;	}}

			for (int j = END_DAY_OF_WEEK; j < 7; j++) {
				montstr += "   ";	}
			amon[mon][col] = montstr;
			//System.out.println(montstr);

		}
		
		printCalendar();	}// end for 
	public static void printCalendar() {
		for (int i = 0; i < 10; i += 3) {
			System.out.print("      " + year + "년 " + (i + 1) + "월" + "\t\t");
			System.out.print("      " + year + "년 " + (i + 2) + "월" + "\t\t");
			System.out.println("      " + year + "년 " + (i + 3) + "월" + "\t");
			System.out.print(" SU MO TU WE TH FR SA  \t");
			System.out.print(" SU MO TU WE TH FR SA  \t");
			System.out.println(" SU MO TU WE TH FR SA  \t");
			for (int j = 0; j < 7; j++) {
				if (amon[i][j] == null)
					amon[i][j] = "";
				if (amon[i + 1][j] == null)
					amon[i + 1][j] = "";
				if (amon[i + 2][j] == null)
					amon[i + 2][j] = "";
				System.out.println(String.format("%21s", amon[i][j]) 
						+ "\t" + String.format("%21s", amon[i + 1][j])
						+ "\t" + String.format("%21s", amon[i + 2][j]) 
						+ "\t");
			}
			System.out.println();		}	}

}//end class