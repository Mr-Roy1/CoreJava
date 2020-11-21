
class CreditCard extends Card{
	int creditNumber;
	
	void payCreditCardBill(){
		System.out.println("pay credit bill");
		
		CreditCard cc=new CreditCard();
		cc.CardNumber=976431235695230l;
				cc.creditNumber=985325475;
				cc.cvv=254;
				cc.expDate="25/sep";
				cc.name="master";
				cc.payCreditCardBill();
				System.out.println(cc.CardNumber);
				System.out.println(cc.creditNumber);
				System.out.println(cc.CardNumber);
				System.out.println(cc.CardNumber);
				
	}

}
