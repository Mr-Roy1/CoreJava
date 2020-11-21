package com.Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class EmpDemoCol {
	public static void main(String[] args) {
		Employee e1 = new Employee(01,  40000, "pk");
		Employee e2 = new Employee(10, 50000,  "Ritesh");
		Employee e3 = new Employee(20, 60000,  "Niraj");
		Employee e4 = new Employee(30, 70000,  "Ranjit");
		Employee e5 = new Employee(40, 80000,  "rahul");
		Employee e6 = new Employee(50, 90000,  "Deepak");

		LinkedList<Employee> ll = new LinkedList<Employee>();
		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		ll.add(e4);
		ll.add(e5);
		ll.add(e6);

		Iterator<Employee> itr = ll.iterator();
		while (itr.hasNext()) {
			Employee pp = itr.next();
			System.out.println(pp.id+" "+pp.salary+" "+pp.name);
		}

	}

}
