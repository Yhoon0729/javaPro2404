package ch16_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaEx12 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 55, 60, "컴공"),
			new Student("이몽룡", 95, 90, "경영"), 
			new Student("김삿갓", 75, 80, "심리"), 
			new Student("임꺽정", 65, 70, "전자"),
			new Student("성춘향", 65, 0, "컴공"));

	public static void main(String[] args) {
		System.out.println("영어 점수가 60점 이상인 학생의 영어 평균 :" 
	+ avg1(s ->  s.getEng() >= 60));
		System.out.println("수학 점수가 60점 이상인 학생의 수학 평균 :"
	+avg2(s -> s.getMath() >= 60));
		
		System.out.print("컴공과 학생의 영어 평균  :"); 
		System.out.println(avg1(s ->  s.getMajor().equals("컴공")));
		System.out.print("컴공과가 아닌 학생의 영어 평균  :");
		System.out.println(avg1(s ->  !s.getMajor().equals("컴공")));
		
		System.out.println("컴공과 학생의 이름 리스트  :" 
		+ nameList(s -> s.getMajor().equals("컴공")));  //aaa,bbb,ccc,
		System.out.println("컴공과가 아닌 학생의 이름 리스트  :" 
		+ nameList(s -> !s.getMajor().equals("컴공")));
	}
	public static String nameList(Predicate<Student>  pr) {
		String line="";
		for (Student s : list) {
			if (pr.test(s)) {
				line +=s.getName()+",";
			}
		}
		return line;
	}
	
	
	public static double avg1(Predicate<Student>  pr) {
		int sum=0, count=0;
		for (Student s : list) {
			if (pr.test(s)) {
				count++;
				sum +=s.getEng();
			}
		}
		return (double)sum/count;
	}
    public static double avg2(Predicate<Student>  pr) {
    	int sum=0, count=0;
		for (Student s : list) {
			if (pr.test(s)) {
				count++;
				sum +=s.getMath();
			}
		}
		return (double)sum/count;
	}
}