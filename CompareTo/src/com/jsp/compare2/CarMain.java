package com.jsp.compare2;

import java.util.TreeSet;

public class CarMain {
	public static void main(String[] args) {
		
	
	
	TreeSet<Car> ts = new TreeSet<Car>();
	ts.add(new Car("Audi",129));
	ts.add(new Car("BMW",122));
	ts.add(new Car("Supra",222));
	
	for(Car c:ts) {
		System.out.println(c);
	}

}
}