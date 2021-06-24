package io.arha.day.missed.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] ar) {
		Car car = new Car("City", "Hodna", 2012);
		Car car1 = new Car("City", "Hodna", 2014);
		Car car2 = new Car("City", "Hodna", 2017);
		Car car3 = new Car("City", "Hodna", 2021);

		Car tataCar = new Car("Tiago", "TATA", 2012);
		Car tataCar1 = new Car("Tiago", "TATA", 2013);
		Car tataCar2 = new Car("Tiago", "TATA", 2017);

		List<Car> cars = new ArrayList<>();
		cars.add(car);
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(tataCar);
		cars.add(tataCar1);
		cars.add(tataCar2);
		Collections.sort(cars,new CustomSort());
		for (Car carObject : cars) {
			System.out.print(carObject.getModel());
			System.out.print("------");
			System.out.print(carObject.getMake());
			System.out.print("------");
			System.out.println(carObject.getYear());
		}
//		List<String> list = new ArrayList<>();
//		list.add("Ashish");
//		list.add("Akash");
//		list.add("Nimesh");
//		list.add("Nirisha");
//		list.add("Sabin");
//		list.add("Anjal");
//		list.add("Abinna");
//		Collections.sort(list,Collections.reverseOrder()); 
//		for (String name : list) {
//			System.out.println(name);
//		}
	}
}
