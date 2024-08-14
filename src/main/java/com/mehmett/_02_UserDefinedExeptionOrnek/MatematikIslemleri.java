package com.mehmett._02_UserDefinedExeptionOrnek;

import java.util.Scanner;

public class MatematikIslemleri {
	public static void main(String[] args) {
		int sayi1=10;
		int sayi2=0;
		Scanner scanner=new Scanner(System.in);
		
		while (true) {
			System.out.println("Matematik işlemleri");
			System.out.println("1-Çarpma ");
			System.out.println("2-Bölme ");
			System.out.println("3-Toplama ");
			System.out.println("4-Çıkarma ");
			System.out.println("0-Çıkış ");
			System.out.print("Secim yapınız : ");
			int userInput;
			switch (userInput = scanner.nextInt()) {
				case 1:
					carpma(sayi1, sayi2);
					break;
				case 2:
					bolme(sayi1,sayi2);
					break;
				case 3:
					toplama(sayi1,sayi2);
					break;
				case 4:
					cıkarma(sayi1,sayi2);
					
					break;
				case 0:
					System.out.println("Program kapatılıyor");
					return;
				default:
					try {
						userInput();
					}
					catch (WrongChoiceExeption e) {
						e.printStackTrace();
					}
			}
			
		}
		
		
		
	}
	private static void userInput() throws WrongChoiceExeption{
		throw new WrongChoiceExeption("0 ile 4 arasında bir sayi girilmelidir.");
	}
	
	private static void cıkarma(int sayi1, int sayi2) {
		System.out.println(sayi1-sayi2);
		
	}
	
	private static void toplama(int sayi1, int sayi2) {
		System.out.println(sayi1+sayi2);
		
	}
	
	private static void bolme(int sayi1, int sayi2) {
		try {
			System.out.println(sayi1/sayi2);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void carpma(int sayi,int sayi1) {
		System.out.println(sayi*sayi1);
	}
	
	
}