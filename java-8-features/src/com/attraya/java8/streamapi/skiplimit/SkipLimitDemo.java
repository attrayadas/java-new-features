package com.attraya.java8.streamapi.skiplimit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SkipLimitDemo {

	public static void main(String[] args) throws IOException {

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		numbers.stream().skip(1).limit(7).forEach(System.out::print);
		System.out.println();
		numbers.stream().skip(2).limit(6).forEach(System.out::print);
		System.out.println();
		
		
		List<String> fileContent = Files.readAllLines(Paths.get("src/com/attraya/java8/streamapi/skiplimit/data.txt"));
//		System.out.println(fileContent.size());
		fileContent.stream().skip(1).limit(fileContent.size()-2).forEach(System.out::println);
	}

}

//Output:
//	2345678
//	345678
//	101   Mobile      1      50000
//	102   watch       2      4000
//	103   TV          1      75000
//	104   HeadSet     3      15000
//	105   Books       1      1
//	106   Gym equip   3      15000