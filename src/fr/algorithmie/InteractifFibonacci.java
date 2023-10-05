package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		/*Ecrire un algorithme qui calcule et affiche le nombre de rang N*/
		System.out.print("Choisissez un rang N : ");
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        /*La suite de Fibonacci est une suite qui commence par 0 et 1 et dans laquelle le nombre de rang N est égal à la somme des nombres de rangs N-1 et N-2*/
        if(N < 2) {
			System.out.println("Il faut que le rang soit supérieur à 2 :\"");
			N = scanner.nextInt() ;
		}
        scanner.close();
        /*tab[0] = N-2*/
        /*tab[1] = N-1*/
        /*tab[2] = N*/
        int[] tab = new int[] {0,1,1};
        for(int i=0;i<N;i++) {
        	tab[0] = tab[1];
        	tab[1] = tab[2];
        	tab[2] = tab[0]+tab[1];
        }
        System.out.println("Somme : "+ tab[2]);
	}

}
