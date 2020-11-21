
public class Main3 {

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
		try {
			Thread.sleep(10);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		t2.start();
	
	}
}
