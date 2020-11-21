package com.food;
public class Customer {
	public static void main(String[] args) {
		Deliveryboy db=new Deliveryboy();
		Food f=db.delivers();
		System.out.println(f.type);
		System.out.println(f.qty);
	}

}
