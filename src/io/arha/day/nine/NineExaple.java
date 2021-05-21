package io.arha.day.nine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class NineExaple {

	public static void main(String[] agr) {
		List<String> l = new ArrayList<>(40); //
		l.add("String value");
		l.add( "Ashish");
		l.add( "Ashish"); 
		l.add( "Ashish"); 
		l.add( "Ashish"); 
		l.add("String value"); 
		Collections.synchronizedList(l);

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i)); // l[i]; l.get(i)
		}
		
		for (Iterator<String> iterator = l.iterator(); iterator.hasNext();) {//
			System.out.println(iterator.next());

		}
		for (ListIterator<String> iterator = l.listIterator(); iterator.hasNext();) {
			System.out.println(iterator.next());

		}

		for (String value : l) {
			System.out.println(value);
		} 
		
		l.stream().forEach(System.out::println);
		l.stream().forEach(value -> System.out.println(value));
		l.stream().forEach(value -> {
			System.out.println(value);
		});
	}
}
