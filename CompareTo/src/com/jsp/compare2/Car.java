package com.jsp.compare2;

public class Car implements Comparable<Car>{
	
	String brand;
	int cost;
	
	
	public Car(String brand, int cost) {
		this.brand= brand;
		this.cost=cost;
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", cost=" + cost + "]";
	}


	@Override
	public int compareTo(Car c) {
		return this.cost-c.cost;
	}
	
	

}
