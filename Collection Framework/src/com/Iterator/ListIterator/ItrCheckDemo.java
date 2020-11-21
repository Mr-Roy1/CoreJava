package com.Iterator.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ItrCheckDemo {
		public static void main(String[] args) {
			ArrayList<String>lst=new ArrayList<String>();
			lst.add("Ram");
			lst.add("Seeta");
			lst.add("Lakshman");
			lst.add("Manoja");
			
			ListIterator <String>itr=lst.listIterator();
			while(itr.hasNext()){
				String pp=itr.next();
				
				if(pp=="Manoja")
					itr.remove();
				
			}
			System.out.println(lst);
				
			
		}

}
