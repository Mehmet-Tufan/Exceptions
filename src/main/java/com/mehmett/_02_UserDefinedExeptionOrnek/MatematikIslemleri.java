package com.mehmett._02_UserDefinedExeptionOrnek;

import com.mehmett._01_UserDefinedExeption.NotOutOfBoundsExeption;

import java.util.Scanner;
import java.util.Set;

public class MatematikIslemleri {
	public static void main(String[] args) {
		int sayi1=10;
		int sayi2=20;
		System.out.println("Matematik işlemleri");
		System.out.println("1-Çarpma ");
		System.out.println("2-Bölme ");
		System.out.println("3-Toplama ");
		System.out.println("4-Çıkarma ");
		System.out.println("0-Çıkış ");
		
		try {
			secimYap();
			
		}
		catch (WrongChoiceExeption e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	private static void secimYap() throws WrongChoiceExeption {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi = scanner.nextInt();
		if (sayi < 0 || sayi > 4) {
			
			throw new WrongChoiceExeption("secim 0-4 arasında değil");
		} else {
			System.out.println("secim gecerli");
		}
	}
}