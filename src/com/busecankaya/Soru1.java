package com.busecankaya;

public class Soru1 {

	public static void yildizlar() {
		for (int i = 0; i < 4; i++) {
			for (int j = 7; j >0; j--) { 
				System.out.print("* ");
				
			}
			System.out.println();
		}
		for (int i = 5; i>=0; i--) {
			for (int j = 0; j <= i; j++) { 
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		yildizlar();

	}
}
