package org.jsp.fileHandling.File_in;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		try {
		File file=new File("F:\\FileHandling\\Filedemo.txt");
		
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		
		System.out.println("---------------------------------------------------------");
		
		String [] file1=file.list();
		int count=0;
		
		for(int i=0;i<file1.length;i++) {
			if(file1[i].endsWith(".java")) {
				count++;
				System.out.println(file1[i]);
			}
		}
		System.out.println("no. of .java file in the folder "+count);
		
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
