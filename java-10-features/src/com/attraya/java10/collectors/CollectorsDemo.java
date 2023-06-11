package com.attraya.java10.collectors;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * In Java 9, we have methods like toUnmodifiableList(), toUnmodifiableSet(),
 * toUnmodifiableMap() to make the new list as immutable
 *
 */
public class CollectorsDemo {

	public static void main(String[] args) {

		List<Integer> list = List.of(15, 20, 17, 30);
		List<Integer> newList = list.stream().filter(i -> i % 3 == 0).collect(Collectors.toUnmodifiableList());
		// newList.add(89); // Error

		System.out.println(newList);

	}

}
