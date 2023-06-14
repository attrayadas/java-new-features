package com.attraya.java8.predicate;

import java.util.List;
import java.util.function.Predicate;

/**
 * This Functional interface used for conditional check where you think, we can
 * use these true/false returning functions in day to day programming we should
 * choose Predicate
 *
 */
public class PredicateDemo {

	public static void main(String[] args) {

//		Predicate<Integer> predicate = t -> t % 2 == 0;
//		System.out.println(predicate.test(8));

		List<Integer> list = List.of(1, 2, 3, 4, 5);
		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Print even: " + t));
	}

}
