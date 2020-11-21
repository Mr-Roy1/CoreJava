
public class StringBuilder1 {
	public static void main(String[] args) {
		String a="Bangalore";
		String b="Welcome you all";
		System.out.println(a);
		System.out.println(b);
		System.out.println("----------------------------------------------------");
		
		StringBuilder sbuild =new StringBuilder("Bngalore ");
		sbuild.append("welcomes you all");
		System.out.println(sbuild);
		
		sbuild.insert(9, "happily ");
		System.out.println(sbuild);
		
		sbuild.replace(0, 8, "India");
		System.out.println(sbuild);
		
		sbuild.delete(1, 5);
		System.out.println(sbuild);
		
		sbuild.deleteCharAt(17);
		System.out.println(sbuild);
		System.out.println("_________________________________________________");
		
		String s="welcome";
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
		System.out.println();
		sbuild.reverse();
		System.out.println(sbuild);
		
		
		
		
	}

}
