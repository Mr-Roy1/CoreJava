package org.jsp.fileHandling.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DisplayInputCharacter {

	public static void main(String[] args) {
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("F:\\FileHandling\\display.txt");
			byte[] b=new byte[129];
			fis.read(b);
			
			for(int i=0;i<b.length;i++) {
				System.out.print((char)i+" ");
			}
			
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
}/==
