package io.arha.day.seven;

public class Overloading {
// sq
	int area(int side) {
		return side * side;
	}

// ractangle
	private int area(int l, int b) {
		return l * b;
	}

	private void area(float l, int b) {
	}

	public Overloading() {

	}

	public Overloading(int x) {

	}

	public static void main(String[] agr) {
		Overloading seven = new Overloading();
		System.out.println(seven.area(2));
		System.out.println(seven.area(1, 2));
	}
}
