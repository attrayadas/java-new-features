package com.attraya.java11.isemptymethod;

import java.util.Optional;

public class OptionalUpdates {

	public static void main(String[] args) {

		/**
		 * Earlier to Java 11, we had to use:
		 * if(!str.isPresent()) {}
		 */
		Optional<String> str = Optional.of("test");
		System.out.println(str.isEmpty());

	}

}
