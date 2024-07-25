package com.jsp.compare;

public class Student implements Comparable<Student> {
	
	int age;
	String name;
	
	public Student(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	public int compareTo(Student s) {
		return this.age-s.age;
	}

}
