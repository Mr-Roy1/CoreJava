package org.jsp.fileHandling.Serialization_in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.Lst.Student;

public class SerialDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student student = new Student("pappu rai", 76.4);
		System.out.println(student);
		
		File file=new File("‪F:\\FileHandling\\SerialObject.txt");
		
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream obj_wrt=new ObjectOutputStream(fos);
		obj_wrt.writeObject(student);
		
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream obj_rd=new ObjectInputStream(fis);
		Student obj=(Student) obj_rd.readObject();
		System.out.println(obj);
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("Successfully object is serialized");
		
	}

}
