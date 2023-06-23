package com.attraya.java13and14.nullpointer;

public class NullPointerHelp {

	public static void main(String[] args) {

		String str = null;
		System.out.println(str.charAt(1));
	}

}

//To Run:
//	Run Configurations > Arguments > VM Arguments > paste: -XX:+ShowCodeDetailsInExceptionMessages > Run

//Output:
//	Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "str" is null
//	at java13and14features/com.attraya.java13and14.nullpointer.NullPointerHelp.main(NullPointerHelp.java:8)
