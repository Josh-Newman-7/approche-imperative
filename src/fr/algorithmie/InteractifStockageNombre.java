package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10]; // Tableau initial arbitraire
        int nombreElements = 0; 
        
        /*Faire un programme avec le menu suivant :*/
        System.out.println("Menu :");
        System.out.println("1. Ajouter un nombre");
        System.out.println("2. Afficher les nombres existants");
        System.out.println("3. Quitter");
        
        boolean quit = false;
        while (!quit) {
            System.out.print("Choisissez une option (1-3) : ");
            int choice = scanner.nextInt();
            
            switch (choice) {
            
            	/*Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à l’utilisateur puis l’ajoute à un tableau. */
                case 1:
                    if (nombreElements < array.length) {
                        System.out.print("Entrez un nombre : ");
                        int nombre = scanner.nextInt();
                        array[nombreElements] = nombre;
                        nombreElements++;
                    } 
                    /*Si le tableau est plein, écrire un algorithme pour agrandir le tableau.*/
                    else {
                    	int[] array2 = Arrays.copyOf(array, array.length+1);
                    	array = array2;
                    }
                    break;
                    
                /*Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du tableau.*/
                case 2:
                    System.out.println("Contenu du array :");
                    for (int i = 0; i < nombreElements; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                    break;
                    
                /*Quitter le programme*/
                case 3:
                    quit = true;
                    break;
                    
                /*Autres entrées que 1,2 ou 3*/
                default:
                    System.out.println("Option non valide.");
                    break;
            }
        }
        scanner.close();
    }
}
