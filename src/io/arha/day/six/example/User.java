package io.arha.day.six.example;

public class User { 
	private int id;
	private int numberOfChange = 0;
	private String name;

//setter
	public void setId(int id) {
		numberOfChange++;
		this.id = id;
	}

//getter
	public int getId() {
		return id;
	}

	// setter
	public void setName(String name) {
		numberOfChange++;
		this.name = name;
	}

	// getter
	public String getName() {
		return name;
	}
}
