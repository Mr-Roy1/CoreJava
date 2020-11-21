
public class Bike {
	int price;
	String name;
	String brand;

	public Bike( int a,String b, String c) {
		price = a;
		name = b;
		brand = c;

	}

	public static void main(String[] args) {
		Bike b1 = new Bike( 50000,"pulsar", "bajaj");
		System.out.println(b1.price + "," + b1.name + "," + b1.brand);
		
	}
}
