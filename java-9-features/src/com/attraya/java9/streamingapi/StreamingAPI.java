package com.attraya.java9.streamingapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java 9 introduced three new methods: takeWhile(), dropWhile() and
 * ofNullable()
 *
 */
public class StreamingAPI {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 40, 7, 18, 23, 30, null);

		System.out.println("The list: " + list);

		/**
		 * Normal way of doing
		 */
		// System.out.println(list.stream().filter(x -> x % 5==0).collect(Collectors.toList()));

		/**
		 * takeWhile() will take the elements as long as it returns true, but the first
		 * time it hits an element that does not match the predicate, it will stop
		 */
		System.out.println("Using takeWhile: " + list.stream().takeWhile(x -> x % 5 == 0).collect(Collectors.toList()));

		/**
		 * As long as the condition returns true, it will not care about it. As long as
		 * it hits an element where the condition becomes false, it will stream the rest
		 * of the element
		 */
		System.out.println("Using dropWhile: "+list.stream().dropWhile(x -> x % 5 == 0).collect(Collectors.toList()));

		/**
		 * It will skip the null values, so we don't end up in null pointer exceptions
		 */
		System.out.println("Using ofNullable: "+list.stream().flatMap(x -> Stream.ofNullable(x)).collect(Collectors.toList()));
	}

}

//Output:
//	The list: [10, 40, 7, 18, 23, 30, null]
//	Using takeWhile: [10, 40]
//	Using dropWhile: [7, 18, 23, 30, null]
//	Using ofNullable: [10, 40, 7, 18, 23, 30]
