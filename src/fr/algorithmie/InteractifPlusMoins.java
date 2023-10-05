package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		/*Ecrire un jeu qui : */
		System.out.println("On va jouer à un jeu!");
		/*- choisit un nombre aléatoire entre 1 et 100*/
		int rand = (int) (Math.random()*100)+1;
		/*- puis demande à l’utilisateur de trouver ce nombre en lui indiquant s’il est au-dessus ou en dessous du nombre,*/
		System.out.println("J'ai choisi un nombre entre 1 et 100, devines le");
        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();
        
        int nbCoups = 1;
        boolean bool = false;
		while(bool == false) {
			/*- Lorsque l’utilisateur a trouvé le nombre, le programme affiche « Bravo, vous avez trouvé en N coups » où N représente le nombre d’essais effecté par l’utilisateur*/
			if(nombre == rand) {
	        	System.out.println("Bravo, tu as trouvé en : " + nbCoups + " coups");
	        	/*- le programme se termine.*/
	        	bool = true;
	        	scanner.close();
	        }else if (nombre < rand) {
	        	System.out.println("C'est plus");
	        	nbCoups ++;
	        	nombre = scanner.nextInt() ;
	        }else {
	        	System.out.println("C'est moins");
	        	nbCoups ++;
	        	nombre = scanner.nextInt() ;
	        }
		}
	}

}
