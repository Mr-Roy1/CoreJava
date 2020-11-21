
// using synchronized  in thread case

public class Demo2 {
	
	public static Demo2 obj; //STATIC OBJJECT
	int i;
	
	private Demo2() {            // PRIVATE CONSTRUCTOR
		System.out.println("instance created");
	}
	
	public static  synchronized  Demo2 getInstance() {    //STATIC METHOD
		if(obj==null) {
			obj=new Demo2();
		}
		return obj;
		
	}

}
