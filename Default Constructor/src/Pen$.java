
public class Pen$ {
	String clr;
	int price=40;
	String type="marker";
	public static void main(String[] args) {
		Pen$ p1=new Pen$();
		p1.clr="clr=blue";
		Pen$ p2=new Pen$();
		p2.clr="clr=green";
		System.out.println(p1.clr);
		System.out.println(p2.clr);
		System.out.println("price=40");
		System.out.println("type=marker");
	}

}
