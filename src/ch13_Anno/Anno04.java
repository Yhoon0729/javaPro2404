package ch13_Anno;
class Anno04 {
	@SafeVarargs
	@SuppressWarnings("unchecked")
	public static void main(String... args) {
		MyArrayList<String> list = MyArrayList.asList("1","2","3");

		System.out.println(list);
	}
}

class MyArrayList<T> {
	T[] arr;

	@SafeVarargs

	MyArrayList(T... arr) {
		this.arr = arr;
	}
	
	//@SafeVarargs
//	@SuppressWarnings("unchecked")
	public static <T> MyArrayList<T> asList(T... a) { 
        return new MyArrayList<>(a);
    }

	public String toString() {
		return Arrays.toString(arr);
	}
}
