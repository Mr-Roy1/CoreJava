package tostring;

public class Demo {
//	String name="pappu";
//	int age=22;
//	String place="Bihar";
	
	     // OR //
	String name;
	int age;
	String place;
	
	public String toString() {
		return name+" "+age+" "+place;
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.name="Pappu Rai";
		d.age=25;
		d.place="Bihar";
		System.out.println(d);
	}
}
