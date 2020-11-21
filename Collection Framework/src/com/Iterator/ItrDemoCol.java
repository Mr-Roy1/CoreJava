package com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ItrDemoCol {
	public static void main(String[] args) {
		ArrayList <String> lst=new ArrayList<String>();
		lst.add("Shishira");
		lst.add("Shabbhu");
		lst.add("Kumar");
		lst.add("Vivek");
		lst.add("Muthu");
		
		Iterator<String> itr=lst.iterator();
		while(itr.hasNext()){
			String ele=itr.next();
			System.out.println(ele);
		}
	}
	

}
