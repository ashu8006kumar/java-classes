package io.arha.day;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Diff {
	public static void main(String[] agr) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<String> list3 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");

		list2.add("a");
		list2.add("b");
		list2.add("d");
		list3.addAll(list2);
		
		list2.removeAll(list1);
		list1.removeAll(list3);
		list1.addAll(list2);
		 
		System.out.println(list1);
	}
}
