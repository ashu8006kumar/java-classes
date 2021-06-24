package io.arha.day.missed.factory;

public class ObjectFactory {

	NoticationServcie getInstance(String type) {

		switch (type) {
		case "SMS":
			return new SmsNotificationService();
		case "EMAIL":
			return new EmailNotificationService();
		case "PUSH_NOTI":
			return new EmailNotificationService();
		default:
			System.err.println("out of order");
			break;
		}
		throw new RuntimeException("No implementation for this key");

	}
}
