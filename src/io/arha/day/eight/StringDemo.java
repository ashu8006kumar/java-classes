package io.arha.day.eight;

public class StringDemo {
	public static void main(String[] agr) { 
		String text = "My name is Ashish"; // 200 
		String name = new String("My name is Ashish"); // 200  heap space
	 
		
		System.out.println(text);
		System.out.println(name);
		System.out.println(text.length());
		System.out.println(name.length());
		System.out.println(name.charAt(1));
		

		System.out.println(text==name); // ref
		System.out.println(text.equals(name));//true
	}
}
