import java.util.Scanner;

public class StringDemo4 {
	public static void main(String[] args) {
		String d="entertainment";
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the character that you want to find");
		char c=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<d.length();i++){
			if(c==d.charAt(i)){
				count++;
			}
			
		}
		System.out.println("count: "+count);
		
		
	}
	

}
