package io.arha.day.missed.factory;

import java.util.Arrays;
import java.util.List;

public class Event {

	public static void main(String[] agr) {
		List<String> users = Arrays.asList("", "");
		NoticationServcie noticationServcie = new ObjectFactory().getInstance("PUSH_NOTI");
		noticationServcie.sendNotification(users);
	}
}
