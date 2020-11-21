
public class Mobile {
	String name;
	String model;
	int price;
	String color;
	
public static void main(String[] args) {
	Mobile m1=new Mobile();
	m1.name="redmi";
	m1.model="note 7";
	m1.price=9000;
	m1.color="black";
	
Mobile m2=new Mobile();
m2.name="oppo";
m2.model="a37f";
m2.price=10000;
m2.color="golden";
	System.out.println(m1.name+","+m1.model+","+m1.price+","+m1.color);
	System.out.println(m2.name+","+m2.model+","+m2.price+","+m2.color);
	
	
}

}
