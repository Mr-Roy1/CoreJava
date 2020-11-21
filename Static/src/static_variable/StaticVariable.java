package static_variable;

 class StaticVariable {
	 static int a=50;
	 static String name="pk";
	 
	
	  
	public static void main(String[] args) {

		
		StaticVariable v=new StaticVariable();
		v.a=100;
		v.name="yadav";
		
		
		StaticVariable v2=new StaticVariable();
		v2.a=500;
		v2.name="pappu";
		
		System.out.println(a);

		System.out.println(name);
		
		
		
		
		
	}
		
			

}
