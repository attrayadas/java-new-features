package com.attraya.java8.streamapi.reduce.example2;

import java.util.List;

public class MapReduceExample {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeDatabase.getEmployees();

		// get employees whose grade A
		// get salary
		// get average salary
		double avgSalary = employees.stream().filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
				.map(employee -> employee.getSalary()).mapToDouble(i -> i).average().getAsDouble();
		System.out.println("Average salary of Grade A employees: " + avgSalary);

		double sumSalary = employees.stream().filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
				.map(employee -> employee.getSalary()).mapToDouble(i -> i).sum();
		System.out.println("Sum of salaries of Grade A employees: " + sumSalary);
	}

}

//Output:
//	Average salary of Grade A employees: 76666.66666666667
//	Sum of salaries of Grade A employees: 230000.0
