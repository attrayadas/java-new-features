package com.attraya.java12.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * We can use getComactNumberInstance() and different types of styles
 *
 */
public class NumberFormatDemo {

	public static void main(String[] args) {

		NumberFormat format = NumberFormat.getCompactNumberInstance();
		System.out.println(format.format(1000));

		format = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		System.out.println(format.format(1000));
		System.out.println(format.format(1000000));
	}

}

//Output:
//	1K
//	1 thousand
//	1 million