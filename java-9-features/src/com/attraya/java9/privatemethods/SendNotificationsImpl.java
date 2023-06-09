package com.attraya.java9.privatemethods;

public class SendNotificationsImpl implements SendNotifications {

	public static void main(String[] args) {

		SendNotifications sendNotifications = new SendNotificationsImpl();
		sendNotifications.sendNotification();
		sendNotifications.sendNotifications();

	}

}

//Output:
//	Establishing a connection...
//	Sending notification!
//	Establishing a connection...
//	Sending multiple notifications!