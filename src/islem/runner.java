package islem;

import java.util.Scanner;

public class runner {

	
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		
		
		sc = new Scanner(System.in);
		int islem =0;
		System.out.print("bir i�lem se�iniz...: ");
		islem = sc.nextInt();
		long start = System.nanoTime();
		switch (islem) {
		case 0: System.out.println("Toplama i�lemi se�ildi");	break;
		case 1:	System.out.println("��kartma i�lemi se�ildi");break;
		case 2:	System.out.println("�arpma i�lemi se�ildi");break;
		case 3:	System.out.println("b�lme i�lemi se�ildi");break;
		default:System.out.println("HATA!!! Ge�erli bir i�lem se�iniz...");break;
		}
		long end = System.nanoTime();
		
		System.out.println("ba�lama zaman�....: "+start);
		System.out.println("biti� zaman�......: "+end);
		System.out.println("ge�en s�re....: "+((end-start)/1000));
		

	}

}
