
public class StringDemo {
	
	StringDemo(String a){
	System.out.println(a);
		
	}
	public static void main(String[] args) {
		StringDemo sd1=new StringDemo("Bengaluru");
		StringDemo sd2=new StringDemo("Bengaluru");
		StringDemo sd3=new StringDemo("Bengaluru");
		StringDemo sd4=new StringDemo("Bengaluru");
		
		System.out.println("-------------------------------");
		String s=new String("pappu rai");
		System.out.println(s);
		System.out.println("-------------------------------");
		
		String s1="Bengaluru";
		String s2="Bengaluru";
		
		System.out.println(sd1);
		System.out.println(s1);
		
		
		
//		String s1="Bengaluru";
//		String s2="Welcome";
//		System.out.println(s1);
//		System.out.println(); //creating for space purpose.
//		System.out.println(s1.concat(s2));
//		 String s3=s1.concat(s2);
//		System.out.println(s3);
//		String s4=s1+s2;
//		System.out.println(s4);
	}

}
