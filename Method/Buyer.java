import com.food.Food1;

public class Buyer {
	public static void main(String[] args) {
		HotelServer hs = new HotelServer();
		Food1 f = hs.serve();
		System.out.println(f.name);
		System.out.println(f.qty);

	}
}
