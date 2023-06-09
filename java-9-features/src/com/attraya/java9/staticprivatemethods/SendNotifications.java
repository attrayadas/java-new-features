package com.attraya.java9.staticprivatemethods;

public interface SendNotifications {

	static void sendNotifications() {
		establishConnection();
		System.out.println("Sending multiple notifications!");
	}

	static void sendNotification() {
		establishConnection();
		System.out.println("Sending notification!");
	}

	/**
	 * private methods in interfaces enable the reuse of common functionality within
	 * default methods. We need to declare the private methods as static if the
	 * default methods are static
	 */

	private static void establishConnection() {
		System.out.println("Establishing a connection...");
	}

}
