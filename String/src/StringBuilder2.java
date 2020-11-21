
public class StringBuilder2 {
	public static void main(String[] args) {
		StringBuilder sbuild=new StringBuilder("Welcome to bhopa");
		System.out.println(sbuild.capacity());
		System.out.println("___________________________________________");
		
		StringBuilder sbuild1=new StringBuilder();
		System.out.println(sbuild1.capacity());
		
		sbuild1.append("Welcome");
		System.out.println(sbuild1.capacity());
		sbuild1.append(" to bhopal");
		System.out.println(sbuild1.capacity());
		System.out.println("___________________________________________");
		
		StringBuilder sbuild2=new StringBuilder();
		System.out.println(sbuild2.capacity());
		sbuild2.append("india");
		System.out.println(sbuild2.capacity());
		sbuild2.ensureCapacity(20);
		sbuild2.append("is my country");
		System.out.println(sbuild2.capacity());
		sbuild2.ensureCapacity(50);
		System.out.println(sbuild2.capacity());
		System.out.println(sbuild2.charAt(2));
		
		
	}

}
