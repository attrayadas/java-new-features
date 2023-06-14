package com.attraya.java8.streamapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class StreamForEachDemo {

	public static void main(String[] args) {

		List<String> list = List.of("Murrit", "John", "Piter", "Marek", "Mac");
		list.stream().forEach(t -> System.out.println(t));
		list.stream().filter(t -> t.startsWith("M")).forEach(t -> System.out.println("Elements starts with m: " + t));

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");

		map.forEach((key, value) -> System.out.println(key + " : " + value));
		map.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(obj -> System.out.println("Even Key: " + obj));

		Consumer<String> consumer = (t) -> System.out.println(t);
		for (String s1 : list) {
			consumer.accept(s1);
		}
	}

}
