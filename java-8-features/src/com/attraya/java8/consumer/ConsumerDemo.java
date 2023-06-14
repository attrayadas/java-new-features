package com.attraya.java8.consumer;

import java.util.List;
import java.util.function.Consumer;

/**
 * Consumer<T> can be used where an object needs to be consumed i.e taken as
 * input, and some operation is to be performed on the object without returning
 * any result
 *
 */
public class ConsumerDemo {
	public static void main(String[] args) {

//		Consumer<Integer> consumer = t -> System.out.println("Printing: " + t);
//
//		consumer.accept(10);

		List<Integer> list = List.of(1, 2, 3, 4, 5);
		list.stream().forEach(t -> System.out.println("print: " + t));
	}

}
