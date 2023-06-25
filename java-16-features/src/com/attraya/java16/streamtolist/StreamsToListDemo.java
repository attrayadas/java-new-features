package com.attraya.java16.streamtolist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The collect(Collectors.toList()) has been simplified to just .toList()
 *
 */
public class StreamsToListDemo {

	public static void main(String[] args) {

		List<String> ids = Arrays.asList("123", "456", "789");

//		List<Integer> idsInInt = ids.stream().map(Integer::parseInt).collect(Collectors.toList()); //No need of .collect(Collectors.toList())

		List<Integer> idsInInt = ids.stream().map(Integer::parseInt).toList();

		System.out.println(idsInInt);
	}

}
