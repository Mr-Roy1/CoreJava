package com.association.money;

public class BankCustomer1 {
	public static void main(String[] args) {
		Atm a=new Atm();
		Money m=a.dispense();
		
		System.out.println(m.value);
		System.out.println(a.bank);
		System.out.println(a.branch);
	}

}
