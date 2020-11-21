package com.serialization;

import java.io.BufferedReader;
import java.io.FileReader;

public class StoryReader {
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("F:\\eclipse-workspace1\\corejava\\IO_Serialization_file_HAndling\\src\\com\\serialization\\pk.txt");
		BufferedReader br=new BufferedReader(fr);
		String pk="";
		while((pk=br.readLine()) !=null){
			System.out.println(pk);
		}
		br.close();fr.close();
	}

}
