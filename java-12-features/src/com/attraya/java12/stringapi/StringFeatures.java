package com.attraya.java12.stringapi;

/**
 * Two methods of String were introduced in Java 12: indent(), transform()
 * -We can pass positive value in indent, which will add the indentation/spaces at the beginning
 * -Negative number in indent will remove existing indentation
 * -transform() will take a function dynamically and it will apply the function on the String. 
 *
 */
public class StringFeatures {

	public static void main(String[] args) {
		
		String s="  All the power is within you, you can do anything and everything!!";
		System.out.println(s);
		System.out.println("After indentation: "+s.indent(5)); //It will add/remove spaces from the beginning
		System.out.println("Negative Indentation:"+s.indent(-4));
		
		String s1="10";
		Integer result = s1.transform(Integer::parseInt);
		System.out.println(result);
		
		
	}

}

//Output:
//	  All the power is within you, you can do anything and everything!!
//	  After indentation:        All the power is within you, you can do anything and everything!!
//
//	  Negative Indentation:All the power is within you, you can do anything and everything!!
//
//	  10
