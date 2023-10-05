package fr.algorithmie;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		/*Dans cette classe, on déclare un tableau d’entiers*/
		int[] array = {0,1,2,3};
		System.out.println("Rotate ");
		for(int i : RotateRight(array)) {
			 System.out.println(i);
		}
	}

	/*Effectuez une rotation à droite des éléments.*/
	public static int[] RotateRight(int[] array) {
		/*On copie le tableau pour en obtenir un tout pareil mais vierge*/
		int[] array2 = Arrays.copyOf(array, array.length);
		/*Le dernier element devient le premier du nouveau tableau*/
		array2[0]=array[array.length-1];
		/*Pour le reste, on copie colle avec un décalage de 1*/
		for(int i=0;i<array.length-1;i++) {
			array2[i+1] = array[i];
		}
		return array2;
	}
}
