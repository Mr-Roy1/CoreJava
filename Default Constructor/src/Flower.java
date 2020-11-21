public class Flower {
	String color;
	String Name = "rose";

	public static void main(String[] args) {
		Flower f1 = new Flower();
		f1.color = "red";

		Flower f2 = new Flower();
		f2.color = "pink";

		System.out.println("rose" + " " + f1.color + " " + f2.color);

	}

}
