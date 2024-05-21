package ch06_obj1;
/*
1) Student class 만들기
   변수 : name, oracle, java , total (oracle+java)
   메소드 : toString() : source generate 한다
   생성자 : String(name, oracle, java)
2) Student[] sts 배열 만들어 저장하기 
3) total 순 sort descending 하기 
출력
Student [name=홍길동, oracle=100, java=100, total=200]
Student [name=김자바, oracle=85, java=70, total=155]
Student [name=나몰라, oracle=70, java=75, total=145]
Student [name=졸려요, oracle=90, java=90, total=180]
=============sort descending 후 
Student [name=홍길동, oracle=100, java=100, total=200]
Student [name=졸려요, oracle=90, java=90, total=180]
Student [name=김자바, oracle=85, java=70, total=155]
Student [name=나몰라, oracle=70, java=75, total=145]
*/

public class ExOop09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String[] names = { "홍길동", "김자바", "나몰라", "졸려요" };
				int[] oracles = { 100, 85, 70, 90 };
				int[] javas = { 100, 70, 75, 90 };
				Student[] sts = new Student[names.length];
				for (int i = 0; i < sts.length; i++) {
					sts[i]= new Student(names[i], oracles[i], javas[i]);
				}
				for(Student s : sts) System.out.println(s);
				
				for (int i = 0; i < sts.length; i++) {
					for (int j = 0; j < sts.length-1-i; j++) {
						if (sts[j].total <  sts[j+1].total) {
							Student temp=sts[j];
							sts[j]=sts[j+1];
							sts[j+1]=temp;
						}
					}
				}
				
				System.out.println("=============sort descending 후 ");
				
				for(Student s : sts) System.out.println(s);
	}

}
class Student {
	String name;
	int oracle;
	int java;
	int total;

	public Student(String name, int oracle, int java) {
		super();
		this.name = name;
		this.oracle = oracle;
		this.java = java;
		total = oracle + java;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", oracle=" 
	+ oracle + ", java=" + java + ", total=" + total + "]";
	}

}

