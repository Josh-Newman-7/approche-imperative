package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
	public static void main(String[] args) {
		/*Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et 10. */
		System.out.println("Choississez un nombre en 1 et 10 :");
		Scanner scanner = new Scanner(System.in) ;
		int nb = scanner.nextInt() ;
		boolean bool = false;
		while(bool == false) {
			/*Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de multiplication de ce nombre.*/
			if(1<=nb && nb<=10) {
				System.out.println("Voici la table de "+nb);
				for(int i=1;i<=10;i++) {
					System.out.println(i + "x" + nb + "=" + (nb*i));
				}
				bool = true;
				scanner.close();
			}else {
				System.out.println("J'ai dit \"Choississez un nombre en 1 et 10 :\"");
				nb = scanner.nextInt() ;
			}
		}
	}
}
