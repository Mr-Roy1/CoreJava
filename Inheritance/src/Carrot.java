
public class Carrot extends Vegetable {
	String name;
	void prepareHalwa() {
		System.out.println("this is a method of carrot class");
	}

	public static void main(String[] args) {
		Carrot c = new Carrot();
		c.color = "orange";
		c.price = 60;
		c.weight = 1.0;
		c.name="black carrot";
		System.out.println("color of the carrot:"+ c.color);
		System.out.println("price of the carrot" + ":" + c.price);
		System.out.println("weight of thr carrot" + ":" + c.weight);
		System.out.println("color of the carrot" + ":" + c.name);
		c.prepareDish();
		c.prepareHalwa();
		Vegetable v=new Vegetable();
		v.prepareDish();
		
		
		
	}
	
}
