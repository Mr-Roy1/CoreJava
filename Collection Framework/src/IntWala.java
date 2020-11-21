import java.util.ArrayList;
import java.util.List;

public class IntWala {
	public static void main(String[] args) {
		List lst = new ArrayList();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		System.out.println(lst);
		
		System.out.println("---------------------------------------");
		lst.add("pk");
		System.out.println(lst);
		System.out.println("------------------------------------");

		
		lst.add(2, "ray");
		lst.add(0, "pk");
		System.out.println(lst);
		System.out.println("---------------------------------------");

		
		ArrayList ls = new ArrayList();
		ls.addAll(lst);
		System.out.println(ls);

		System.out.println("-------------------------------------");
		System.out.println(lst.indexOf("pk"));
		System.out.println(lst.lastIndexOf("pk"));
		System.out.println(lst.get(3));
		System.out.println(lst.size());
		System.out.println("---------------------------------------------");
		
		lst.remove(4);
		System.out.println(lst);
		System.out.println("------------------------------------------------");
		
		lst.set(2,"Pappu Rai");
		System.out.println(lst);
		System.out.println("-------------------------------------------------");
		
		
		System.out.println(lst.subList(2, 5));

	}

}
