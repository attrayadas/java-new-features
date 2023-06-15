package com.attraya.java8.optionalclass;

import java.util.Arrays;
import java.util.Optional;

import com.attraya.java8.streamapi.mapvsflatmap.Customer;

public class OptionalDemo {

	public static void main(String[] args) {
		Customer customer = new Customer(101, "john", "test@gmail.com", Arrays.asList("39757571", "11172588"));

		/**
		 * Three ways to create Optional object: 1. empty 2. of 3. ofNullable
		 */
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);

		/**
		 * When the object we are passing we know are not null, we can go for of()
		 * method
		 */
//		Optional<String> emailOptional = Optional.of(customer.getEmail());
//		System.out.println(emailOptional); // NullPointer exception

		/**
		 * When the object we are passing we know may or may not be null, we can go for
		 * ofNullable() method
		 */
		Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());

//		if(emailOptional2.isPresent()) {
//			System.out.println(emailOptional2.get());
//		}

//		System.out.println(emailOptional2.orElse("default@email.com"));

//		System.out.println(emailOptional2.orElseThrow(() -> new IllegalArgumentException("email not present")));

		System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(() -> "default email..."));

	}

}
