import java.io.Serializable;

public class Student implements Serializable{
	int id;
	double price;
	String name;
	public Student(int id,double price,String name){
		super();
		this.id=id;
		this.price=price;
		this.name=name;
		
	}
    
}
