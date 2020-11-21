
import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();//UpCating
		lst.add("REd");
		lst.add("White");
		lst.add("Yellow");
		lst.add("Pink");
		lst.add("Blue");
		lst.add("Purple");
	//this is for Example...	
		for(String clr:lst){
			System.out.println("Hello");
		}
		System.out.println("_____________________________");
	//this is the real programming...
		for(String clr:lst){
			System.out.println(clr);
		}
	}

}
