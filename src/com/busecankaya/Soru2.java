package com.busecankaya;

public class Soru2 {

	public static void tekrarEdenIlkSayi(int[] array, int n) {


		int counter = 1;
		int index0 = 0;
		int index1 = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					counter++;

					if (array[i] != 0) {
						index0 = array[i];
					} else {
						index1 = array[i];
					}

				}

			}
			if (index0 != 0 || index1 != 1) {
				break;
			}
		}
		if (counter == 1) {
			System.out.println("Tekrar eden sayı bulunamamıştır.");
		}else if(index1 != 1) {
			System.out.println(index1 + " sayısı " + counter + " kere tekrar etmiştir." );
		}else {
			System.out.println(index0 + " sayısı " + counter + " kere tekrar etmiştir." );
		}
			
	}

	public static void main(String[] args) {
		int[] array = { 9, 7, 5, 3, 7, 7, 1, 3, 18, 2, 0, 7 };

		int N = array.length;
		tekrarEdenIlkSayi(array, N);
	}

}
