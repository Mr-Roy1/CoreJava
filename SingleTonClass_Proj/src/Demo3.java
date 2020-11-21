
//using double checked locking

public class Demo3 {
	
	public static Demo3 obj; //STATIC OBJJECT
	int i;
	
	private Demo3() {            // PRIVATE CONSTRUCTOR
		System.out.println("instance created");
	}
	
	public static Demo3 getInstance() {    //STATIC METHOD
		if(obj==null) {
			
			synchronized (Demo3.class) {
				if(obj==null)
					obj=new Demo3();
			}
		}
		return obj;
		
	}

}
