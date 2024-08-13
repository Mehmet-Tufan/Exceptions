package com.mehmett._00_ExeptionGiris;

public class _04_ExeptionOrnekler {
	public static void main(String[] args) {
		String boy="170 ";
		int boyInteger = 0;
		try {
			boyInteger = Integer.parseInt(boy);
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Gecersiz format");
		}
		System.out.println(boyInteger);
	}
}