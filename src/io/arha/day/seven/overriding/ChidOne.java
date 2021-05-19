package io.arha.day.seven.overriding;

public class ChidOne extends Base {
	@Override
	public int area(int side) {
		System.out.println("ChidOne area");
		return side * side;
	}
}
