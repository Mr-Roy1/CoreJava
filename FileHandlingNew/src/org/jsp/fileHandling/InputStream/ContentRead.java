package org.jsp.fileHandling.InputStream;
//WAJPT read the content of the file  //

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ContentRead {
	public static void main(String[] args) {
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("F:/FileHandling/input.txt");
		      int i;
		      while((i=fis.read())!=-1) {
		    	  System.out.print((char)i);
		      }
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
