package com.LinkedList;

import java.util.LinkedList;

public class LLDemo {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("John");
		ll.add("Ram");
		ll.add("Bheem");
		System.out.println(ll);
		System.out.println("---------------------------------");
		
		ll.add(1,"Shishira");
		System.out.println(ll);
		
	}
	

}
