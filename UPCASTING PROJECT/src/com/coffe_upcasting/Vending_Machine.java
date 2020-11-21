package com.coffe_upcasting;

import java.util.Scanner;
class Vending_Machine {
	Beverage pressButton()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1-coffee      2& other no fpr-tea");
		int n=sc.nextInt();sc.close();
		
		if(n==1)
		{
			Coffee c=new Coffee();
			return c;
		}
		else
		{
			Tea t=new Tea();
			return t;
		}
	}

}
