package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		/*Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement compris entre 1 et 10 :*/
		System.out.println("Choississez un nombre en 1 et 10 :");
		Scanner scanner = new Scanner(System.in) ;
		int nb = scanner.nextInt() ;
		boolean bool = false;
		while(bool == false) {
			/*Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.*/
			if(1<=nb && nb<=10) {
				System.out.println("Te connaissant, tu as du choisir "+nb);
				bool = true;
				scanner.close();
			}
			/*Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un nombre à l’utilisateur. */
			else {
				System.out.println("J'ai dit \"Choississez un nombre en 1 et 10 :\"");
				nb = scanner.nextInt() ;
			}
		}
	}

}
