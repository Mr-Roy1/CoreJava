package MAP_INTERFACE;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
	public static void main(String[] args) {
		Map<Integer, String> rcb = new HashMap<Integer, String>();//UpCasting
		rcb.put(8, "Kohli");
		rcb.put(2, "ABd");
		rcb.put(5, "Dravid");
		System.out.println(rcb);
		System.out.println();
		System.out.println();

		Map<Integer, String> mi = new HashMap<Integer, String>();//UpCasting
		mi.put(7, "Rohit");
		mi.put(4, "Pollard");
		System.out.println(mi);
		System.out.println();
		System.out.println();

		Map<Integer, String> ipl = new HashMap<Integer, String>();//UpCasting
		ipl.putAll(rcb);
		ipl.putAll(mi);
		System.out.println(ipl);
		System.out.println("2 is present= " + ipl.containsKey(2));
		System.out.println("Dravid is present= " + ipl.containsValue("Dravid"));
		System.out.println();
		System.out.println();
		System.out.println("is Empty?" + ipl.isEmpty());
		System.out.println("map Size=" + ipl.size());
		ipl.remove(2);
		System.out.println(ipl);
		System.out.println("key=5 and value=" + ipl.get(5));
		ipl.clear();
		System.out.println("Map Size =" + ipl.size());

	}

}
