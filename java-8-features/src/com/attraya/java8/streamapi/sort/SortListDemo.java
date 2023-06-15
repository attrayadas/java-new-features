package com.attraya.java8.streamapi.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);

		Collections.sort(list); // Ascending order
		Collections.reverse(list); // Descending order
		System.out.println(list);

		list.stream().sorted().forEach(e -> System.out.println("In Ascending order: " + e)); // Ascending order
		list.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println("In Descending order: " + e)); // Descending
																														// order
	}

}
