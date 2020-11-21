package org.jsp.fileHandling.File_in;

import java.io.File;
import java.net.MalformedURLException;

public class FileUtilityMethod {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		File file=new File("‪F:\\FileHandling\\Fileutility.txt");
		
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		
		System.out.println(file.isHidden());
		System.out.println(file.getFreeSpace());
		System.out.println(file.length());
		System.out.println(file.toURL());
		
		File file1=new File("Matrix2.java");
		System.out.println(file1);
	}

}
