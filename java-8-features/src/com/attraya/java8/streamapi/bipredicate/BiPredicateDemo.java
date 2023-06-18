package com.attraya.java8.streamapi.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {

		BiPredicate<String, String> equalsPredicate = (s1, s2) -> s1.equals(s2);
		BiPredicate<String, String> lenghtPredicate = (s1, s2) -> s1.length() == s2.length();

		System.out.println(equalsPredicate.test("madam", "madam"));
		System.out.println(equalsPredicate.test("mango", "apple"));

		System.out.println("and operator: " + lenghtPredicate.and(equalsPredicate).test("madam", "madam"));

		System.out.println("or operator: " + lenghtPredicate.or(equalsPredicate).test("madam", "madam"));

	}

}

//Output:
//	true
//	false
//	and operator: true
//	or operator: true
