package com.attraya.java8.parallelstream.example2;

import java.util.List;

public class ParallelStreamExample {

	public static void main(String[] args) {

		long start = 0;
		long end = 0;

		List<Employee> employees = EmployeeDatabase.getEmployees();

		// Normal Stream:
		start = System.currentTimeMillis();
		double salaryWithStream = employees.stream().map(Employee::getSalary).mapToDouble(i -> i).average()
				.getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("Normal stream took time: " + (end - start) + " ms. Avg salary: " + salaryWithStream);

		start = System.currentTimeMillis();
		double salaryWithParallelStream = employees.parallelStream().map(Employee::getSalary).mapToDouble(i -> i)
				.average().getAsDouble();
		end = System.currentTimeMillis();
		System.out
				.println("Parallel stream took time: " + (end - start) + " ms. Avg salary: " + salaryWithParallelStream);
	}

}

//Output:
//	Normal stream took time: 50 ms. Avg salary: 50274.399
//	Parallel stream took time: 13 ms. Avg salary: 50274.399
