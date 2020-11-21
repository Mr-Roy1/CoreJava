package com.Product;


public class BuyerCustomer {
	public static void main(String[] args) {
		ShopKeeper sk = new ShopKeeper();
		Product p = sk.sell();
		System.out.println(p.color);
		System.out.println(p.name);
		System.out.println(p.price);
		System.out.println(p.ramcapacity);
		System.out.println(p);

	}
}
