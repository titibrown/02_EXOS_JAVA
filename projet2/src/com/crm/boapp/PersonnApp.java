package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Personne;

public class PersonnApp {

	public static void main(String[] args) {

//		Personne pers = new Personne();
//		pers.surnom = "joe";
//		pers.setNom("charih");
//
//		System.out.println("bienvenue " + pers.getNom() + " (" + pers.surnom + ")");
//		
//		
//		Personne pers2 = new Personne ();
//		pers2.afficherDetails();
//		
//		//Déclencher une exeption suite au déréférencement de l'objet
//		pers2 = null;
//		System.out.println(pers2.getNom());
//		Personne pers3 = new Personne ("bob","dylan");
//		pers.afficherDetails();
		
		
		int a = 5;
		int b = 5;
		if (a ==b) {
			System.out.println("Les 2 entiers sont identiques");
		}
		
		Personne pers4 = new Personne ("khalil", "charih");
		Personne pers5 = new Personne ("khalil", "charih");
		if (pers4 == pers5) {
			System.out.println("les 2 objets sont identiques");
		}
		
		if (pers4.isEquals(pers5)) {
			System.out.println("les 2 objets sont identiques (méthode isEquals");
		}
		
		int nb = 5 ;
		pers5.incrementeNombre(nb);
		System.out.println(nb);
		
		pers4.modifierPersonne(pers5);
		pers5.afficherDetails();
		
		
		/////////////////////////////////////////////
//		Scanner sc = new Scanner(System.in);
//		Personne pers = new Personne();
//		System.out.println("Veuillez saisir votre prenom?");
//		pers.setprenom(sc.nextLine());
//		System.out.println("veuillez saison votre nom?");
//		pers.setNom(sc.nextLine());
//		System.out.println("quel est votre surnom ?");
//		pers.surnom = sc.nextLine();
//		sc.close();
//		
//		pers.afficherDetails();
//		
//		System.out.println("Bonjour " + pers.getprenom() + "  " + pers.getNom() + "  " + (  pers.surnom));
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
}
