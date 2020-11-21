package com.Iterator.ListIterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class FlowerListItrDemo {
	public static void main(String[] args) {
		LinkedList <String>lst=new LinkedList<String>();
		lst.add("Rose");
		lst.add("Lotus");
		lst.add("Lily");
		lst.add("Hibiscus");
		
		ListIterator<String> itr=lst.listIterator(lst.size());
		while(itr.hasPrevious()){
			String pp=itr.previous();
			System.out.println(pp);
			
			if(pp=="Lotus")
				itr.remove();
		}
		System.out.println("------------------------------------");
		System.out.println(lst);
	}

}
