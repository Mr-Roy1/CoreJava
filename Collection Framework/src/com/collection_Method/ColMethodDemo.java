package com.collection_Method;

import java.util.ArrayList;

public class ColMethodDemo

{
	public static void main(String[] args) {
		ArrayList<String> csCol = new ArrayList<String>();
		csCol.add("Raj");
		csCol.add("Irfan");
		csCol.add("Bheem");
		csCol.add("Nisha");

		ArrayList<String> ecCol = new ArrayList<String>();
		ecCol.add("Nikhil");
		ecCol.add("Manju");
		ecCol.add("Ash");
		ecCol.add("Divya");

		ArrayList<String> mechCol = new ArrayList<String>();
		mechCol.add("Aliya");
		mechCol.add("Disha");
		mechCol.add("Shishra");
		mechCol.add("Depika");

		ArrayList<String> ibmCol = new ArrayList<String>();
		ibmCol.addAll(csCol);
		ibmCol.addAll(ecCol);
		ibmCol.addAll(mechCol);
		System.out.println(ibmCol);

		ibmCol.remove("Nikhil");
		System.out.println(ibmCol);

		ibmCol.removeAll(mechCol);
		System.out.println(ibmCol);

		ibmCol.add("Pappu");
		System.out.println(ibmCol);

		System.out.println("Manju is there ? " + ibmCol.contains("Manju"));
		System.out.println("All cs Students are there ? " + ibmCol.containsAll(csCol));
		System.out.println("All ec Students are there ? " + ibmCol.containsAll(ecCol));
		System.out.println("------------------------------------");
		Object[] obarr = ibmCol.toArray();
		for (Object obj : obarr) {
			System.out.println(obj);
		}
		System.out.println("------------------------------------");
		System.out.println("is empty " + ibmCol.isEmpty());
		ibmCol.clear();
		System.out.println("is empty " + ibmCol.isEmpty());
		System.out.println(ibmCol.size());
		ibmCol.add("Mohan");
		System.out.println(ibmCol);
		System.out.println(ibmCol.size());
		ibmCol = null;
		ibmCol.retainAll(null);

	}

}
