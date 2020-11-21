package com.List;

import java.util.ArrayList;
import java.util.HashSet;

public class AlCopyDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Rose");
		hs.add("Lotus");
		hs.add("Lily");
		hs.add("Jasmine");
	// we can use this.
		ArrayList<String> lst = new ArrayList<String>(hs.size());
		for (String hse : hs) {
			lst.add(hse);
		}
		System.out.println(hs);
		System.out.println(lst);
	// OR we can use this(anyone of this.
		ArrayList<String> lst1 = new ArrayList<String>(hs);
		System.out.println(hs);
		System.out.println(lst1);
		hs=null;
		System.out.println("__________________________");
		System.out.println(hs);
		System.out.println(lst);

	}

}
