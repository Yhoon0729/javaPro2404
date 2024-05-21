package ch14_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Coll05_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 30));
		li.add(new Person("이정민", 10));
		li.add(new Person("김윤민", 16));
		Person p1 = new Person("김삿갓", 20);
		li.add(p1);
		print(li );
		//Collections.sort(li);  //Comparable
		//Collections.sort(li, new PersonCompare());  //Comparator
		Collections.sort(li, new Comparator<Person>() {  //Comparator

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
			
		});
		System.out.println();
		print(li );
	}
	public static void print(List li) {
		for (Object ob : li) {
			System.out.println(ob);
		}
	}
}

