package com.attraya.java8.interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Java program to find all duplicate and unique elements from a given string
 */
public class DublicateAndUniqueElementsInAString {

	public static void main(String[] args) {

		String input = "ilovejavatechie";
		String[] results = input.split("");

		List<String> duplicateElements = Arrays.stream(results)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Dublicate elements of " + input + " are: " + duplicateElements);

		List<String> uniqueElements = Arrays.stream(results)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Unique elements of " + input + " are: " + uniqueElements);
	}

}

//Output:
//	Dublicate elements of ilovejavatechie are: [a, e, v, i]
//	Unique elements of ilovejavatechie are: [c, t, h, j, l, o]

