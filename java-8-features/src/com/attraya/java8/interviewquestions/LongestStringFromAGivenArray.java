package com.attraya.java8.interviewquestions;

import java.util.Arrays;

/** Java program to find the longest string from a given array */
public class LongestStringFromAGivenArray {

	public static void main(String[] args) {

		String[] strArray = { "java", "techie", "springboot", "microservices", "hibernate",
				"dockerk8s amazonwebservice" };

		String longestString1 = Arrays.stream(strArray)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println(longestString1);
	}

}
