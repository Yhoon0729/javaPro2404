package train;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Trip {

	public static void main(String[] args) throws FileNotFoundException {
		
		// 파일에서 한라인 읽어오기
		List<String> temp = new ArrayList<>();
		
		Scanner sc = new Scanner( new File("src/airPlane/flight.txt") );
	
		while( sc.hasNext() ) {
			String line = sc.next();
			temp.add(line);
		}
		
		/* 
		 * 읽어온 라인 분리하여 리스트 만들기
		 * list : flight.txt 에서 가져온 데이타를 Flight 객체로 바꿔서 저장 
		 */
		
		List<Flight> list = new ArrayList<>();
		
		for( String s : temp) {
			String[] str = s.split(",");
						
			list.add( new Flight(
					str[0], str[1], str[2],
					Integer.parseInt(str[3]),
					str[4], str[5],
					Integer.parseInt(str[6]),
					Integer.parseInt(str[7])
					));			
		}
		
		/* Sample : 아래 부분을 각자에 맞게 Stream 을 사용해서 3가지 형태로 만들어 보세요.
		 * <주의 사항>
		 * 1. Flight class 변경하지 말 것
		 * 2. 위에 list 생성 부분 변경하지 말 것
		 * 
		 * <기준 배분>
		 * 1. 김영훈 : 나라
		 * 2. 김선진 : 도시
		 * 3. 신준용 : 항공사
		 * 4. 김호중 : 등급
		 */
		 		
		  
		// 샘플 생성 : 참고만 하시고 삭제 후 본인데 맞게 코딩하세요.
		 Map<String, ArrayList<Flight>> mapList = new HashMap<>();
		
		for( Flight s : list ) {
			
			if( !mapList.containsKey(s.getCountry()) ) {
				mapList.put( s.getCountry(), new ArrayList<Flight>() );
			}			
			mapList.get( s.getCountry() ).add( s ); 
		}
		
		for( String s : mapList.keySet() ) {
			System.out.println( ">> 나라 : " + s + " <<" );
			
			for( Flight f : mapList.get(s) ) {
				System.out.println( f );
			}
			System.out.println();
		}
	}//main
}//class


//  Flight 
class Flight1 {
	// 변수
	String country;
	String city;
	String company;
	
	boolean baggage;
	String takeoff;
	String grade;
	
	int price;
	int time;
	
	// 생성자
	
	public void Flight(String country, String city, String company,
			int baggage, String takeoff, String grade,
			int price, int time) {
		this.country = country;
		this.city = city;
		this.company = company;
		
		if( baggage==0 ) { this.baggage = false; }
		else { this.baggage = true;  }
		
		this.takeoff = takeoff;
		
		this.grade = grade;
		this.price = price;
		this.time = time;
	}
	
	

	@Override
	public String toString() {
		return "나라=" + country + ", 도시=" + city + ", 항공사=" + company + ", 위탁수하물=" + baggage
				+ ", takeoff=" + takeoff + ", grade=" + grade + ", price=" + price + ", time=" + time + "]";
	}

	// getter setter
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isBaggage() {
		return baggage;
	}
}