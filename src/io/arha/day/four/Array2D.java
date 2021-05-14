package io.arha.day.four;

public class Array2D { 
	public static void main(String[] arg) {
		
		
		String[][] arr = new String[2][3];

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = row + "-" + col;

			}
			System.out.println();
		}

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+"  ");

			}
			System.out.println();
		}
	}

}
