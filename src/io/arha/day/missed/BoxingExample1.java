package io.arha.day.missed;

class BoxingExample1 {
	public static void main(String args[]) {
		int a1 = 50; 
		Integer a2 = new Integer(a1);// Boxing

		Integer a3 = 5;// Boxing

		System.out.println(a2 + " " + a3);
	}
}