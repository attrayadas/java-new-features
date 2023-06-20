package com.attraya.java8.interviewquestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/** Java program to find first non-repeat element from a given string */
public class FirstNonRepeatElementFromAString {

	public static void main(String[] args) {

		String input = "ilovejavatechie";
		String[] results = input.split("");

		// Had to convert into LinkedHashMap as it maintains the order
		String firstNonRepeatElement = Arrays.stream(results)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
		System.out.println("First non-repeat element: " + firstNonRepeatElement);

	}

}

//Output: First non-repeat element: l