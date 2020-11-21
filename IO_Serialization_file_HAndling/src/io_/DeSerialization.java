package io_;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class DeSerialization {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("F:\\eclipse-workspace1\\corejava\\IO_Serialization_file_HAndling\\data.text");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		
		
		Student s= (Student)obj;
		System.out.println(s.id+" "+s.name+" "+s.price);
		ois.close();fis.close();
	}

}
