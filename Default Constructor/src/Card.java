
public class Card {
	String CustomerName;
	Long CardNumber;

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.CustomerName = "pappu";
		c1.CardNumber = 7898746318789874L;
		
		Card c2 = new Card();
		c2.CustomerName = "deepak";
		c2.CardNumber = 9074585793907458l;
		
		System.out.println(c1.CustomerName + " " + c1.CardNumber);
		System.out.println(c2.CustomerName + " " + c2.CardNumber);

	}
}
