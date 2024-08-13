package com.mehmett._00_ExeptionGiris;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_FinallyOrnek {
	public static void main(String[] args) {
		FileInputStream fileData = null;
		try {
			int readedData;
			fileData=new FileInputStream("C:/javaFiles/Hello3.txt");
			 readedData = fileData.read();
			 while ((readedData= fileData.read())!=-1){
				 System.out.println((char) readedData);
			 }
			 
//			 fileData.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}