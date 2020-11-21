
public class StringDemo3 {
	public static void main(String[] args) {
		String h="Welcome";
		char[] j={h.charAt(0)};
		String k=new String (j);
		k.toUpperCase();
		String g="";
		for(int i=1;i<h.length();i++){
			g=g+h.charAt(i);
			g=k.concat(g);
		}
		System.out.println(g);
		
		
		
                  //  USING LOGIC //		
//		
//		char ch[]=h.toCharArray();
//		for(int i=0;i<=0;i++) {
//			for(int j=0;j<ch.length;j++) {
//				System.out.print(ch[0]);
//				}
//			for(int k=i+1;k<ch.length;k++) {
//				System.out.print(ch[k]);
//				
//			}
//			
//			System.out.println();
//			
//		}
		
		
	}

}
