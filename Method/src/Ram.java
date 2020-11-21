
public class Ram {
	void eat(){
		System.out.println("ram eats");
	}
	void washHand(){
		System.out.println("ram wash hand");
	}
	void arrangePlate(){
		System.out.println("ram arranges plate");
	}
	void serveFood(){
		System.out.println("ram serves food");
	}
	public static void main(String[] args) {
		Ram r1=new Ram();
		r1.eat();
		r1.washHand();
		r1.arrangePlate();
		r1.serveFood();
	}

}
