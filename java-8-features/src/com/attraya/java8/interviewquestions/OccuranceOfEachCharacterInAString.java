package com.attraya.java8.interviewquestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/** Java program to count the occurrence of each character in a string */
public class OccuranceOfEachCharacterInAString {

	public static void main(String[] args) {

		String input = "ilovejavatechie";
		String[] results = input.split("");

		Map<String, Long> map = Arrays.stream(results)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}

}

//Output:
//	{a=2, c=1, t=1, e=3, v=2, h=1, i=2, j=1, l=1, o=1}