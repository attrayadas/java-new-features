package com.attraya.java8.streamapi.sort;

import java.util.Comparator;
import java.util.List;

import com.attraya.java8.streamapi.example2.DataBase;
import com.attraya.java8.streamapi.example2.Employee;

public class SortListDemoUsingComparator {

	public static void main(String[] args) {

		List<Employee> employees = DataBase.getEmloyees();

		employees.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary())).forEach(System.out::println);

		System.out.println();

		employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println); // Using
																												// Function
																												// lambda

		System.out.println();

		employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println); // Using method
																											// referencing

	}

}

//Output:
//	Employee [id=176, name=Prakash, dept=SOCIAL, salary=1200000]
//	Employee [id=388, name=Bikash, dept=CIVIL, salary=900000]
//	Employee [id=176, name=Roshan, dept=IT, salary=600000]
//	Employee [id=470, name=Bimal, dept=DEFENCE, salary=500000]
//	Employee [id=624, name=Sourav, dept=CORE, salary=400000]
//
//	Employee [id=624, name=Sourav, dept=CORE, salary=400000]
//	Employee [id=470, name=Bimal, dept=DEFENCE, salary=500000]
//	Employee [id=176, name=Roshan, dept=IT, salary=600000]
//	Employee [id=388, name=Bikash, dept=CIVIL, salary=900000]
//	Employee [id=176, name=Prakash, dept=SOCIAL, salary=1200000]
//
//	Employee [id=388, name=Bikash, dept=CIVIL, salary=900000]
//	Employee [id=624, name=Sourav, dept=CORE, salary=400000]
//	Employee [id=470, name=Bimal, dept=DEFENCE, salary=500000]
//	Employee [id=176, name=Roshan, dept=IT, salary=600000]
//	Employee [id=176, name=Prakash, dept=SOCIAL, salary=1200000]
