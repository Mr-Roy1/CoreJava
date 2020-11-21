package org.jsp.fileHandling.OutPutStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ContentCopy {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("‪F:\\FileHandling\\origional file.txt");
			fos=new FileOutputStream("‪‪F:\\FileHandling\\copied file.txt");
			
			int i;
			while((i=fis.read())!=-1) {
				Thread.sleep(40);
				System.out.println((char)i);
			}
			
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	
	}
}
