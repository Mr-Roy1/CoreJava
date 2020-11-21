
public class StringDemo2 {
	public static void main(String[] args) {
		String s = "Corona";
		// to get a character that is present at a particular index.
		System.out.println(s.charAt(4));
		System.out.println("-------------------------------");

		// to find to length of a given String.
		System.out.println(s.length());
		System.out.println("-------------------------------");

		// to print sub String
		System.out.println(s.substring(2, 5));
		System.out.println("-------------------------------");

		// to check whether a string contains a character sequence
		System.out.println(s.contains("rona"));
		System.out.println(s.contains("p"));
		System.out.println(s.contains("Coro"));
		System.out.println(s.contains("Corn"));

		System.out.println("-------------------------------");
		String h = "sars";
		String g = s;
		String k = "Corona";

		// to check whether one string is same as another string.
		System.out.println(s.equals(h));
		System.out.println(s.equals(g));
		System.out.println(s.equals(k));
		System.out.println(s.equalsIgnoreCase(k));
		System.out.println(s.equalsIgnoreCase(h));
		System.out.println("-------------------------------");

		// to check whether string is empty
		String y = "";
		System.out.println(y.isEmpty());
		System.out.println(s.isEmpty());
		System.out.println("-------------------------------");

		// to join two String
		System.out.println(s.concat(h));
		System.out.println("-------------------------------");

		// to replace a character with another character in the string.
		System.out.println(s.replace('C', 'B'));
		System.out.println("-------------------------------");

		// to find index of a character in string
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('o'));
		System.out.println(s.indexOf('o', 2));
		System.out.println("-------------------------------");

		// trim a string
		String j = "                     India";
		System.out.println(j);
	     j= j.trim();
		System.out.println(j);
		System.out.println("-------------------------------");
		// to convert into upper and lower case

		String u = "u.s.s.r";
		System.out.println(u.toUpperCase());
		String t = "U.S.A";
		System.out.println(t.toLowerCase());
		System.out.println("-------------------------------");

		//
	}

}
