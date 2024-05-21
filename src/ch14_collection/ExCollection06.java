package ch14_collection;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/*
 * 1) student.txt를 읽어서 List<Student2> list를 작성하세요
 * 2) 학생번호순 프린트
 * 3) 과목별 점수순 프린트(descending): 국어, 영어, 수학
 * 4) 학생별 (tot)등수 프린트  (descending)
 */
class ExCollection06 {
	public static void main(String[] args) throws Exception {
		Scanner sc = 
				new Scanner(new File("src/ch14_collection/student.txt"));
		List<Student2> li = new ArrayList<Student2>();
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			//System.out.println(line);
			String[] strs = line.split(",");
			Student2 s = new Student2(strs[0], strs[1],
					Integer.parseInt(strs[2]),
					Integer.parseInt(strs[3]),
					Integer.parseInt(strs[4]));
			
		
			//중복 자료는 입력 하지 않는다
			if (li.indexOf(s)==-1) {
				li.add(s);
				System.out.println(s);
			}
			else System.out.println("중복 "+s);
			
			
		}
		System.out.println("==========");
		System.out.println("2) 학생번호순 프린트");
		Collections.sort(li);
		print(li);
		
		System.out.println("3) 과목별 점수순 프린트(descending): 국어, 영어, 수학");
		System.out.println("국어");
		Collections.sort(li, new Comparator<Student2>() {

			@Override
			public int compare(Student2 o1, Student2 o2) {
				// TODO Auto-generated method stub
				return o2.kor - o1.kor;
			}
		
		});
		print(li);
		System.out.println("영어");
		Collections.sort(li, new Comparator<Student2>() {

			@Override
			public int compare(Student2 o1, Student2 o2) {
				// TODO Auto-generated method stub
				return o2.eng - o1.eng;
			}
		
		});
		print(li);
		System.out.println("수학");
		Collections.sort(li, new Comparator<Student2>() {

			@Override
			public int compare(Student2 o1, Student2 o2) {
				// TODO Auto-generated method stub
				return o2.math - o1.math;
			}
		
		});
		print(li);
		
		System.out.println("4) 학생별 (tot)등수 프린트  (descending)");
		
		Collections.sort(li, new Comparator<Student2>() {

			@Override
			public int compare(Student2 o1, Student2 o2) {
				// TODO Auto-generated method stub
				return o2.tot - o1.tot;
			}
		
		});
		print(li);
		
	
	}
	static void print(List<Student2> li) {
		
		for (Student2 s : li) {
			System.out.println(s);
		}
		
	}
}

class Student2 implements Comparable<Student2>{
	String stno;
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	public Student2(String stno, String name, int kor, int eng, int math) {
		super();
		this.stno = stno;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = kor+eng+math;
	}
	@Override
	public String toString() {
		return "Student2 [stno=" + stno + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", tot=" + tot + "]";
	}
	@Override
	public int compareTo(Student2 o) {
		// TODO Auto-generated method stub
		return stno.compareTo(o.stno);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return stno.equals(((Student2)obj).stno);
	}
	
	
}

