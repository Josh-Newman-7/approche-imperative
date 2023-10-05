package fr.tableaux;

public class ExerciceTableauChaine {

	public static void main(String[] args) {
		//DECLARATION ET MODIFICATION
		String[] tab = {"Nantes","Danu Talis","Londres","Dirmouth","Kyoto"};
		for(int i=0;i<5;i++) {
			System.out.println(tab[i]);
		}
		System.out.println("-----------------------");
		System.out.println(tab.length);
		System.out.println("-----------------------");
		tab[3] = "Reims";
		for(int i=0;i<5;i++) {
			System.out.println(tab[i]);
		}
	}

}
