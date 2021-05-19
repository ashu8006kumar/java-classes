package io.arha.day.seven.overriding;

public class Base {

	public  int area(int side) {
		System.out.println("Base area");
		return side * side;
	}
	public int fun(int side) {
		return side * side;
	}
}
