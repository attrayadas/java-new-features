package com.attraya.java11.stringupdates;

import java.util.stream.Collectors;

/**
 * New methods were introduced for String: isBlank(), lines(), strip(),
 * stripLeading(), stripTrailing(), repeat(int count)
 *
 */
public class StringUpdates {

	public static void main(String[] args) {

		String str = "          ";
		System.out.println(str.isBlank());

		str = "I\nam\nthe\ncreator of my destiny";
		System.out.println(str);
		System.out.println(str.lines().collect(Collectors.toList()));

		char c = '\u2000';
		str = c + str + c;

		System.out.println(str.trim()); // trim doesn't have unicode  support
		System.out.println(str.strip());
		System.out.println(str.stripLeading()); // removes the space from the beginning
		System.out.println(str.stripTrailing()); // removes space from the end

		System.out.println("-".repeat(100));
	}

}

//Output:
//	true
//	I
//	am
//	the
//	creator of my destiny
//	[I, am, the, creator of my destiny]
//	 I
//	am
//	the
//	creator of my destiny 
//	I
//	am
//	the
//	creator of my destiny
//	I
//	am
//	the
//	creator of my destiny 
//	 I
//	am
//	the
//	creator of my destiny
//	----------------------------------------------------------------------------------------------------