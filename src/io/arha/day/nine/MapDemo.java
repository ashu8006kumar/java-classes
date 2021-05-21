package io.arha.day.nine;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] arg) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Ashish", 9);
		map.put("Ashish 2", 7766777);
		map.put("Ashish 22", 7766777);
		map.put("Ashish", 0);
		System.err.println(map.get("xyz"));
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
