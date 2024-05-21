package ch11_API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Date 클래스 예제
 
Date(): 현재 날짜와 시간을 나타내는 Date 객체를 생성
Date(long milliseconds): 1970년 1월 1일 00:00:00 GMT로부터 지정된 밀리초 수를 나타내는 Date 객체를 생성
Date(int year, int month, int date): 시, 분, 초는 모두 0으로 설정됨
Date(int year, int month, int date, int hrs, int min):초는 0으로 설정
Date(int year, int month, int date, int hrs, int min, int sec): 		
  
   */
public class Api34_Date {
	public static void main(String[] args) {
		Date now = new Date(); //현재시간 객체를 리턴
		System.out.println(now);
		Date day = new Date(2021,5,19); //현재시간 객체를 리턴
		System.out.println(day);
		Calendar calendar = Calendar.getInstance();
        // 원하는 연도, 월, 일을 설정
        calendar.set(2021,5,19); 
       // Calendar 객체에서 Date 객체를 얻기
        Date date = calendar.getTime();
       // 출력
        System.out.println(date);
	}
}

