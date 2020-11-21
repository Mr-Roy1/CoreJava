
public class SportsClub {
	String address;
	long contact;
	int fee = 500;

	public static void main(String[] args) {

		SportsClub sc1 = new SportsClub();
		sc1.address = "BTM Banglore";
		sc1.contact = 7898746318L;
		SportsClub sc2 = new SportsClub();
		sc2.address = "MP Nagar";
		sc2.contact = 9074585793L;
		System.out.println(sc1.address + "," + sc1.contact + "," + "500");
		System.out.println(sc2.address + "," + sc2.contact + "," + "500");

	}

}
