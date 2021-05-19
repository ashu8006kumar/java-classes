package io.arha.day.six;

import io.arha.day.three.Calculator;

public class SixExample {

	public static void main(String[] arg) {
		Calculator calculator = new Calculator(12.0, 0, '/');
		System.out.println(calculator.calculate());
	}
}
