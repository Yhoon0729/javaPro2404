package train;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Flight_Generator {


	public static void main(String[] args) throws IOException {
		
		PrintStream ps = null;
		
		FileOutputStream fos = null;
		
		String[] country = {"일본","중국","대만","필리핀","베트남"};
	    String[][] city = {
	    		{"도쿄","오사카","후쿠오카"},
	    		{"베이징","상하이","하이난"},
	    		{"타이페이","가오슝","타이중"},
	    		{"마닐라","세부","보라카이"},
	    		{"호치민","다낭","하노이"}
	    };
	    String[] company = {"KoreanAir", "Asiana", "T-Way", "United", "AirAsia"};
	    String[] grade = {"First", "Business", "Economy"};
	    	    
	    try {
			fos = new FileOutputStream ( "src/airPlane/flight.txt" );
			ps = new PrintStream(fos);
			
			for( int i = 0 ; i < 100 ; i++ ) {
				// 국가
				int countryNo = ((int)(Math.random() * 5));
				
				ps.print( country[ countryNo ] + ","   ); // 나라
				
				//도시
				int cityNo = (int) (Math.random()*3);
				
				ps.print( city[ countryNo ][cityNo] + ","   ); // 도시
				
				// 항공사
				ps.print( company[(int) (Math.random()*5)] + ","   ); // 항곡사
				
				// 수하물 비용 (0 == 무료, 1 == 유료)
				ps.print( (int) (Math.random()*2) + ","   ); // 수하물비용 여부
				
				// 출발 시간
				int takeoffHour = (int) (Math.random() * 24 );
				int takeoffMinute = (int) (Math.random() * 59 );
				String takeoff = "";
				
				// 4자리로 맞추기 위함
				takeoff = (takeoffHour <10) 
						? "0" + takeoffHour : "" + takeoffHour;
				takeoff += (takeoffMinute <10) 
						? "0" + takeoffMinute : "" + takeoffMinute;
				
				ps.print( takeoff + ","   );
				
				// 좌석 등급
				int seatGrade = (int) (Math.random()*3);
				
				ps.print( grade[ seatGrade ] + ","   ); // 좌석등급
				// 가격
				int price = (int) (Math.random()*500 + 100)*1000; 
				
				if( seatGrade == 0 ) { price *= 6; }
				else if( seatGrade == 1 ) { price *= 3; }
				
				ps.print(  price + ","   ); // 가격
				// 비행시간
				int time = 1;
				
				// 일본 비행시간
				if( countryNo == 0 && cityNo == 0 ) { time += 2; }
				else if( countryNo == 0 && cityNo == 1 ) { time += 1; }

				// 중국 비행시간				
				else if( countryNo == 1 && cityNo == 0 ) { time += 1; }
				else if( countryNo == 1 && cityNo == 1 ) { time += 2; }
				else if( countryNo == 1 && cityNo == 2 ) { time += 3; }
				
				// 대만 비행시간
				else if( countryNo == 2 && cityNo == 0 ) { time += 2; }
				else if( countryNo == 2 && cityNo == 1 ) { time += 3; }
				else if( countryNo == 2 && cityNo == 2 ) { time += 4; }
				
				// 필리핀 비행시간
				else if( countryNo == 3 && cityNo == 0 ) { time += 3; }
				else if( countryNo == 3 && cityNo == 1 ) { time += 4; }
				else if( countryNo == 3 && cityNo == 2 ) { time += 5; }

				// 베트남 비행시간
				else if( countryNo == 4 && cityNo == 0 ) { time += 4; }
				else if( countryNo == 4 && cityNo == 1 ) { time += 5; }
				else if( countryNo == 4 && cityNo == 2 ) { time += 6; }
				
				ps.print( time   ); // 비행 시간
				
				ps.println();
			}
			System.out.println( "파일 생성 완료" );
			
			ps.flush();
			ps.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	} // end of main
} // end of class
