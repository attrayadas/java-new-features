package com.attraya.java8.streamapi.reduce;

import java.util.List;
import java.util.Optional;

public class MapReduceDemo {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(3, 7, 8, 1, 5, 9);
		List<String> words = List.of("corejava", "spring", "hibernate", "maven");

		/* First Approach */
		int sum1 = 0;
		for (Integer nums : numbers) {
			sum1 = sum1 + nums;
		}
		System.out.println(sum1);

		/* Second Approach */
		int sum2 = numbers.stream().mapToInt(i -> i).sum();
		System.out.println(sum2);

		/* Third Approach */
		Integer sum3 = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum3);

		/* Fourth Approach */
		Optional<Integer> sum4 = numbers.stream().reduce(Integer::sum);
		System.out.println(sum4.get());

		Integer mul = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println(mul);

		Integer maxValue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(maxValue);

		Integer maxValue2 = numbers.stream().reduce(Integer::max).get();
		System.out.println(maxValue2);

		String maxWord = words.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();
		System.out.println(maxWord);
	}

}
