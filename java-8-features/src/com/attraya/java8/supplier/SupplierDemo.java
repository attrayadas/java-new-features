package com.attraya.java8.supplier;

import java.util.List;
import java.util.function.Supplier;

/**
 * Supplier can be used in all contexts where there is no input but an output is
 * expected.
 *
 */
public class SupplierDemo {

	public static void main(String[] args) {

//		Supplier<String> supplier = () -> "Hi Java Techie";
//		System.out.println(supplier.get());

		List<String> list = List.of();
		System.out.println(list.stream().findAny().orElseGet(() -> "Hi Java Techie"));
	}

}
