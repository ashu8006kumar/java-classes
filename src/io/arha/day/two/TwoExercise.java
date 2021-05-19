package io.arha.day.two;

public class TwoExercise {
	public static void main(String[] args) {

		final int leagalAgeOfVoting = 18;
		final int seniorCitizen = 60;

		int inputAge = 10;

		if (inputAge >= seniorCitizen) {
			System.out.println("*********You can vote.*********");

			System.out.println("********* Senior Citizen.*********");
		} else if (inputAge >= leagalAgeOfVoting) {
			System.out.println("*********You can vote.*********");

		} else {
			System.out.println("*********You can't vote.*********");
		}
 
		System.out.println("-----Not part of if statement-----");

	}

}
