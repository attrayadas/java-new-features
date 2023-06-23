package com.attraya.java13and14.switchlambdasyntax;

public class SwitchLambdaSyntax {

	public static void main(String[] args) {

		int key = 2;

		/** First way: */
		String result = switch (key) {
		case 1: {

			yield "Choice 1";
		}
		default:
			yield "Invalid Choice";
		};

		System.out.println(result);

		int choice = 1;

		/** Second way: */
		String response = switch (choice) {
		case 1 -> {
			yield "You have zero balance";
		}
		case 2 -> {
			yield "You can get a loan";
		}
		case 3 -> {
			yield "Are you sure you have money?";
		}

		default -> throw new IllegalArgumentException("Unexpected value: " + key);
		};

		System.out.println(response);
	}

}

//Output:
//	Invalid Choice
//	You have zero balance
