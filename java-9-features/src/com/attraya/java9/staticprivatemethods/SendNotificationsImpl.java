package com.attraya.java9.staticprivatemethods;

public class SendNotificationsImpl implements SendNotifications {

	public static void main(String[] args) {

		SendNotifications.sendNotification();
		SendNotifications.sendNotifications();

	}

}

//Output:
//	Establishing a connection...
//	Sending notification!
//	Establishing a connection...
//	Sending multiple notifications!