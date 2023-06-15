package com.attraya.java8.optionalclass;

import java.util.List;

import com.attraya.java8.streamapi.mapvsflatmap.Customer;
import com.attraya.java8.streamapi.mapvsflatmap.EkartDatabase;

public class OptionlDemo2 {

	public static Customer getCustomerByEmailId(String email) throws Exception {
		
		List<Customer> customers = EkartDatabase.getAll();
		return customers.stream().filter(customer -> customer.getEmail().equals(email)).findAny()
				.orElseThrow(() -> new Exception("no customer present with this email id"));
	}

	public static void main(String[] args) throws Exception {
		getCustomerByEmailId("pqr");
	}

}
