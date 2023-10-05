package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		//Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3 
		System.out.println("Affichage Entier Supérieur à 3");
		for(int i : array) {
			if(i<3) {
				System.out.println(i);
			}
		}
		
		System.out.println("\n------------------------------------------\n");
		//Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		System.out.println("Affichage Entier Pairs");
		for(int i : array) {
			/*Comparaison de I Avec le décalage binaire de i, qui renvoie le nombre pair inferieur au plus proche*/
			if(i>>1<<1 == i) {
				System.out.println(i);
			}
		}
		
		System.out.println("\n------------------------------------------\n");
		//Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs 
		System.out.println("Affichage index Pairs");
		for(int i=0;i<array.length;i+=2) {
			System.out.println(array[i]);
		}
		
		System.out.println("\n------------------------------------------\n");
		//Combiner une boucle et un test de manière à n’afficher que les entiers impairs
		System.out.println("Affichage Entier Impairs");
		for(int i : array) {
			if(i>>1<<1 != i) {
				System.out.println(i);
			}
		}
	}

}
