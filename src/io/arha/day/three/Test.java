package io.arha.day.three;

public class Test {
	void checkLegalageOfVoting(int inputAge) {
		final int leagalAgeOfVoting = 18;

		if (inputAge >= leagalAgeOfVoting) {
			System.out.println("*********You can vote.*********");

		} else {
			throw new UnderageExecption("You are under legal age of voting");
		}
	}

	public static void main(String[] arg) {
		Test test = new Test();
		test.checkLegalageOfVoting(10);
		System.out.println("-----Not part of if statement-----");

	}
}
