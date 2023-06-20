package com.attraya.java8.interviewquestions;

import java.util.Arrays;
import java.util.Comparator;

/** Java program to find the second highest number in a given array */
public class SecondHighestNumberInAGivenArray {

	public static void main(String[] args) {

		int[] numbers = { 5, 9, 11, 2, 8, 21, 1 };

		Integer secondHighestNumber = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
		System.out.println(secondHighestNumber);
	}

}

//Output: 11