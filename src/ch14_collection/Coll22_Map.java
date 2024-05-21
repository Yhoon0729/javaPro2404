package ch14_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Coll22_Map  {
	static HashMap<String, Map<String, String>> 
	                    phoneBook = new HashMap<>();
    //  phoneBook  : key groupName  - value Map<name, tel>
	public static void main(String[] args) {
		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "김자바", "010-222-2222");
		addPhoneNo("친구", "김자바", "010-333-3333");
		addPhoneNo("회사", "김대리", "010-444-4444");
		addPhoneNo("회사", "김대리", "010-555-5555");
		addPhoneNo("회사", "박대리", "010-666-6666");
		addPhoneNo("회사", "이과장", "010-777-7777");
		addPhoneNo("세탁", "010-888-8888");
		System.out.println(phoneBook);
		printList();
	}
	public static void addPhoneNo(String groupName, String name,
			String tel) {
        addGroup(groupName);
        
        HashMap<String, String> group 
        = (HashMap)phoneBook.get(groupName);
        group.put(tel, name);
	}
	public static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타",name, tel);
	}
	
	public static void  addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap<String, String>());
	}
	
	public static void  printList() {
		//phoneBook.keySet(), phoneBook.entrySet(), 
		
		Set<String> phoneKey = phoneBook.keySet();
		
		for (String groupName : phoneKey) {
			System.out.println("*"+groupName+"*");
			Map<String, String> subMap = phoneBook.get(groupName);
			for(String tel : subMap.keySet()) {
				System.out.println(subMap.get(tel)+":"+tel );
			}		
			
		}
		
		Set<Entry<String, Map<String, String>>> phoneEntry 
		= phoneBook.entrySet();
		
		for (Entry<String, Map<String, String>> e : phoneEntry  ) {
			System.out.println("*"+e.getKey()+"*");
			Map<String, String> subMap = e.getValue();
		
			for(Entry<String, String> en : subMap.entrySet()) {
				System.out.println(en.getValue() +":"+en.getKey() );
			}
		}
		
	}
}