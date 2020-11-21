
public class Car {
	String model;
	String clr;

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model = "beatle";
		c1.clr = "yellow";
		Car c2 = new Car();
		c2.model = "avaitor";
		c2.clr = "blue";
		System.out.println(c1.model + " " + c1.clr);
		System.out.println(c2.model + " " + c2.clr);
	}

}
