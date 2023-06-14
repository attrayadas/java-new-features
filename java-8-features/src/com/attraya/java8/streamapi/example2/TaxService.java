package com.attraya.java8.streamapi.example2;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

	public static List<Employee> evaluateTaxUsers(String input) {
		return (input.equalsIgnoreCase("tax"))
				? DataBase.getEmloyees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
				: DataBase.getEmloyees().stream().filter(emp -> emp.getSalary() <= 500000).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		System.out.println(TaxService.evaluateTaxUsers("tax"));
	}
}
