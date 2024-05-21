package ch17_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx03_Student {
	private static List<Student> list = 
			Arrays.asList(
			new Student("홍길동", 55, 60, "컴공"),
			new Student("이몽룡", 95, 90, "경영"), 
			new Student("김삿갓", 75, 80, "심리"), 
			new Student("임꺽정", 65, 70, "전자"),
			new Student("성춘향", 65, 0, "컴공"));

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			Stream<Student> st1 = list.stream();
		
			st1
			.filter(s -> s.getEng() >= 60)
			.map((s) -> s.getName())
			.forEach(s -> System.out.println(s));
			System.out.println("=====================");
			
			Stream<Student> st2 = list.stream();
			int tot = 0;
			tot =st2
			.filter(s -> s.getEng() >= 60)
			.map((s) -> s.getEng())
			.peek(s -> System.out.println(s))
		    .reduce((a,b) -> a+b)
			.get();
			
			System.out.println(tot);
		}


	}


