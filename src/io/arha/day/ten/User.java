package io.arha.day.ten;

public class User {
	private String name;
	private int rollNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public User(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	@Override
	public int hashCode() {
		return rollNumber % 2; // 0,1
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof User) {
			User user = (User) o;
			if (rollNumber == user.rollNumber) {
				return ((name != null && name.equals(user.name)) || (name == null || user.name == null));
			}
		}
		return false;

	}

}
