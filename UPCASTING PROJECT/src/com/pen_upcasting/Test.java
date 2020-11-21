package com.pen_upcasting;
import java.util.Scanner;
class Test {
	Pen m1()
	{
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your choice");
	 System.out.println("1-Sketch pen      and any other no for Ink pen");
	 int n=sc.nextInt();sc.close();
	 
	 if(n==1)
	 {
		 Pen p=new SketchPen();
		 return p;
	 }
	 else
	 {
		 Pen p=new InkPen();
		 return p;
	 }
	 
	}
	 

}
