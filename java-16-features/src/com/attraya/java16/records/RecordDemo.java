package com.attraya.java16.records;

/**
 * Starting Java 16, we can use record inside inner classes
 *
 */
public class RecordDemo {

	class Inner {
		Product product = new Product("iPhone", "Good", 10000L);
	}

}
