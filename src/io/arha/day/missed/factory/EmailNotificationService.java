package io.arha.day.missed.factory;

import java.util.List;

public class EmailNotificationService implements NoticationServcie {

	@Override
	public String sendNotification(List<String> emails) {
		System.out.println("-Prepare Email-");
		System.out.println("-get users emails-");
		System.out.println("-email sent-");
		for (String string : emails) {
			System.out.println("-email sent-" + string);
		}
		return null;
	}

}
