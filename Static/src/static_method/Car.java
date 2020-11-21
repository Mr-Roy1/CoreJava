package static_method;
import java.util.*;

public class Car {
	 static int square(int x)
	{
		return(x*x);
	}
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the no !");
		 int n=sc.nextInt();
		 int pp=square(n);
		System.out.println("square: "+pp);
	}

}
