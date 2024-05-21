package ch17_stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEx23_Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student4> totalList = Arrays.asList(
				new Student4("홍길동", 10, Student4.Sex.MALE),
				new Student4("김수애", 6, Student4.Sex.FEMALE),
				new Student4("신용권", 10, Student4.Sex.MALE),
				new Student4("박수미", 6, Student4.Sex.FEMALE)
		);
		
		System.out.println("1. 남학생의 이름, 점수을 프린트 한다 List");
		List<Student4> maleList = 
				totalList.stream()
				.filter(s -> s.getSex()==Student4.Sex.MALE)
				.collect(Collectors.toList());
		
		maleList.stream()
		.forEach(s -> System.out.print(s.getName()+","));
		System.out.println();
		maleList.stream()
		.forEach(s -> System.out.print(s.getScore()+","));
		System.out.println();
		
		System.out.println("1. 여학생의 이름, 점수을 프린트 한다 Set");
		Set<Student4> femaleList = 
				totalList.stream()
				.filter(s -> s.getSex()==Student4.Sex.FEMALE)
				.collect(Collectors
				.toCollection(() -> new HashSet<Student4>()));
		
		femaleList.stream()
		.forEach(s -> System.out.print(s.getName()+","));
		System.out.println();
		femaleList.stream()
		.forEach(s -> System.out.print(s.getScore()+","));
		System.out.println();
		

	}

}
class Student4 {
	public enum Sex { MALE, FEMALE }
	public enum City { Seoul, Pusan }
	
	private String name;
	private int score;
	private Sex sex;
	private City city;
	
	public Student4(String name, int score, Sex sex) {
		this.name = name;
		this.score = score;
		this.sex = sex;
	}	
	
	public Student4(String name, int score, Sex sex, City city) {
		this.name = name;
		this.score = score;
		this.sex = sex;
		this.city = city;
	}

	public String getName() { return name; }
	public int getScore() { return score; }
	public Sex getSex() { return sex; }
	public City getCity() { return city; }
}