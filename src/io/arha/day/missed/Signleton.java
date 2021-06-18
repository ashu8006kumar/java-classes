package io.arha.day.missed;

public class Signleton {
	
	private static Signleton object;

	private Signleton() {

	}

	public static synchronized Signleton getInstance() {
		if (object == null) {
			object = new Signleton();
		}
		return object;
	}
}
