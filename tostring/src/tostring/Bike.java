package tostring;

public class Bike {
	String color;
	int price;
	public String toString()
	{
		return""+color+" "+price;
	}
	public static void main(String[] args) {
		Bike b=new Bike();
				b.color="Black";
		b.price=50000;
		System.out.println(b);
	}

}
