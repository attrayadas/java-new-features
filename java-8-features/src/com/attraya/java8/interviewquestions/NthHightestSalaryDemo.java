package com.attraya.java8.interviewquestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class NthHightestSalaryDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("anil", 1000);
		map.put("ankit", 1200);
		map.put("bhavna", 1200);
		map.put("james", 1200);
		map.put("micael", 1000);
		map.put("tom", 1300);
		map.put("daniel", 1300);

//		System.out.println(getNthHighestSalary(4, map));

		System.out.println(getDynamicNthHighestSalary(3, map));
	}

	// It will not work properly, if 2 or more employees have same salary
	public static Entry<String, Integer> getNthHighestSalary(int num, Map<String, Integer> map) {

		return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toList()).get(num - 1);

	}

	public static Map.Entry<Integer, List<String>> getDynamicNthHighestSalary(int num, Map<String, Integer> map) {
		return map.entrySet().stream()
				.collect(Collectors.groupingBy(Map.Entry::getValue,
						Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
				.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.collect(Collectors.toList()).get(num - 1);
	}

}
