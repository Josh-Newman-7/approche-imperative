package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		System.out.println("Nous allons jouer au jeu des 21 batons.\nLes règles sont simple :");
		System.out.println("Il y a 21 batons devant nous, et tour a tour, nous allons prendre 1,2 ou 3 batons. Celui qui prends le dernier a perdu.");
		System.out.println("Indique moi le nombre de batons que tu veux retirer a chaque tour, ou bien 4 pour quitter le jeu.");
		System.out.println("Je te laisse commencer.");
		System.out.println("\n\n");
		
		Scanner scanner = new Scanner(System.in) ;
		
		int nbBatons = 21;
		
		boolean quit = false;
        while (!quit) {
        	/*Annonce de l'état du jeu*/
        	System.out.println("Il reste "+nbBatons+" batons sur la table");
            System.out.print("\nChoisis une option (1-4) : ");
            int choice = scanner.nextInt();
            
            /*Normalement, ce bout de code nettoie la console a chaque coup. Pas de bol que ca ne marche pas*/
            System.out.print("\033[H\033[2J");  
            System.out.flush();           
            
            /*Tour du joueur*/
            switch (choice) {
            
                case 1:
                    nbBatons--;
                    /*Condition de Victoire*/
                    if(nbBatons ==1) {
                    	System.out.println("On dirait bien que j'ai perdu");
                    	quit = true;
                    }
                    break;
                    
                case 2:
                	nbBatons-=2;
                	/*Condition de Victoire*/
                	if(nbBatons ==1) {
                    	System.out.println("On dirait bien que j'ai perdu");
                    	quit = true;
                    }
                    break;
                    
                case 3:
                	nbBatons-=3;
                	/*Condition de Victoire*/
                	if(nbBatons ==1) {
                    	System.out.println("On dirait bien que j'ai perdu");
                    	quit = true;
                    }
                    break;
                    
                /*Quitter le programme*/
                case 4:
                    quit = true;
                    break;
                    
                /*Autres entrées que 1,2,3 ou 4*/
                default:
                    System.out.println("Option non valide.");
                    break;
            }
            
            /*Tour de L'IA*/
            /*Faire en sorte qu'il reste 17 batons, puis 13, puis 9, puis 5 pour gagner a tout coup*/
            if(nbBatons > 17 && nbBatons < 21) {
            	int dif = nbBatons-17;
            	System.out.println("Je choisis : "+dif);
            	nbBatons = nbBatons - dif;
            }
            if(nbBatons >13 && nbBatons < 17) {
            	int dif = nbBatons-13;
            	System.out.println("Je choisis : "+dif);
            	nbBatons = nbBatons - dif;
            }
            if(nbBatons >9 && nbBatons < 13) {
            	int dif = nbBatons-9;
            	System.out.println("Je choisis : "+dif);
            	nbBatons = nbBatons - dif;
            }
            if(nbBatons >5 && nbBatons < 9) {
            	int dif = nbBatons-5;
            	System.out.println("Je choisis : "+dif);
            	nbBatons = nbBatons - dif;
            }
            if(nbBatons >1 && nbBatons < 5) {
            	int dif = nbBatons-1;
            	System.out.println("Je choisis : "+dif);
            	nbBatons = nbBatons - dif;
            }
            if(nbBatons == 1) {
            	System.out.println("On dirais que J'ai gagné");
            	quit = true;
            	break;
            }
        }
        scanner.close();
    }
	
}
