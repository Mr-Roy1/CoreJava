
public class main2 {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				Demo2 x=Demo2.getInstance();
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				Demo2 x1=Demo2.getInstance();
			}
		});
	
		t1.start();
		t2.start();
	}

}
