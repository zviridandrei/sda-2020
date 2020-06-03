package Lab_1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduceti primul nr: ");
		int nr1 = scanner.nextInt();
		System.out.println("Primul numar este: "+nr1);
		
		System.out.println("Introduceti al doilea nr: ");
		int nr2 = scanner.nextInt();
		System.out.println("Al doilea numar este: "+nr2);
		
		System.out.println("Suma este = " +(nr1+nr2));
		System.out.println("Diferenta este = " +(nr1-nr2));
		System.out.println("Produsul este = " +(nr1*nr2));
		
		double impartire;
		impartire = (double)nr1/ (double)nr2;
		System.out.println("Impartire = " +impartire);
		
		float media = (nr1+nr2)/2;
		System.out.println("Media = " +media);
		
		if(nr1>nr2)
			System.out.println("Distanta este = " +((nr1-nr2)));
		else 
			System.out.println("Distanta este = " +((nr2-nr1)));
		
		if(nr1>nr2)
			System.out.println("Numarul maxim = " +nr1);
		else 
			System.out.println("Numarul maxim = " +nr2);
			
		
	}
		
	}


