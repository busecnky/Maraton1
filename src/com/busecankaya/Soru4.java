package com.busecankaya;

import java.util.Scanner;


public class Soru4 {

	public static void baslangic() {

		Scanner scanner = new Scanner(System.in);
		
		boolean kosul = true;
		while(kosul) {

		System.out.println("***************************");
		System.out.println("*  Geometrik Hesaplayıcı  *");
		System.out.println("***************************");
		System.out.println("1. Kare alan hesaplama");
		System.out.println("2. Kare çevre hesaplama");
		System.out.println("3. Dikdörtgen alan hesaplama");
		System.out.println("4. Dikdörtgen çevre hesaplama");
		System.out.println("5. Daire alan hesaplama ");
		System.out.println("6. Daire Çevre hesaplama");
		System.out.println("7. Çıkış");

		int islem = scanner.nextInt();
		

		switch (islem) {
		case 1:
			System.out.println("Karenin bir kenar uzunluğunu giriniz: ");
			double s1 = scanner.nextDouble();
			System.out.println("Sonuç: " + Islemler.kareAlanHesapla(s1));
			kosul = true;
			break;
		case 2:
			System.out.println("Karenin bir kenar uzunluğunu giriniz: ");
			double s2 = scanner.nextDouble();
			System.out.println("Sonuç: " + Islemler.kareCevreHesapla(s2));
			kosul = true;
			break;
		case 3:
			System.out.println("Dikdörtgenin kısa alanını giriniz: ");
			double s3 = scanner.nextDouble();
			System.out.println("Dikdörtgenin uzun alanını giriniz: ");
			double s4 = scanner.nextDouble();
			System.out.println("Sonuç: " + Islemler.dikdortgenAlanHesapla(s3,s4));
			kosul = true;
			break;
		case 4:
			System.out.println("Dikdörtgenin kısa alanını giriniz: ");
			double s5 = scanner.nextDouble();
			System.out.println("Dikdörtgenin uzun alanını giriniz: ");
			double s6 = scanner.nextDouble();
			System.out.println("Sonuç: " + Islemler.dikdortgenCevreHesapla(s5,s6));
			kosul = true;
			break;
		case 5:
			System.out.println("Dairenin yarıçapını giriniz: ");
			double r1 = scanner.nextDouble();
			System.out.println("Sonuç: " + Islemler.daireAlanHesapla(r1));
			kosul = true;
			break;
		case 6:
			System.out.println("Dairenin yarıçapını giriniz: ");
			double r2 = scanner.nextDouble();
			System.out.println("Sonuç: " + Islemler.daireCevreHesapla(r2));
			kosul = true;
			break;
		case 7:
			System.out.println("Programdan çıktınız");
			kosul = false;
			break;
		default:
			System.out.println("Hatalı tuşlama. Lütfen 1-7 arasında bir sayı tuşlayınız");
			break;
			}
		}
	}

	public class Islemler {

		final static double  PI = 3.14;
		
		
		public static double kareAlanHesapla(double s1) {
			return(s1*s1);
		}
		
		public static double kareCevreHesapla(double s2) {
			return(s2*4);
		}
		
		public static double dikdortgenAlanHesapla(double s3, double s4) {
			return(s3*s4);
		}
		
		public static double dikdortgenCevreHesapla(double s5, double s6) {
			return(s5*2+s6*2);
		}
		
		public static double daireAlanHesapla(double r1) {
			return(r1*r1*PI);
			
		}
		
		public static double daireCevreHesapla(double r2) {
			return((2*r2*PI));
		}
		
	}
	
	public static void main(String[] args) {
		baslangic();

	}

	
}
