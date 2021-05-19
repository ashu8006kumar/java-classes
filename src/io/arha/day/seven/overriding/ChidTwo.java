package io.arha.day.seven.overriding;

public class ChidTwo extends Base {
	@Override
	public int area(int side) {
		System.out.println("ChidTwo area");
		return side * side;
	}
	
	public int some(int side) {
		return side * side;
	}
}
