package io.arha.day.eight;

public class AbstractChild extends AbstractClassDemo {

	public AbstractChild(){
		System.out.println("AbstractChild");
	}
	@Override
	void draw() {
		System.out.println("AbstractChild:draw()");

	}

}
