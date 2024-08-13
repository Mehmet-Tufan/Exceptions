package com.mehmett._00_ExeptionGiris;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_FinallyOrnek {
	public static void main(String[] args) {
		FileInputStream fileData = null;
		try {
			fileData=new FileInputStream("C:/javaFiles/Hello4.txt");
			int readedData;
			System.out.println("Dosya içeriği:");
			while( (readedData = fileData.read())!=-1 ) { // burada bir hata meydana geldiğinde FileInputStream açılmış olacak .
				System.out.print((char)readedData);
			}
			//fileData.close(); // ama bu satır çalışmayacağı için FileInputStream kapatılmamış olacak. (memory leak)
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileData.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			catch (NullPointerException e) {
				System.out.println("fileData is null... ");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/*try {
			fileData.close(); // eğer FileInputStream açılamazsa, o zaman kapatamazsınız ve NullPointerException hatası alırsınız.
		}
		catch (IOException e) {
			e.printStackTrace();
		}*/
		System.out.println("Program çalışmaya devam ediyor.");
	}
}