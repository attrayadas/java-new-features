package com.attraya.java8.streamapi.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		System.out.println();

		System.out.println("Comparing by keys:");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> System.out.println(e));
		
		System.out.println();
		
		System.out.println("Comparing by values:");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e -> System.out.println(e));
	}

}
