package org.jsp.fileHandling.InputStream;
// WAJP to count no of characters in a file //

import java.io.FileInputStream;
import java.io.IOException;

public class CountFileCharacter {

	public static void main(String[] args) {
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("F:\\FileHandling\\available.txt");
		      System.out.println(fis.available());
		      
		} catch (IOException e) {
			System.out.println(e);
		}
		
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}++
