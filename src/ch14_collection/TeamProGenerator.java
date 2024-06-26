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
		String[] cars = { "토요타 위고", "혼다 시티", "토요타 비오스", "혼다 어코드", "혼다 BR-V", "토요타 포츄너", "토요타 이노바" };
		String[] remark = { "몰라요", "싫어요", "그냥이요" };

		try {
			fos = new FileOutputStream("src/ch14_collection/car_rental_car.txt");
			ps = new PrintStream(fos);

			for (int i = 0; i < 20; i++) {
				// 렌터카 일련번호
				ps.print("PHL" + (i + 1000));

				// 국가 번호
				ps.print(", PHL");

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
				int price1 = (int) ((Math.random() + 1) * 2000);
				// k3, k5
				int price2 = (int) ((Math.random() + 1) * 2300);
				// 그랜저, 카니발
				int price3 = (int) ((Math.random() + 1) * 2600);
				// 펠리세이드
				int price4 = (int) ((Math.random() + 1) * 3000);
				// bmw
				int price5 = (int) ((Math.random() + 1) * 4000);

				if (type == 0) {
					ps.print(", " + (price1 / 100) * 100);
				} else if (type == 1 || type == 2) {
					ps.print(", " + (price2 / 100) * 100);
				} else if (type == 3 || type == 6) {
					ps.print(", " + (price3 / 100) * 100);
				} else if (type == 5) {
					ps.print(", " + (price4 / 100) * 100);
				} else if (type == 4) {
					ps.print(", " + (price5 / 100) * 100);
				}

				// 렌터카 회사
				int cop = (int) (Math.random() * 3);
				if (cop == 0) {
					ps.print(", 마닐라 렌터카");
				} else if (cop == 1) {
					ps.print(", 세부 렌터카");
				} else if (cop == 2) {
					ps.print(", 다바오 렌터카");
				}
				ps.println();
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