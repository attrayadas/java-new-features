package com.attraya.java16.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * "B" is the new pattern which is introduced that uses period of the day:
 * Morning, Evening, ...
 *
 */
public class DateTimeDemo {

	public static void main(String[] args) {

		LocalTime time = LocalTime.parse("19:30:09.123456");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hm B");
		System.out.println(time.format(formatter));
	}

}
