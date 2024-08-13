package com.mehmett._00_ExeptionGiris;

/**
 * Error
 * 1.CompileTime (Syntax hataları)
 * 2-RunTime : Program çalışırken oluşan hatalar
 *     a-Exeption (handle edilebilir hatalar)
 *         1-Checked
 *         2-UnChecked
 *     b-Error (handle edilemeyen hatalar) StackOverFlow
 * 3-Logical     
 */
public class Main {
	public static void main(String[] args) {
		
		bolmeIslemi();
//		int payda = 0;
//		int pay = 20;
//		int sonuc = pay / payda;
		/*
		Exception in thread "main": Main thread'de bir exception meydana geldi.
		 java.lang.ArithmeticException: Bu exception'ı fırlatan sınıfın adı.
		  / by zero : Exceptionla ilgili sınıftan gelen mesaj
	at com.barisd._00_ExceptionGiris.Main.main : hatanın gerçekleştiği metodun adı
	(Main.java:17) : hatanın meydana geldiği dosya ve satır numarası
		 */
		//System.out.println(sonuc);
		System.out.println("deneme");
	}
	
//	public static void bolmeIslemi(){
//		int payda = 0;
//		int pay = 20;
//		System.out.println("işlemden önceki kodlar");
//		int sonuc = pay / payda; // bu hata bir unchecked exception'dır. Neden? Çünkü bu kodu yazarken beni hiç
//		// uyarmadı. try/catche aldırmaya çalışmadı.
//		System.out.println(sonuc);
//
	
	
	//Runtime Exception türü dışında bir Exception throw edilirse checked exception yazmış olursunuz.
	// Şu an ArithmeticException bir Runtime Exception türü olduğu için unchecked durumdadır. try-catch ile
	// sarmalamaya zorlamaz.
	
	public static void bolmeIslemi () throws ArithmeticException {
		int payda = 0;
		int pay = 20;
		System.out.println("işlemden önceki kodlar");
		int sonuc = pay / payda; // bu hata bir unchecked exception'dır. Neden? Çünkü bu kodu yazarken beni hiç
		// uyarmadı. try/catche aldırmaya çalışmadı.
		System.out.println(sonuc);
		
		
		
	}
}