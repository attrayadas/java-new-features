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

//Output:
//	Employee [id=1, name=employee1, salary=2069.0]
//			Employee [id=2, name=employee2, salary=836.0]
//			Employee [id=3, name=employee3, salary=375.0]
//			Employee [id=4, name=employee4, salary=2891.0]
//			Employee [id=5, name=employee5, salary=4902.0]
//			Employee [id=6, name=employee6, salary=4444.0]
//			Employee [id=7, name=employee7, salary=964.0]
//			Employee [id=8, name=employee8, salary=4421.0]
//			Employee [id=9, name=employee9, salary=4736.0]
//			Employee [id=10, name=employee10, salary=3429.0]
//
//			Employee [id=1, name=employee1, salary=2339.0]
//			Employee [id=2, name=employee2, salary=2542.0]
//			Employee [id=3, name=employee3, salary=3773.0]
//			Employee [id=4, name=employee4, salary=1200.0]
//			Employee [id=5, name=employee5, salary=3131.0]
//			Employee [id=6, name=employee6, salary=4495.0]
//			Employee [id=7, name=employee7, salary=4128.0]
//			Employee [id=8, name=employee8, salary=4454.0]
//			Employee [id=9, name=employee9, salary=1248.0]
//			Employee [id=10, name=employee10, salary=1525.0]
//
//			Employee [id=1, name=employee1, salary=682.0]
//			Employee [id=2, name=employee2, salary=3019.0]
//			Employee [id=3, name=employee3, salary=3351.0]
//			Employee [id=4, name=employee4, salary=3075.0]
//			Employee [id=5, name=employee5, salary=447.0]
//			Employee [id=6, name=employee6, salary=4291.0]
//			Employee [id=7, name=employee7, salary=1025.0]
//			Employee [id=8, name=employee8, salary=2921.0]
//			Employee [id=9, name=employee9, salary=4518.0]
//			Employee [id=10, name=employee10, salary=1825.0]
//			------------------------------------
//			[Employee [id=1, name=employee1, salary=2857.0], Employee [id=2, name=employee2, salary=2037.0], Employee [id=3, name=employee3, salary=1096.0], Employee [id=4, name=employee4, salary=2207.0], Employee [id=5, name=employee5, salary=4728.0], Employee [id=6, name=employee6, salary=4564.0], Employee [id=7, name=employee7, salary=26.0], Employee [id=8, name=employee8, salary=4995.0], Employee [id=9, name=employee9, salary=3127.0], Employee [id=10, name=employee10, salary=3304.0]]
//			[employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10]
//			I am a method in Employee class
//			I am a method in Employee class