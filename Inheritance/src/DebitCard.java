class DebitCard extends Card{
public static void main(String[] args) {
	DebitCard db=new DebitCard();
	db.CardNumber=8525632548759658l;
	db.name="visa";
	db.cvv=045;
	db.expDate="12/sep";
	System.out.println("card number:"+db.CardNumber);
	System.out.println("card holder name:"+db.name);
	System.out.println("card cvv:"+db.cvv);
	System.out.println("ate of exp:"+db.expDate);
	db.swipe();
	db.withdrawMpney();
	
}
}
