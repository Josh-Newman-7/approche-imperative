package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		//Comptage du nombre d’éléments en commun dans ces 2 tableaux
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		int somme = 0;
		
		//Pour chaque élément du premier tableau
		for(int i=0;i<array1.length;i++) {
			//On compare avec chacune des valeurs du second tableau
			for(int j=0;j<array2.length;j++) {
				if(array1[i] == array2[j]) {
					somme++;
					break;
				}
			}
		}
		System.out.println("Nombre d'éléments en commun dans ces deux tableaux :"+somme);
	}

}
