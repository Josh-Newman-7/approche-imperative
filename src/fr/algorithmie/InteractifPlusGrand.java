package fr.algorithmie;
import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		/*Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand de ces nombres. */
        System.out.println("Saisissez un nombre (1/10)");
        Scanner scanner = new Scanner(System.in);
        int nombreMax = scanner.nextInt();
        
        int[] tab = new int [10];
        tab[0] = nombreMax;
        for (int i = 1; i <= 9; i++) {
            System.out.println("Saisissez un nombre ("+(i+1)+"/10)");
            int nombre = scanner.nextInt();
            tab[i]=nombre;
            if (nombre > nombreMax) {
                nombreMax = nombre;
            }
        }
        
        System.out.println("Le plus grand nombre parmi les 10 nombres saisis est : " + nombreMax);
        System.out.println("Liste donnée");
        for(int i : tab) {
        	System.out.print(i + ",");
        }
        scanner.close();
	}

}
