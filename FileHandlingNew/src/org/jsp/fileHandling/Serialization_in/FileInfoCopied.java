package org.jsp.fileHandling.Serialization_in;
/* WAJP to write one file to another file with help of File Extension(.java) */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class FileInfoCopied {

	@SuppressWarnings({"unchecked","rawtypes", "resource",})
	public static void main(String[] args) throws IOException {
		
		File file=new File("‪F:\\FileHandling");
		File[] file1=file.listFiles();
		
		Vector vector=new Vector();
		//try {
		for(int i=0;i<file1.length;i++) {
			if(file1[i].getName().endsWith("F:/‪.java")) {
				FileInputStream fis=new FileInputStream(file1[i]);
				vector.add(fis);
			}
		}
		//}catch(NullPointerException e) {
		//	System.out.println("success thread");
		//}
		FileOutputStream fos=new FileOutputStream("F:\\FileHandling\\myNoteCopyInfo.txt");
		
		Enumeration element=vector.elements();
		SequenceInputStream sis=new SequenceInputStream(element);
		
		int i;
		
		while((i=sis.read())!= -1){
		fos.write(i);
		}
		
		fos.flush();
		fos.close();
		
		System.out.println("Successfully copied");
		
	}
}+++
