
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriteDemo {
	public static void main(String[] args) throws Exception {
		Student s=new Student(11,25.23,"Guldu");
		//connection stream
		FileOutputStream fos=new FileOutputStream("data.text");
		
		//chain stream
		ObjectOutputStream oops=new ObjectOutputStream(fos);
		oops.writeObject(s);
		oops.close();fos.close();
		System.out.println("sucess!!! data is saved to file");
	}

}
