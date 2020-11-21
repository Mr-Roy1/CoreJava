
public class StringBuilder3 {
	public static void main(String[] args) {
		//StringBuilder to String.
		StringBuilder sbuild=new StringBuilder();
		sbuild.append("Welcome to banglore");
		String str=sbuild.toString();
		System.out.println(str);
		System.out.println("_________________________________________");
		
		//String to StringBuilder.
		String name="Banglore";
		StringBuilder sb=new StringBuilder(name);
		System.out.println(sb);
	}

}
