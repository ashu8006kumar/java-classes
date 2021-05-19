package io.arha.day.one;

public class Example {
	public void minAndMaxValue(int value1, int value2) {
		if (value1 > value2) {
			System.out.println("Min value:" + value2);
			System.out.println("Max value:" + value1);
		} else {
			System.out.println("Min value:" + value1);
			System.out.println("Max value:" + value2);
		}
	}

	public static void main(String[] args) { 
		Example example = new Example();
		example.minAndMaxValue(20, 40);
		System.out.println("================");
		example.minAndMaxValue(80, 40);
	}
}
