package ch14_collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DecimalFormat;

public class TeamProGenerator {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		String[] cars = { "모닝", "k3", "k5", "그랜저", "BMW", "펠리세이드", "카니발" };
		String[] remark = { "몰라요", "싫어요", "그냥이요" };

		try {
			fos = new FileOutputStream("src/ch14_collection/car_rental_car.txt");
			ps = new PrintStream(fos);

			for (int nat = 1; nat <= 35; nat++) {
				for (int i = 0; i < 100; i++) {
					// 렌터카 일련번호
					ps.print(i + 100);
					
					// 국가 번호
					ps.print(", nat" + nat);
					
					// 차 타입
					int type = (int) (Math.random() * 7);
					if (type == 0) {
						ps.print(", 소형차");
					} else if (type == 1 || type == 2 || type == 3 || type == 4) {
						ps.print(", 승용차");
					} else if (type == 5 || type == 6) {
						ps.print(", SUV");
					}

					// 차 종류
					ps.print(", " + cars[type]);

					// 렌트 비용
					// 모닝
					int price1 = (int) ((Math.random() + 1) * 20000);
					// k3, k5
					int price2 = (int) ((Math.random() + 1) * 23000);
					// 그랜저, 카니발
					int price3 = (int) ((Math.random() + 1) * 26000);
					// 펠리세이드
					int price4 = (int) ((Math.random() + 1) * 30000);
					// bmw
					int price5 = (int) ((Math.random() + 1) * 40000);

					if (type == 0) {
						ps.print(", " + (price1 / 1000) * 1000);
					} else if (type == 1 || type == 2) {
						ps.print(", " + (price2 / 1000) * 1000);
					} else if (type == 3 || type == 6) {
						ps.print(", " + (price3 / 1000) * 1000);
					} else if (type == 5) {
						ps.print(", " + (price4 / 1000) * 1000);
					} else if (type == 4) {
						ps.print(", " + (price5 / 1000) * 1000);
					}

					// 렌터카 회사
					int cop = (int) (Math.random() * 4);
					if (cop == 0) {
						ps.print(", sk렌터카");
					} else if (cop == 1) {
						ps.print(", kb렌터카");
					} else if (cop == 2) {
						ps.print(", 롯데렌터카");
					} else if (cop == 3) {
						ps.print(", k렌터카");
					}
					ps.println();
				}
			}
			System.out.println("파일 생성 완료");
			ps.flush();
			ps.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}