package ch14_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * key는 중복(equals, hashcode)을 허용하지 않는다
 * 
 */
public class Coll20_Map {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = { "홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓" };
		int[] nums = { 1234, 4567, 2350, 9870, 3456 };
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);

		// Value =map.get(Key) => Key에 해당하는 Value 값을 리턴
		System.out.println("홍길동의 번호:" + map.get("홍길동"));
		System.out.println("이몽룡의 번호:" + map.get("이몽룡"));
		System.out.println("김삿갓의 번호:" + map.get("김삿갓"));
		// Key값들만 조회
		System.out.println("Key들만 조회하기");
		Set<String> keys = map.keySet();
		for (String k : keys) {
			System.out.println(k + "의 번호:" + map.get(k));
		}

		// Value값들만 조회
		System.out.println("Value값들만 조회");
		Collection<Integer> values = map.values(); // => Key값 조회 불가.
		for (Integer v : values) {
			System.out.println(v);
		}
		// Key,Value의 쌍인 객체로 조회
		System.out.println("Key,Value의 쌍인 객체로 조회");
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for (Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "의 번호:" + m.getValue());
			System.out.println(m);
		}

	}
}
