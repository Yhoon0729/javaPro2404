package ch17_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Arrays.stream 메서드를 이용하여 IntStream  생성하기");
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s->System.out.print(s+ "\t"));
		System.out.println();
		Arrays.stream(arr).forEach(s->System.out.print(s+ "\t"));
		System.out.println();
		System.out.println("\nIntStream.of 메서드를 이용하여 IntStream  생성하기");
		//IntStream IntStream.of(arr)
		IntStream.of(arr).forEach(s->System.out.print(s+ "\t"));
		//range : 범위 지정. 20 포함 안됨. 10 ~ 19까지의 숫자를 IntStream 객체로 생성
		System.out.println
		("\nIntStream.range(1,5) 메서드를 이용하여 IntStream  생성하기");
		IntStream.range(10,20).forEach(s->System.out.print(s+ "\t"));
		//rangeClosed : 범위 지정. 5 포함됨. 1 ~ 5까지의 숫자를 IntStream 객체로 생성
		System.out.println
		("\nIntStream.rangeClosed(1,5) 메서드를 이용하여 IntStream  생성하기");
		IntStream.rangeClosed(1,5).forEach(s->System.out.print(s+ "\t"));
	}
}
