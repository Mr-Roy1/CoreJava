
public class StringDemo1 {
	public static void main(String[] args) {
		char []ch={'B','E','N','G','A','L','U','R','U'};
		String s=new String(ch);
		System.out.println(s);
		
		char ch1[]=s.toCharArray();
		for(int i=0;i<ch1.length;i++){
				System.out.print(ch1[i]+"  ");
		}
		
		
	}

}
