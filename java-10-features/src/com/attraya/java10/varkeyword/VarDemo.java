package com.attraya.java10.varkeyword;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

/**
 * If we declare a variable using var keyword, the compiler will infer the type.
 * Some restrictions:
 * - We cannot use var at class level 
 * - We cannot use var to assign a lambda expression 
 * - We cannot assign null value to a var type
 */
public class VarDemo {

	// var string="xyz"; // We cannot use var at class level

	public static void main(String[] args) {

		var x = 10; // same as int x=10;

		var map = new HashMap<String, List<String>>();

		for (var entry : map.entrySet()) {
			var value = entry.getValue();
		}

		var list = new ArrayList<>();
		list.add(123);
		list.add("xyz");

		// var s = null; // We can't assign null to var

		Consumer<Integer> l = (i) -> { // We can't replace the Interface name with var
			System.out.println(i);
		};

	}

}
