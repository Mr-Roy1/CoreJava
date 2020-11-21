
public class Car {

	int price;
	String name;

	public Car() {

	}

	public Car(int a) {
		price = a;

	}

	public Car(String b) {
		name = b;
	}

	public static void main(String[] args) {
		Car c1 = new Car(500000);
		System.out.println(c1.price);
		Car c2 = new Car("mahindra");
		System.out.println(c2.name);
	}

}
