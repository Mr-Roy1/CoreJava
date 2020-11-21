
public class Main4 {

	public static void main(String[] args) {
		
		Demo4 obj=Demo4.INSTANCE;
		obj.i=5;
		obj.show();
		
		Demo4 obj2=Demo4.INSTANCE;
		obj2.i=6;
		
		obj.show();
		
		}
	}
