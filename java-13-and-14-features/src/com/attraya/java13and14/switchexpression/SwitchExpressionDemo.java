package com.attraya.java13and14.switchexpression;

public class SwitchExpressionDemo {

	public static void main(String[] args) {

		int key = 2;

		String result = switch (key) {
		case 1: {

			yield "Choice 1";
		}
		default:
			yield "Invalid Choice";
		};

		System.out.println(result);
	}

}
