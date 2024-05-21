package ch14_collection;

import java.util.LinkedList;

public class Coll09_LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("1");
		ll.add("3");
		ll.add("9");
		ll.add("5");
		System.out.println(ll);
		ll.addFirst("3");
		
		System.out.println(ll);
		
		
	}

}