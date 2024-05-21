package ch11_API;
/*
 * hashCode()를 재정의 하는이유 : 
 * collection 에서 객체의 논리적 동등 확인 
 * equals(): true , hashCode()의 값이 같을때 동등으로 판단한다  
 */

public class Api05_HashCode {
	public static void main(String[] args) {
		Hash v1 = new Hash(20);
		Hash v2 = new Hash(20);
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println("v1 객체 진짜 해쉬값 :" + System.identityHashCode(v1));
		System.out.println("v2 객체 진짜 해쉬값 :" + System.identityHashCode(v2));
	}
}

class Hash {
	int value;

	Hash(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Hash) {
			Hash v = (Hash) obj;
			return value == v.value;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return value;
	}
}