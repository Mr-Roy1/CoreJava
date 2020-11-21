package org.jsp.fileHandling.OutPutStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ContentWrite {

	public static void main(String[] args) {
		String st="This is written through java code and this is also written by outstream hahahah";
		FileOutputStream fos=null;
		
		try {
			fos=new FileOutputStream("F:\\FileHandling\\output.txt");
			byte[] b=st.getBytes();
			fos.write(b);
			fos.flush();
			System.out.println("Sucessfully content is written!!!!!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
