package io_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class UserObjSaveDemo {
	public static void main(String[] args) throws Exception{
		User u=new User();
		u.contact=7898746318l;
		u.FullName="Pappu yadav";
		u.password="Secret";
		u.userName="pk yadav";
		FileOutputStream fos=new FileOutputStream("user_details.text");
		ObjectOutputStream oops=new ObjectOutputStream(fos);
		oops.writeObject(u);
		oops.close();fos.close();
		System.out.println("Write operaton sucessful");
		
		
	}

}
