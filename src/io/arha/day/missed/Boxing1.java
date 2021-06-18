package io.arha.day.missed;

class Boxing1 {
	static void m(int i) {
		System.out.println("int");
	}

	static void m(Integer i) {
		System.out.println("Integer");
	}

	public static void main(String args[]) {
		Integer s = 30;
		m(s);
	}
}