package medyanbul;

import java.util.Arrays;
import java.util.Scanner;

public class proje {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. dizinin uzunluğunu giriniz :");
		int dizi1_uzunluk = input.nextInt();
		
		System.out.println("2. dizinin uzunluğunu giriniz :");
		int dizi2_uzunluk = input.nextInt();
		
	 
		int [] birleşik_dizi = new int[dizi1_uzunluk + dizi2_uzunluk];
		
		for (int i = 0 ; i <= birleşik_dizi.length - 1 ; i++) {
			
			if(i <= dizi1_uzunluk - 1) {
				System.out.println("1. Dizinin " + (i + 1) + ". elemanını giriniz :");
				birleşik_dizi[i] = input.nextInt();
			}
			else {
				System.out.println("2. Dizinin " + (i - (dizi1_uzunluk - 1)) + ". elemanını giriniz :");
				birleşik_dizi[i] = input.nextInt();
			}
		
		}
		 Arrays.sort(birleşik_dizi);
		 
	 
		  
		 double medyan ;
		 
		 double sayi1 =  birleşik_dizi[birleşik_dizi.length /2];
		 double sayi2 = birleşik_dizi[(birleşik_dizi.length /2)] - 1;
 
		 if(birleşik_dizi.length % 2 == 0) {
           
			 medyan =  (sayi1 + sayi2) / 2;
		 }
		 else {
			 medyan =birleşik_dizi[birleşik_dizi.length / 2] ;
		 }
		 
		System.out.println("Medyan : " + medyan);
 
	}

}
