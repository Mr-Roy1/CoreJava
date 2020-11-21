
public class Demo1 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 10 };
		System.out.println(a.length);
		System.out.println("iterating using for loop in forward direction");
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
		System.out.println("iterating using for loop in backward direction");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

}
