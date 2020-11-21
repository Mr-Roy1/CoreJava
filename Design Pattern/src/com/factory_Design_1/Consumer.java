package com.factory_Design_1;

import java.util.Scanner;

public class Consumer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of pen:ik/sk/mk");
		String type = sc.next();
		sc.close();
		IPen pen = PenFactory.getInstance(type);
		System.out.println(pen);
	}

}
