package com.attraya.java8.streamapi.mapvsflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {

		List<Customer> customers = EkartDatabase.getAll();

		// List<Customer> to List<String> ---> Data Transformation (mapping)
		// customer ---> customer.getEmail() :: One to One Mapping
		List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);

		// customer ---> customer.getPhoneNumbers() :: One to Many Mapping
		List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println(phoneNumbers);

		// List<Customer> to List<String> ---> Data Transformation
		// customer ---> customer.getPhoneNumbers() :: One to Many mapping
		List<String> phones = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println(phones);
	}

}
