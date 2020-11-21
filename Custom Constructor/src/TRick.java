
public class TRick {
	int i = 25;

	{
		int i = 32;
		System.out.println(i);

	}

	public static void main(String[] args) {
		System.out.println("app start");
		TRick t1 = new TRick();
		System.out.println(t1.i);
		System.out.println("app end");
	}

	{
		int i = 45;
		this.i = i;
	}
}
