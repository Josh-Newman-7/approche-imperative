package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		//Rechercher le plus petit élément du tableau 
		int min =array[0];
		for(int i : array) {
			if(min>i) {
				min = i;
			}
		}
		System.out.println("Min : "+min);
	}

}