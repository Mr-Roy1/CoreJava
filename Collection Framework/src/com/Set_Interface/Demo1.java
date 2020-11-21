package com.Set_Interface;

import java.util.*;

public class Demo1 {
	public static void main(String[] args) {
		
		Set<String> set=new LinkedHashSet<String>();
		set.add("red");
		set.add("yellow");
		set.add("white");
		set.add("red");
		set.add("null");
		set.add("orange");
		set.add("red");
		System.out.println(set);
		
		
	}

}
