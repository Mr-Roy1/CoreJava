package com.Switch;

public class Test {
	public static void main(String[] args) {
		Switch c1=new Bulb();
		c1.switchOn();
		
		Switch c2=new Laptop();
		c2.switchOn();
		
		Switch c3=new IronBox();
		c3.switchOn();
	}

}
