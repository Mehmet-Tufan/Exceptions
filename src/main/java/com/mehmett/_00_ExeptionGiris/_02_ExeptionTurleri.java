package com.mehmett._00_ExeptionGiris;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * exeption
 * -Sizin tanımladığınız exeptionlar(User-Defined Exeption)
 * -Hazır gelen exeptionlar (Build-in Exeptions)
 *        -Checked
 *            Derleme zamanında mutlaka kontrol sağlanmasını zorunlu kılar.
 *        -Unchecked : RuntimeExeption'dan türetilen sınıflar
 */
public class _02_ExeptionTurleri {
	public static void main(String[] args) {
		
		try {
			dosyaOku();
			beklet();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
//			System.out.println(e.getLocalizedMessage());
//			System.out.println(e.toString());
			System.out.println(e);
		}
		
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("program devam ediyor");
		
		//ÖRNEK 2
		Personel personel=new Personel("Sami","Sarı");
		System.out.println(personel.getName());
		
		Personel personel1=null;
		try {
			System.out.println(personel1.getName());
		}
		//Catch sılaması önemlidir. Özelden genele doğru gidilmelidir.
		catch (NullPointerException e){
			System.out.println("e NullPointerException ..........."+e);
		}
		catch (Exception e) {
//			e.printStackTrace();
			System.out.println("e.getMessage() :"+e.getMessage());
		}
		
		System.out.println("program devam ediyor 2");
		
		//ÖRNEK 3
		
		int [] sayiDizisi={3,5};
		System.out.println(sayiDizisi[1]);
		try {
			System.out.println(5/0);
			System.out.println(sayiDizisi[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//hata olsada olmasada çalışır
			System.out.println("finally bloğuna düştük");
		}
		
		System.out.println("program devam ediyor 3");
	}
	
	private static void beklet() throws InterruptedException {
		Thread.sleep(2000); // 2sn beklet.
	}
	
	private static void dosyaOku() throws FileNotFoundException {
		FileInputStream fis = null;
		fis=new FileInputStream("C:/javaFiles/Hello3.txt");
	}
}