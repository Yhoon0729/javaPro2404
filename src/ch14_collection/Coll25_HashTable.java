package ch14_collection;

import java.util.Hashtable;

/*
Hashtable : 동기화 (synchronized) 되어있음, Null 허용 하지 않음
*/
class Coll25_HashTable {
	public static void main(String args[]) {
		Hashtable<Integer, String> hm 
		                 = new Hashtable<Integer, String>();
		hm.put(100, "java");
		hm.put(102, "html");
		hm.put(101, "css");
		hm.put(103, "javascript");
	//	hm.put(104, null);
		System.out.println(hm);
	}
	
}