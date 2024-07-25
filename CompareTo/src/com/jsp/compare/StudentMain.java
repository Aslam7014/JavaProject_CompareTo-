package com.jsp.compare;

import java.util.TreeSet;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s1 = new Student(21,"Aslam");
		Student s2 = new Student(18,"Zishan");
		Student s3 = new Student(10,"Dashan");
		
		TreeSet<Student> ts= new TreeSet<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		for(Student s: ts) {
			System.out.println(s);
		}
	}

}
