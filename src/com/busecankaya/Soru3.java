package com.busecankaya;

import java.util.Scanner;

public class Soru3 {
	
	public static void karakterSayici(String cumle , char karakter) {
		
		int counter = 0;
		
		for (int i = 0; i < cumle.length(); i++) {
			if(cumle.charAt(i) == karakter) {
				counter++;
			}
			
		}System.out.println(counter);
		
	}

	public static void main(String[] args) {
		
		karakterSayici("Bugün güzel bir gün", 'g');
		karakterSayici("Bugün güzel bir gün", 'x');
		
	}

}
