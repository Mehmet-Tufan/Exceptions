package com.mehmett._00_ExeptionGiris;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * exeption
 * -Sizin tanımladığınız exeptionlar(User-Defined Exeption)
 * -Hazır gelen exeptionlar (Build-in Exeptions)
 -Checked (ClassNotFoundException, InterruptedException, IOException, FileNotFoundException)
 *          Derleme zamanında mutlaka kontrol sağlanmasını zorunlu kılar.
 *          Bu kontrol için 2 yol vardır.
 *              1. YOL: Try-Catch bloğuna alarak.
 *              2. YOL: İçinde bulunduğumuz metodun imzasına throws ile exception adını yazarak.
 *      -Unchecked (ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException) : RuntimeException'dan türetilen sınıflar.
 */
public class _02_ExeptionTurleri {
	public static void main(String[] args) {
		
		try {
			dosyaOku();
			beklet();
		}
		// catch bloklarından sadece 1si çalışır.
		catch (FileNotFoundException e) {
			//System.out.print("e.printStackTrace()........:");
			//e.printStackTrace();
			System.out.println("e.getMessage():............:"+e.getMessage());
			//System.out.println("e.getLocalizedMessage()....:"+e.getLocalizedMessage());
			//System.out.println("e.toString()...............:"+e.toString());
			System.out.println("e:.........................:"+e);
		}
		catch (IOException e) {
			System.out.println("IO Exception:............:"+e.getMessage());
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		catch (Exception e){
			System.out.println("Exception:............:"+e.getMessage());
		}
		System.out.println("program devam ediyor. 1");
		
		// ORNEK 2:
		
		Personel p1=new Personel("Sami","Sarı");
		System.out.println(p1.getName());
		
		Personel p2=null;
		try {
			System.out.println(p2.getName());
		}
		//catch sıralaması önemlidir. Özelden genele doğru gidilmelidir.
		catch (NullPointerException e){ //Exception 'java.lang.NullPointerException' has already been caught
			System.out.println("e NullPointerException:.........................:"+e);
		}
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println("e Exception:.........................:"+e);
		}
		System.out.println("program devam ediyor. 2");
		
		// ÖRNEK 3
		
		int[] sayiDizisi= {3, 5};
		System.out.println(sayiDizisi[1]);
		try {
			System.out.println(5/2); // hata oluşan yer!
			System.out.println(sayiDizisi[0]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("finally bloğuna düştük....");
		}
		System.out.println("program devam ediyor. 3");
	}
	
	private static void beklet() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	private static void dosyaOku() throws FileNotFoundException {
		FileInputStream fis = null;
		fis=new FileInputStream("C:/javaFiles/Hello4.txt");
	}
}