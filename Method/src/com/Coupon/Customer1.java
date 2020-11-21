package com.Coupon;


public class Customer1 {
	public static void main(String[] args) {
		Cashier c = new Cashier();
		Coupon cpn = c.gives();
		System.out.println(cpn.type);
		System.out.println(cpn.qty);
		System.out.println(cpn.date);
		System.out.println(cpn);
	}
}
