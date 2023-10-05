package fr.tableaux;

public class ExerciceDeclarationTab {
	public static void main(String[] args) {
		//DECLARATION DE BASE
		int[] tab = {8,-7,12,1,-2,14,17,9};
		System.out.println(tab[0]);
		System.out.println(tab.length);
		System.out.println(tab[tab.length-1]);
		//Le tableau ne faisant que 8 en taille, l'index 10 n'existe pas
		//System.out.println(tab[10]);
	}
}
