package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 }; 
		/*On enregistre la taille du plus grand tableaux*/
		int lengthMax= Math.max(array.length, array2.length);
		/*on créer un tableau de résultat de la taille du plus grand tableaux*/
        int[] res = new int[lengthMax];

        /*On cherche les valeurs a l'index données si elles existent, sinon on prends 0 (si tableau trop petit)*/
        for (int i = 0; i < lengthMax; i++) {
            int valeur1 = (i < array.length) ? array[i] : 0;
            int valeur2 = (i < array2.length) ? array2[i] : 0;
            
            /*On additionne ces deux valeurs*/
            res[i] = valeur1 + valeur2;
        }

        System.out.println("Somme : ");
		for(int i : res) {
			 System.out.println(i);
		}
	}

}
