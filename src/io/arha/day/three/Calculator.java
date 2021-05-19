package io.arha.day.three;

public class Calculator {

	private double number1;
	private double number2;
	private double result = 0;
	private char opration;

	public Calculator(double number1, double number2, char opration) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.opration = opration;
	}

	public double calculate() {
		switch (opration) {
		case '+':
			System.out.println("in addition");
			result = number1 + number2;
			break;
		case '-':
			System.out.println("in subtraction");
			result = number1 - number2;
			break;
		case '*':
			System.out.println("in multiplication");
			result = number1 * number2;
			break;
		case '/':
			System.out.println("in devision");
			result = number1 / number2;
			break;

		default:
			System.out.println("Undefined opration.");
			break;
		}
		System.out.println("End of switch case");
		return result;
	}

}
