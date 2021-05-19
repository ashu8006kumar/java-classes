package io.arha.day.four;

public class ArrayExample {
//	public static void main(String[] agr) {
//		int[] arr = new int[10];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i * 20;
//		}
//		arr[0] = 1;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + ",");
//		}
//	}
	public static void main(String[] arg) {
		String[] names = { "Ashish", "Nimesh", "Pravash", "Gitesh", "Sandesh" };
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + ",");
		}
		System.out.println();
		System.out.println("New loop");
		
		for (String name : names) {
			System.out.print(name + ",");
		}
	}
}
