package static_block;

public class Pen {
	static String name1;
	static int age;
	static {
		name1="Roy";
		System.out.println(name1);
		age=29;
		System.out.println(age);
	}
	static String name="pappu Rai";
	static
	{
		System.out.println(name);
	
	}
	{
		System.out.println("pappu Bhai");
		
	}
 
	
	
	public static void main(String[] args) {
		new Pen();
		new Pen();
		new Pen();
		new Pen();
		new Pen();
	System.out.println("main end");
	}
	

}
