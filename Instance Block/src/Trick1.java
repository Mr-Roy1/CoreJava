
public class Trick1 {
	public static void main(String[] args) {
		System.out.println("main start");
		new Trick1();
		System.out.println("------------");
		new Trick1();
		System.out.println("main end");
	}

	{
		System.out.println("IIB-1");
	}
	{
		System.out.println("IIB-2");
	}
	{
		System.out.println("IIB-3");
	}
	{
		System.out.println("IIB-4");
	}

}
