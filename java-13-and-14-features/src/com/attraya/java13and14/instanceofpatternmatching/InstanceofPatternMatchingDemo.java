package com.attraya.java13and14.instanceofpatternmatching;

public class InstanceofPatternMatchingDemo {

	public static void main(String[] args) {

		Object object = get();
		if (object instanceof String str) {
//			String str = (String) object; // We don't need this line now
			System.out.println(str);
		}

	}

	public static Object get() {
		return "Pattern Matching in action";
	}

}
