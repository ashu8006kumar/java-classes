package io.arha.day.one;

public class Animal {
	String type;
	int weight;
	String color;
	

	public void introduce() {
		System.out.println("Hey I am a " + type + ". My color is " + color);
	}

	public Animal(String type, int weight, String color) {
		super();
		this.type = type;
		this.weight = weight;
		this.color = color;
	}

}
