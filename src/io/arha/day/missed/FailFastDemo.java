package io.arha.day.missed;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastDemo {
	public static void main(String[] args) {
		Map<String, String> empName = new ConcurrentHashMap<>();
		empName.put("Sam Hanks", "New york");
		empName.put("Will Smith", "LA");
		empName.put("Scarlett", "Chicago");
		Iterator<Entry<String, String>> iterator = empName.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry= iterator.next();
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
			// adding an element to Map
			// exception will be thrown on next call
			// of next() method.
			empName.put("Istanbul", "Turkey");
		}
	}
}
