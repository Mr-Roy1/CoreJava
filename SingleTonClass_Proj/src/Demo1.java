                                  //   SINGLETON CLASS   //

/* SingleTon class is such type of class that allows you to create only one object(instance) of that class 
 * In case we should follow some rule
 * [1] You should create static instance of that class
 * [2] You should make constructor private 
 * [3] You should make static method and return type of that method must be object of that class */


public class Demo1 {
//	public static Demo1 obj=new Demo1(); //STATIC OBJJECT
//	int i;
//	
//	private Demo1() {            // PRIVATE CONSTRUCTOR
//		System.out.println("instance created");
//	}
//	
//	static Demo1 getInstance() {    //STATIC METHOD
//		
//		return obj;
//		
//	}
	
	         // OR //
	
	public static Demo1 obj; //STATIC OBJJECT
	int i;
	
	private Demo1() {            // PRIVATE CONSTRUCTOR
		System.out.println("instance created");
	}
	
	static Demo1 getInstance() {    //STATIC METHOD
		if(obj==null) {
			obj=new Demo1();
		}
		return obj;
		
	}
}
