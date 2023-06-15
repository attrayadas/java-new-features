package com.attraya.java8.streamapi.sort;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.attraya.java8.streamapi.example2.Employee;

public class SortMapDemoUsingComparator {

	public static void main(String[] args) {

		Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));

		employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
		employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
		employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
		employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
		employeeMap.put(new Employee(176, "Prakash", "SOCIAL", 1200000), 120);

		System.out.println(employeeMap);

		System.out.println();

		employeeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed()))
				.forEach(s -> System.out.println(s));

	}

}
