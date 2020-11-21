package com.LinkedList;

import java.util.LinkedList;

public class LLDemo2 {
	public static void main(String[] args) {
		Product p1=new Product(1200,5,"Soap");
		Product p2=new Product(15000,10,"Conditioner");
		
		
		
		LinkedList<Product> llp=new LinkedList<Product>();
		llp.add(p1);
		llp.add(p2);
		
		Product p10=new Product(5000,1,"Shampoo");
		llp.add(1,p10);
		
		for(Product pp:llp){
			System.out.println(pp.price+" "+pp.type+" "+pp.qty);
		}
		
		
	}
	

}
