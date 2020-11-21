
public class Tree {
	String type = "peepal";
	double height;
	boolean givenfruit = false;

	public static void main(String[] args) {
		Tree t1 = new Tree();
		t1.height = 5.6;
		t1.type = "peepal";
		t1.givenfruit = false;
		Tree t2 = new Tree();
		t2.type = "peepal";
		t2.height = 10.6;
		t2.givenfruit = false;
		System.out.println(t1.type + " " + t1.height + " " + t1.givenfruit);
		System.out.println(t2.type + " " + t2.height + " " + t2.givenfruit);
	}
}
