package com.attraya.java8.interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Java program to find all elements from array who starts with 1 */
public class AllElementsFromArrayWhoStartsWith1 {

	public static void main(String[] args) {

		int[] numbers = { 5, 9, 11, 2, 8, 21, 1, 29, 10, 111 };

		List<String> elementsStartsWith1 = Arrays.stream(numbers).boxed().map(s -> s + "")
				.filter(s -> s.startsWith("1")).collect(Collectors.toList());

		System.out.println(elementsStartsWith1);

	}
}

//Output:
//	[11, 1, 10, 111]