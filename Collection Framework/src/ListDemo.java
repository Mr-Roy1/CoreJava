import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();// UpCasting
		lst.add("Red");
		lst.add("White");
		lst.add("Yellow");
		lst.add("Pink");
  //Either we can use this.
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst.get(2));
		System.out.println(lst.get(3));

		System.out.println("___________________________________________");
  //Either we can use this.
		for (int i = 0; i < lst.size(); i++) {
			String clr = lst.get(i);
			System.out.println(clr);
		}
		System.out.println("_______________________________________________");
  //Either we can use this
		for (int i = lst.size() - 1; i >= 0; i--) {
			String clr1 = lst.get(i);
			System.out.println(clr1);
		}
		System.out.println("_____________________________________________");
	//Either we can use this.	
		for (int i = 3; i >= 0; i--) {
			String clr2 = lst.get(i);
			System.out.println(clr2);
		}

	}
}
