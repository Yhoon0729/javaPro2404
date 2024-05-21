package ch14_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* Iterator  : 반복자
 * it.hasNext() :다음에 입력된 주소  있으면 true
 * it.next()    :다음 주소 return
*/
public class Coll18_Iterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");		list.add("2");
		list.add("13");		list.add("42");
		list.add("5");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Iterator it = list.iterator();	
		
		while(it.hasNext()) {
		//	Object obj = it.next();
			System.out.println(it.next());
		}
		System.out.println();
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);		list2.add(2);
		list2.add(13);		list2.add(42);
		list2.add(5);
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		it = list2.iterator();	
		
		while(it.hasNext()) {
		//	Object obj = it.next();
			System.out.println(it.next());
		}
	} // main
}


