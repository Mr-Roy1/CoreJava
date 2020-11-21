
public class Book {
	String author;
	int nop;

	Book(String a, int n) {
		author = a;
		nop = n;
	}

	public static void main(String[] args) {
		Book b1 = new Book("Dr Shishira Bhat", 250);
		Book b2 = new Book("Dr Rao", 450);
		System.out.println(b1.author + "," + b1.nop);
		System.out.println(b2.author + "," + b2.nop);

	}

}
