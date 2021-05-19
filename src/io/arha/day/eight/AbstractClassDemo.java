package io.arha.day.eight;

public abstract class AbstractClassDemo {

	static int area(int x, int y) {
		return x + y;
	}
	public AbstractClassDemo() {

		System.out.println("AbstractClassDemo");
	}
//May or may not have abstract
	abstract void draw();
}
