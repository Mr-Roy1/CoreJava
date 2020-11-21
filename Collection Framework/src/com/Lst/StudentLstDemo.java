package com.Lst;

import java.util.LinkedList;

public class StudentLstDemo {
	public static void main(String[] args) {
		Student s1 = new Student("Ritesh", 76.4);
		Student s2 = new Student("Ranjit", 58.2);
		Student s3 = new Student("Rahul", 89.9);
		Student s4 = new Student("Niraj", 99.5);

		LinkedList<Student> lst = new LinkedList<Student>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		// this will print object Reference...
		for (int i = lst.size() - 1; i >= 0; i--) {
			Student s = lst.get(i);
			System.out.println(s);
		}
		System.out.println("___________________________");
		for (int i = 0; i < lst.size(); i++) {
			Student s11 = lst.get(i);
			System.out.println(s11.name + " " + s11.perc);
		}

	}
}
