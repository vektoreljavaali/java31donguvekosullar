package islem;

import java.util.Scanner;

public class runner {

	
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		
		
		sc = new Scanner(System.in);
		int islem =0;
		System.out.print("bir iþlem seçiniz...: ");
		islem = sc.nextInt();
		long start = System.nanoTime();
		switch (islem) {
		case 0: System.out.println("Toplama iþlemi seçildi");	break;
		case 1:	System.out.println("Çýkartma iþlemi seçildi");break;
		case 2:	System.out.println("Çarpma iþlemi seçildi");break;
		case 3:	System.out.println("bölme iþlemi seçildi");break;
		default:System.out.println("HATA!!! Geçerli bir iþlem seçiniz...");break;
		}
		long end = System.nanoTime();
		
		System.out.println("baþlama zamaný....: "+start);
		System.out.println("bitiþ zamaný......: "+end);
		System.out.println("geçen süre....: "+((end-start)/1000));
		

	}

}
