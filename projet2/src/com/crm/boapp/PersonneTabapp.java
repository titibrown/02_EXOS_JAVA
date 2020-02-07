package com.crm.boapp;
import com.crm.bo.Personne;
public class PersonneTabapp {

	public static void main(String[] args) {
		
		
		// Déclaration des variables
		
		
		Personne[] persTab = new Personne[2];
		Personne pers1 = new Personne();
		Personne pers2 = new Personne();
		// Initialisation
		pers1.setprenom("Aure");
		pers1.setNom(" Midlane ");
		pers2.setprenom(" Hamza ");
		pers2.setNom(" Le rois");
		pers2.surnom = " des Blagueurs";
		persTab[0] = pers1;
		persTab[1] = pers2;
		// Parcours du tableau
		for(Personne p : persTab) {
			p.afficherDetails();
		}
	}
}