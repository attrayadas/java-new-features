package com.attraya.java8.streamapi.bifunction;

import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Real life use case of BiFunction is in map.replaceAll()
 *
 */
public class BiFunctionDemo {

	public static void main(String[] args) {

		List<Integer> list1 = Stream.of(1, 3, 4, 6, 7, 9, 19).collect(Collectors.toList());
		List<Integer> list2 = Stream.of(11, 3, 43, 6, 7, 19).collect(Collectors.toList());

		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction = (l1, l2) -> {
			return Stream.of(l1, l2).flatMap(List::stream).distinct().collect(Collectors.toList());
		};

		Function<List<Integer>, List<Integer>> sortedFunction = (lists) -> lists.stream().sorted()
				.collect(Collectors.toList());

		System.out.println("Lambda approach with sorting: " + biFunction.andThen(sortedFunction).apply(list1, list2));

		HashMap<String, Integer> map = new HashMap<>();
		map.put("basant", 5000);
		map.put("santosh", 15000);
		map.put("javed", 12000);

		map.replaceAll((k, v) -> v + 2500);
		System.out.println(map);
	}

}
