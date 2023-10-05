package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		/*Ecrire un programme qui demande un nombre à l’utilisateur puis calcule la somme de tous les entiers compris entre 1 et ce nombre.*/
		System.out.println("Choississez un nombre en 1 et 10 :");
		Scanner scanner = new Scanner(System.in) ;
		int nb = scanner.nextInt() ;
		boolean bool = false;
		while(bool == false) {
			if(1<=nb && nb<=10) {
				System.out.println("Pas du factoriel, mais presque");
				int somme = 0;
				for(int i=1;i<=nb;i++) {
					somme = somme + i;
				}
				System.out.println(somme);
				bool = true;
				scanner.close();
			}else {
				System.out.println("J'ai dit \"Choississez un nombre en 1 et 10 :\"");
				nb = scanner.nextInt() ;
			}
		}

	}

}
