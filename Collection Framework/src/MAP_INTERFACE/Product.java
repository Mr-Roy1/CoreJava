package MAP_INTERFACE;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Product {
	public static void main(String []args ){
		Map<Integer,String> indmap=new HashMap<Integer,String>();//UpCasting
		indmap.put(7, "Dhoni");
		indmap.put(8, "Virat");
		System.out.println(indmap);
		
		indmap.put(8, "Rohit");
		System.out.println(indmap);
		
		Set<Integer> k=indmap.keySet();
		System.out.println(k);
		
		Collection<String> vals=indmap.values();
		System.out.println(vals);
		System.out.println("____________Thank you!_____________");
		
	}

}
