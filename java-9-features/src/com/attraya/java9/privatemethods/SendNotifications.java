package com.attraya.java9.privatemethods;

public interface SendNotifications {

	default void sendNotifications() {
		establishConnection();
		System.out.println("Sending multiple notifications!");
	}

	default void sendNotification() {
		establishConnection();
		System.out.println("Sending notification!");
	}

	/**
	 * private methods in interfaces enable the reuse of common functionality within
	 * default methods
	 */

	private void establishConnection() {
		System.out.println("Establishing a connection...");
	}

}
