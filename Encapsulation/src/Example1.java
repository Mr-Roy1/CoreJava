
public class Example1 {
	private double perc;
	private int age;

	public void setPerc(double perc) {
		if (perc > 0 && perc < 100) {
			this.perc = perc;
		} 
		 else {
			System.out.println("invalid perc");
		}	

	}

	public double getPerc() {
		return perc;
	}

	public void setAge(int age) {
		if (age > 0 && age < 100)
			this.age = age;
		else {
			System.out.println("invalid age");
		}
	}

	public int GetAge() {
		return age;
	}

	public static void main(String[] args) {
		Example1 e = new Example1();
		e.age = 20;
		e.perc = 99.9;

		System.out.println(e.age);
		System.out.println(e.perc);

	}

}
