package com.mehmett._01_UserDefinedExeption;

public class Notlar {
	public static void main(String[] args) {
		
		try {
			notKontrol(120);
		}
		catch (NotOutOfBoundsExeption e) {
			e.printStackTrace();
		}
		
		System.out.println("Program çalışmaya devam ediyor...");
	}
	
	private static void notKontrol(int not) throws NotOutOfBoundsExeption{
		if (not < 0 || not > 100){
			
			throw new NotOutOfBoundsExeption("not 0-100 arasında değil");
		}else {
			System.out.println("Not sorunsuz");
		}
	}
}