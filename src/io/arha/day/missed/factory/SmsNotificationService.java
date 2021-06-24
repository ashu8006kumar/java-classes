package io.arha.day.missed.factory;

import java.util.List;

public class SmsNotificationService implements NoticationServcie {

	@Override
	public String sendNotification(List<String> mobileNumber) {
		System.out.println("-Prepare SMS-");
		System.out.println("-get users mobile number-");
		for (String string : mobileNumber) {
			System.out.println("-Sms sent-" + string);
		}

		return null;
	}

}
