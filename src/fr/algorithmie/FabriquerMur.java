package fr.algorithmie;

public class FabriquerMur {

	public static void main(String[] args) {
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
		}
	
	public static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
		//Combien faut il de grosse brique dispo parmi le stock pour dépassser la longueur du mur ?
		int sommeB = 0;
		for (int i=0; i<nbBig;i++) {
			if(i*5<longueur) {
				sommeB++;
			}
		}
		//Si on dépasse le mur avec les grosses briques, il faut en retirer une
		if(sommeB*5 >longueur) {
			sommeB--;
		}
		
		//On complete avec des petites briques dans la limite des stocks disponibles
		int sommeS = 0;
		for (int i=0; i<nbSmall;i++) {
			if(longueur - sommeB*5 - i >0) {
				sommeS++;
			}
		}
		//Si on a assez de grosse brique ET de quoi completer avec des petites
		return sommeB*5+sommeS == longueur;
	}
	
	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
		}
	}
}
