package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		System.out.println("Choississez un nombre en 1 et 10 :");
		Scanner scanner = new Scanner(System.in) ;
		int nb = scanner.nextInt() ;
		boolean bool = false;
		while(bool == false) {
			if(1<=nb && nb<=10) {
				/*Ecrire un programme qui demande un nombre à l’utilisateur puis qui affiche les 10 nombres suivants.*/
				System.out.println("A la queue leuleu");
				for(int i=1;i<=10;i++) {
					System.out.println(i + nb);
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
