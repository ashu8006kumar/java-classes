package io.arha.day.missed.map;

import java.util.Comparator;

public class CustomSort implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) { 
		return o1.getModel().compareTo(o2.getModel());
	}

}
