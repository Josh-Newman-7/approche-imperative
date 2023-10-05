package fr.algorithmie;
import java.text.DecimalFormat;

public class CalculMoyenne {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		//Quelle est la moyenne des éléments du tableau ? 
		int somme = 0;
	    
	    for (int i = 0; i < array.length; i++) {
	        somme += array[i];
	    }
	    double moyenne = (double) somme / array.length;
	    
	    //Arrondi de la Moyenne a un double de 2 décimals
	    DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String moyenneArrondi = decimalFormat.format(moyenne);
        
	    System.out.println("Moyenne des éléments du tableau : "+moyenneArrondi);
	}

}
