package io.arha.day.one;

/**
 * 
 * @author ashish
 *
 */
public class Student {
	private String name;
	private int rollNumber;

	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public String introduceYourself() {
		return String.format("Hey! I am %s. My rollNumber is %d", name, rollNumber);
	}

	public static void main(String[] args) {
		Student james = new Student("James ", 1);
		Student mary = new Student("Mary Jennif", 2);
		Student frank = new Student("Frank Sardana", 3);
		Student upasna = new Student("Upasna Mittal", 5);
		System.out.println(james.introduceYourself());
//		System.out.println(mary.introduceYourself());
//		System.out.println(frank.introduceYourself());
//		System.out.println(upasna.introduceYourself());
	}
}
