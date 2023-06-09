package com.attraya.java9.immutablecollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {

		List<String> list = List.of("abc", "xyz", "123"); // We can't add null value
		// list.add("nyc"); // Error as list is immutable

		Set<String> set = Set.of("abc", "xyz", "nyc"); // We can't add duplicate values

		Map<Integer, String> map = Map.of(1, "Attraya", 2, "Sachin", 3, "Dhoni");

		System.out.println(list);
		System.out.println(set);
		System.out.println(map);
	}

}

//Output: [abc, xyz, 123]
//		[xyz, abc, nyc]
//		{2=Sachin, 3=Dhoni, 1=Attraya}
