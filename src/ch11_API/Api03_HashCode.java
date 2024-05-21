package ch11_API;
class Api03_HashCode {
	public static void main(String[] args) {
		Value v1 = new Value("abc");//v1.value="abc" 100
		Value v2 = new Value("abc");//v2.value="abc" 100
		
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v2));
		}}
class Value {
	String value;
	Value(String value) {
		this.value=value;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Value) {
			Value v = (Value) obj;
			return value.equals(v.value);
		}
		// TODO Auto-generated method stub
		return false;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return value.hashCode();
	}
}




