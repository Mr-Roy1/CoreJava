
public class Laptop {
String model;
int price;
long ServiceTag;
public Laptop(String a, int b, long c){
	model=a;
	price=b;
	ServiceTag=c;
}
public static void main(String[] args) {
	Laptop l1=new Laptop("dell",51000,123456123456l);
	Laptop l2=new Laptop("hp",48000,789456852369l);
	
	System.out.println(l1.model+","+l1.price+","+l1.ServiceTag);
	System.out.println(l2.model+","+l2.price+","+l2.ServiceTag);
	
}
}
