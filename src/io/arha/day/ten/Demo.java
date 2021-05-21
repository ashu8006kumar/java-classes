package io.arha.day.ten;

import java.util.HashSet;
import java.util.Set;

public class Demo {
	public static void main(String[] agr) {
		User nimesh = new User("nimesh", 1); 
		User rinku = new User("Rinku", 2); 
		User aiman = new User("Aiman", 3);
		User rinku2 = new User("Rinku", 2); 
		
		System.out.println(rinku2.equals(rinku));
		Set<User> users = new HashSet<>();// hash code and equals iff hashcode and equal method returns true

		users.add(nimesh);
		users.add(rinku);
		users.add(aiman);
		users.add(rinku2);
		for (User user : users) {
			System.out.print(user.getRollNumber());
			System.out.print("-");
			System.out.print(user.getName());
			
			System.out.print("-");
			System.out.print(user.hashCode());
			System.out.println(); 
		}
	}
}
