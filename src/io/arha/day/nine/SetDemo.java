package io.arha.day.nine;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set= new HashSet<>();
		set.add("Ashish");
		set.add("Ashish 1");
		set.add("Ashish1");
		set.add("Ashish");
		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
			
		}
	}

}
