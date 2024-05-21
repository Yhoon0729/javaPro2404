package train;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

import java.util.stream.Collectors;

public class flightInfo {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);

		// 파일에서 한라인 읽어오기
		List<String> temp = new ArrayList<>();

		Scanner sc = new Scanner(new File("src/train/flight.txt"));

		while (sc.hasNext()) {
			String line = sc.next();
			temp.add(line);
		}

		/*
		 * 읽어온 라인 분리하여 리스트 만들기 list : flight.txt 에서 가져온 데이타를 Flight 객체로 바꿔서 저장
		 */

		List<Flight> list = new ArrayList<>();

		for (String s : temp) {
			String[] str = s.split(",");

			list.add(new Flight(str[0], str[1], str[2], Integer.parseInt(str[3]), str[4], str[5],
					Integer.parseInt(str[6]), Integer.parseInt(str[7])));
		}

		System.out.println("원하는 데이터를 선택하세요(숫자만 입력하시오):");
		System.out.println("1. 나라");
		System.out.println("2. 도시");
		System.out.println("3. 항공사");
		System.out.println("4. 등급");

		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			printByCountry(list);
			break;
		case 2:
			printByCity(list);
			break;
		case 3:
			printByCompany(list);
			break;
		case 4:
			printByGrade(list);
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}

		/*
		 * Sample : 아래 부분을 각자에 맞게 Stream 을 사용해서 3가지 형태로 만들어 보세요. <주의 사항> 1. Flight class
		 * 변경하지 말 것 2. 위에 list 생성 부분 변경하지 말 것
		 * 
		 * <기준 배분> 1. 김영훈 : 나라 2. 김선진 : 도시 3. 신준용 : 항공사 4. 김호중 : 등급
		 */

	}// main

	private static void printByCountry(List<Flight> list) {
		// 국가 기준 정렬 (김영훈)
		System.out.println();
		System.out.println("================================");
		System.out.println("=    국가 기준 정렬 구현 (김영훈)       =");
		System.out.println("================================");
		System.out.println();

		System.out.println("======== 1. 나라 ========");
		System.out.println("== 1.1)나라별 리스트 ==");
		list.stream().collect(Collectors.groupingBy(Flight::getCountry, Collectors.groupingBy(Flight::getCity)))
				.forEach((c1, c2) -> {
					System.out.println("\n>> 나라: " + c1 + " <<");
					c2.forEach((city, flights) -> {
						System.out.println("\n도시: " + city);
						flights.forEach(System.out::println);
					});
				});

		System.out.println("================================");
		System.out.println();

		// 1.2)나라의 도시별 평균 비행시간
		System.out.println("\n== 1.2)나라의 도시별 평균 비행시간 ==");
		list.stream()
				.collect(Collectors.groupingBy(Flight::getCountry,
						Collectors.groupingBy(Flight::getCity, Collectors.averagingInt(Flight::getTime))))
				.forEach((c1, c2) -> {
					System.out.println("\n>> 나라: " + c1 + " <<");
					c2.forEach((city, avgTime) -> {
						System.out.println("도시: " + city + ", 평균 비행시간: " + avgTime + " 시간");
					});
				});

		System.out.println("================================");
		System.out.println();

		// 1.3)나라별 오전에 출발하는 항공편
		System.out.println("\n== 1.3)오전에 출발하는 항공편 목록 ==");

		list.stream().filter(flight -> isMorningDeparture(flight.getTakeoff()))
				.sorted((f1, f2) -> f1.getTakeoff().compareTo(f2.getTakeoff())) // 출발 시간으로 정렬
				.collect(Collectors.groupingBy(Flight::getCountry, // 나라별로 그룹핑
						Collectors.groupingBy(Flight::getCity))) // 도시별로 그룹핑
				.forEach((c1, c2) -> {
					System.out.println("\n>> 나라: " + c1 + " <<");
					c2.forEach((city, flights) -> {
						System.out.println("\n도시: " + city);
						flights.forEach(flight -> {
							System.out.println(flight);
						});
					});
				});

		System.out.println("================================");
		System.out.println();

		// 1.4)나라별 가격 이하의 항공편 목록
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("\n가격을 입력하시오.");
		int maxPrice = inputScanner.nextInt();

		System.out.println("\n== 1.4)나라별 " + maxPrice + "원 이하의 항공편 목록 ==");
		list.stream().filter(flight -> flight.getPrice() <= maxPrice).sorted((f1, f2) -> f1.getPrice() - f2.getPrice()) // 가격
																														// 오름차순
																														// 정렬
				.collect(Collectors.groupingBy(Flight::getCountry, // 나라별로 그룹핑
						Collectors.groupingBy(Flight::getCity))) // 도시별로 그룹핑
				.forEach((c1, c2) -> {
					System.out.println("\n>> 나라: " + c1 + " <<");
					c2.forEach((city, flights) -> {
						System.out.println("\n도시: " + city);
						flights.forEach(System.out::println);
					});
				});
	} // end of printByCountry

	private static void printByCity(List<Flight> list) {
		// 도시 기준 정렬 (김선진)
		System.out.println();
		System.out.println("================================");
		System.out.println("=    도시 기준 정렬 구현 (김선진)       =");
		System.out.println("================================");
		System.out.println();

		System.out.println("1. 도시별 리스트");
		Map<String, List<Flight>> flightCity = list.stream().collect(Collectors.groupingBy(Flight::getCity));

		for (String s : flightCity.keySet()) {
			System.out.println("[ " + s + " ]");
			for (Flight f : flightCity.get(s)) {
				System.out.println(f);
			}
		}

		System.out.println("================================");
		System.out.println();

		System.out.println("2. 도시별 여행객 인원수");
		Map<String, Long> flightCityCount = list.stream()
				.collect(Collectors.groupingBy(Flight::getCity, Collectors.counting()));

		for (String str : flightCityCount.keySet()) {
			System.out.println(str + " : " + flightCityCount.get(str));
		}

		System.out.println("================================");
		System.out.println();

		System.out.println("3. 도시별 등급별 리스트");
		Map<String, Map<String, List<Flight>>> flightCityGrade = list.stream()
				.collect(Collectors.groupingBy(Flight::getCity, Collectors.groupingBy(Flight::getGrade)));

		for (String str : flightCityGrade.keySet()) {
			System.out.println("[ " + str + " ]");
			for (String str2 : flightCityGrade.get(str).keySet()) {
				System.out.println("< " + str2 + "등급 >");
				for (Flight f : flightCityGrade.get(str).get(str2)) {
					System.out.println(f);
				}
			}
		}

		System.out.println("================================");
		System.out.println();

		System.out.println("4. 도시별 수하물 비용 무료 리스트");
		Map<String, Map<Boolean, List<Flight>>> flightCityBaggage = list.stream()
				.collect(Collectors.groupingBy(Flight::getCity, Collectors.partitioningBy(Flight::isBaggage)));

		for (String str : flightCityBaggage.keySet()) {
			System.out.println("[ " + str + " ]");
			for (Boolean str2 : flightCityBaggage.get(str).keySet()) {
				System.out.println("[ " + (str2 ? "유료" : "무료") + " ]");
				for (Flight f : flightCityBaggage.get(str).get(str2)) {
					System.out.println(f);
				}
			}
		}

		System.out.println("================================");
		System.out.println();

		System.out.println("5. 도시별 가격이 가장 높은 표 리스트");
		Map<String, Optional<Flight>> flightCityTopPrice = list.stream().collect(
				Collectors.groupingBy(Flight::getCity, Collectors.maxBy(Comparator.comparing(Flight::getPrice))));

		for (Optional<Flight> f : flightCityTopPrice.values()) {
			System.out.println(f.get());
		}
	} // end of printByCity

	private static void printByCompany(List<Flight> list) {
		// 항공사 기준 정렬 (신준용)
		System.out.println();
		System.out.println("================================");
		System.out.println("=    항공가 기준 정렬 구현 (신준용)       =");
		System.out.println("================================");
		System.out.println();

		System.out.println("항공사 별 그룹비행:");
		Map<String, List<Flight>> flightAirline = list.stream().collect(Collectors.groupingBy(Flight::getCompany));

		for (String s : flightAirline.keySet()) {
			System.out.println("[ " + s + " ]");
			for (Flight f : flightAirline.get(s)) {
				System.out.println(f);
			}
		}

		System.out.println("================================");
		System.out.println();

		System.out.println("항공사 1기당 승객수 :");
		Map<String, Long> flightAirlineCount = list.stream()
				.collect(Collectors.groupingBy(Flight::getCompany, Collectors.counting()));

		for (String str : flightAirlineCount.keySet()) {
			System.out.println(str + " : " + flightAirlineCount.get(str));
		}

		System.out.println("================================");
		System.out.println();

		System.out.println("항공사별 출발시간");
		Map<String, Map<Boolean, List<Flight>>> flightAirlineAPM = list.stream()
				.collect(Collectors.groupingBy(Flight::getCompany,
						Collectors.partitioningBy(f -> Integer.parseInt(f.getTakeoff()) < Integer.parseInt("1200"))));

		for (String str : flightAirlineAPM.keySet()) {
			System.out.println("[ " + str + " ]");
			for (Boolean str2 : flightAirlineAPM.get(str).keySet()) {
				System.out.println("[ " + (str2 ? "오전" : "오후") + " ]");
				for (Flight f : flightAirlineAPM.get(str).get(str2)) {
					System.out.println(f);
				}
			}
		}
	} // end of printByCompany

	private static void printByGrade(List<Flight> list) {
		// 좌석등급 기준 정렬 (김호중)
		System.out.println();
		System.out.println("================================");
		System.out.println("=    좌석등급 기준 정렬 구현 (김호중)      =");
		System.out.println("================================");
		System.out.println();

		Map<String, List<Flight>> map = list.stream().collect(Collectors.groupingBy(f -> f.grade));

		// 1. 좌석 등급 별로 출력하기 (나라 > 도시 > 출발시각 순으로 정렬)
		System.out.println("1. 좌석 등급 별로 출력하기 (나라 > 도시 > 출발시각 순으로 정렬)");
		map.entrySet().stream().forEach(e -> {
			System.out.println(">> " + e.getKey() + " <<");
			e.getValue().stream().sorted((s1, s2) -> s1.takeoff.compareTo(s2.takeoff))
					.sorted((s1, s2) -> s1.city.compareTo(s2.city)).sorted((s1, s2) -> s1.country.compareTo(s2.country))
					.forEach(f -> System.out.println(f));
		});

		System.out.println("================================");
		System.out.println();

		// 2. 좌석 등급 별로 출력하기 (비행시간을 입력받고, 비행시간 > 나라 > 도시> 출발시각 순으로 출력)

		System.out.println("최대 비행시간을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		final int FLYINGTIME = scan.nextInt();

		System.out.println("2. 비행시간 " + FLYINGTIME + "시간 이내 좌석 등급 별로 출력하기 (비행시간 > 나라 > 도시 > 출발 순으로 정렬)");
		map.entrySet().stream().forEach(e -> {
			System.out.println(">> " + e.getKey() + " <<");
			e.getValue().stream().filter(f -> f.time <= FLYINGTIME).sorted((s1, s2) -> s1.takeoff.compareTo(s2.takeoff))
					.sorted((s1, s2) -> s1.city.compareTo(s2.city)).sorted((s1, s2) -> s1.country.compareTo(s2.country))
					.sorted((s1, s2) -> s1.time - s2.time).forEach(f -> System.out.println(f));
		});

		System.out.println("================================");
		System.out.println();

		// 3. 좌석 등급 별로 출력하기 (시간대를 입력받고, 나라 > 도시> 출발시각 순으로 출력)

		int timeFrom = 0;
		int timeTo = 0;

		System.out.println("원하는 출발 시간대를 입력하세요");

		do {
			System.out.println("원하시는 빠른 시각을 입력하세요 (0 - 24)");
			scan = new Scanner(System.in);
			timeFrom = scan.nextInt();

			System.out.println("원하시는 늦은 시각을 입력하세요. ( 0 - 24)");
			scan = new Scanner(System.in);
			timeTo = scan.nextInt();

			if (timeFrom < timeTo) {
				System.out.println("빠른 시각은 늦은 시각보다 작은 값이어야합니다.");
			}

		} while (timeFrom > timeTo);

		final int TIMEFROM = timeFrom;
		final int TIMETO = timeTo;

		System.out.println("2. " + timeFrom + "시 부터 " + timeTo + "시 사이 출발하는 항공편 좌석 등급 별로 출력하기 (나라 > 도시 > 출발 순으로 정렬)");
		map.entrySet().stream().forEach(e -> {
			System.out.println(">> " + e.getKey() + " <<");
			e.getValue().stream()
					.filter(f -> Integer.parseInt(f.takeoff) >= TIMEFROM * 100
							&& Integer.parseInt(f.takeoff) <= TIMETO * 100)
					.sorted((s1, s2) -> s1.takeoff.compareTo(s2.takeoff)).sorted((s1, s2) -> s1.city.compareTo(s2.city))
					.sorted((s1, s2) -> s1.country.compareTo(s2.country)).forEach(f -> System.out.println(f));
		});
	} // end of printByGrade

	// 오전 출발 리스트
	private static boolean isMorningDeparture(String takeoffTime) {
		int hour = Integer.parseInt(takeoffTime);
		return hour < 1200;
	}

}// class

//  Flight 
class Flight {
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
	public Flight() {
	};

	public Flight(String country, String city, String company, int baggage, String takeoff, String grade, int price,
			int time) {
		super();
		this.country = country;
		this.city = city;
		this.company = company;

		if (baggage == 0) {
			this.baggage = false;
		} else {
			this.baggage = true;
		}

		this.takeoff = takeoff;

		this.grade = grade;
		this.price = price;
		this.time = time;
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

	public void setBaggage(boolean baggage) {
		this.baggage = baggage;
	}

	public String getTakeoff() {
		return takeoff;
	}

	public void setTakeoff(String takeoff) {
		this.takeoff = takeoff;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	// String
	// 수하물 비용은 boolean 값이지만 출력은 String 으로 변경함
	@Override
	public String toString() {
		return "나라 : " + country + "  " + "\t 도시 : " + city + "\t 항공사 : " + company + "    " + "\t 수하물 비용 : "
				+ (baggage == true ? "유료" : "무료") + "\t 출발시각 : " + takeoff + "\t 등급 : " + grade + "\t 가격 : " + price
				+ "\t 비행시간 : " + time;
	}
}
