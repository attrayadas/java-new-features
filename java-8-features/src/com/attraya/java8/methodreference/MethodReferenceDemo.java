package com.attraya.java8.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Types of Method Reference: 
 * 1. Reference to static method 
 * 2. Reference to instance method of object type 
 * 3. Reference constructor
 *
 */
public class MethodReferenceDemo {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeService();

		/** Lambda Expression */
		service.loadEmployeesFromDB().forEach(employee -> System.out.println(employee));

		System.out.println();

		/** Method Reference with custom type */
		service.loadEmployeesFromDB().forEach(MethodReferenceDemo::print);

		System.out.println();

		/** Method Reference with pre-defined class */
		service.loadEmployeesFromDB().forEach(System.out::println);

		System.out.println("------------------------------------");

		EmployeeMapper employeeMapper = new EmployeeMapper();
		List<EmployeeDO> employeeDOS = service.loadEmployeesFromDB().stream().map(employeeMapper::convert)
				.collect(Collectors.toList());
		System.out.println(employeeDOS);

		/**
		 * Although getName is non static, we can still call it using the static way
		 * (using class name) in method referencing. It will not work if the getName
		 * takes some parameters.
		 */
		List<String> nameList = service.loadEmployeesFromDB().stream().map(Employee::getName)
				.collect(Collectors.toList());
		System.out.println(nameList);

		EmployeeManager manager = () -> new Employee();
		manager.getEmployee().getEmployeeInfo();

		EmployeeManager manager1 = Employee::new;
		manager1.getEmployee().getEmployeeInfo();

		service.loadEmployeesFromDB().stream().map(Employee::getId).map(ArrayList::new);
	}

	public static void print(Employee employee) {
		System.out.println(employee);
	}

}
