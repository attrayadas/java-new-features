package com.attraya.java8.interviewquestions;

import java.util.Arrays;
import java.util.List;

public class UsingJoinMethodOfString {

	public static void main(String[] args) {

		List<String> nos = Arrays.asList("1", "2", "3", "4");

		String result1 = String.join("-", nos);
		System.out.println(result1);

		String result2 = String.join(",", nos);
		System.out.println(result2);
	}

}
