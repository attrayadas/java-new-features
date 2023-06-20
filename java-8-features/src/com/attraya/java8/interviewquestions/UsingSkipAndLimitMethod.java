package com.attraya.java8.interviewquestions;

import java.util.stream.IntStream;

public class UsingSkipAndLimitMethod {

	public static void main(String[] args) {

		IntStream.rangeClosed(1, 10).skip(1).limit(8).forEach(System.out::println);

	}
}

//Output:
//	2
//	3
//	4
//	5
//	6
//	7
//	8
//	9