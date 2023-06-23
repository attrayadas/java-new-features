package com.attraya.java13and14.record;

/**
 * Makes easy for creating model class. No need of creating setters, getters,
 * toString,... All are being taken care of by record
 *
 */
public class RecordDemo {

	record Employee(String name, int sal) {
	}

	public static void main(String[] args) {

		Employee employee = new Employee("John", 11000);
		System.out.println(employee);
		System.out.println(employee.name());
		System.out.println(employee.sal());
		System.out.println(employee.hashCode());

		Employee employee2 = new Employee("Bob", 1212);
		System.out.println(employee2.hashCode());

		Employee employee3 = new Employee("John", 11000);
		System.out.println(employee3.equals(employee));
		System.out.println(employee3.hashCode());

	}

}

//Output:
//	Employee[name=John, sal=11000]
//			John
//			11000
//			71761709
//			2077127
//			true
//			71761709
