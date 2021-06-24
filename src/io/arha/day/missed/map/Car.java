package io.arha.day.missed.map;

public class Car implements Comparable<Car> {
	private String model;
	private String make;
	private int year;

	public Car() {

	}

	public Car(String model, String make, int year) {
		this.model = model;
		this.make = make;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(Car o) {
		if (this.year > o.year) {
			return 1;
		} else if (this.year < o.year) {
			return -1;
		} else {  
			return 0;
		}
	}

}

