package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		//Valeurs de tests
		int[] tab = {};
		int[] tab2 = {0};
		int[] tab3 = {1};
		int[] tab4 = {0,1};
		int[] tab5 = {0,0};
		int[] tab6 = {0,1,0};
		int[] tab7 = {1,0,1};
		int[] tab8 = {0,0,0,0,1};
		int[] tab9 = {10,0,-10};
		int[] tab10 = {0};

		System.out.println("FirstLast de tab : " + FirstL(tab));
		System.out.println("FirstLast de tab2 : " + FirstL(tab2));
		System.out.println("FirstLast de tab3 : " + FirstL(tab3));
		System.out.println("FirstLast de tab4 : " + FirstL(tab4));
		System.out.println("FirstLast de tab5 : " + FirstL(tab5));
		System.out.println("FirstLast de tab6 : " + FirstL(tab6));
		System.out.println("FirstLast de tab7 : " + FirstL(tab7));
		System.out.println("FirstLast de tab8 : " + FirstL(tab8));
		System.out.println("FirstLast de tab9 : " + FirstL(tab9));
		System.out.println("FirstLast de tab10 : " + FirstL(tab10));
	}
	
	/*On calcule une valeur booléenne qui contrôle le tableau de la sorte :
		o elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le premier et le dernier élément du tableau ont la même valeur
		o elle vaut false dans les autres cas*/
	public static boolean FirstL(int[] array) {
		return (array.length >= 1 && array[0] == array[array.length - 1]);
	}
}
