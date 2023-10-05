package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		//Valeurs de tests
		int[] tab = {};
		int[] tab2 = {0};
		int[] tab3 = {6};
		int[] tab4 = {0,6};
		int[] tab5 = {6,6};
		int[] tab6 = {0,6,0};
		int[] tab7 = {6,0,6};
		int[] tab8 = {0,0,0,0,6};
		int[] tab9 = {10,0,-10};

		System.out.println("FirstLast de tab : " + FirstLastSix(tab));
		System.out.println("FirstLast de tab2 : " + FirstLastSix(tab2));
		System.out.println("FirstLast de tab3 : " + FirstLastSix(tab3));
		System.out.println("FirstLast de tab4 : " + FirstLastSix(tab4));
		System.out.println("FirstLast de tab5 : " + FirstLastSix(tab5));
		System.out.println("FirstLast de tab6 : " + FirstLastSix(tab6));
		System.out.println("FirstLast de tab7 : " + FirstLastSix(tab7));
		System.out.println("FirstLast de tab8 : " + FirstLastSix(tab8));
		System.out.println("FirstLast de tab9 : " + FirstLastSix(tab9));
	}
	
	/*On calcule une valeur booléenne qui contrôle le tableau de la sorte :
		o elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
		o elle vaut false dans les autres cas*/
	
	public static boolean FirstLastSix(int[] array) {
		return (array.length>0 && (array[0] == 6 || array[array.length-1] == 6));
	}
}
