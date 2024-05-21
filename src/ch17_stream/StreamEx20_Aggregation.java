package ch17_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamEx20_Aggregation {
	public static void main(String[] args) {
		IntStream s = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });
		long count = Arrays.stream(new int[] { 1, 2, 3, 4, 5 })
				.filter(n -> n % 2 == 0)
				.count();
		System.out.println("2의 배수 개수: " + count);
		long sum = Arrays.stream(new int[] { 1, 2, 3, 4, 5 })
				.filter(n -> n % 2 == 0)
				.sum();
		System.out.println("2의 배수의 합: " + sum);
		double avg = Arrays.stream(new int[] { 1, 2, 3, 4, 5 })
				.filter(n -> n % 2 == 0)
				.average()
				.getAsDouble();
		System.out.println("2의 배수의 평균: " + avg);
		
	}
}