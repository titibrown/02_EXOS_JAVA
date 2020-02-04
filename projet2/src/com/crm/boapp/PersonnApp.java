package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Personnes;

public class PersonnApp {

	public static void main(String[] args) {

//		Personnes pers = new Personnes();
//		pers.surnom = "joe";
//		pers.setNom("charih");
//
//		System.out.println("bienvenue " + pers.getNom() + " (" + pers.surnom + ")");
		
		Scanner sc = new Scanner(System.in);
		Personnes pers = new Personnes();
		System.out.println("Veuillez saisir votre prenom?");
		pers.setprenom(sc.nextLine());
		System.out.println("veuillez saison votre nom?");
		pers.setNom(sc.nextLine());
		System.out.println("quel est votre surnom ?");
		pers.surnom = sc.nextLine();
		sc.close();
		
		pers.afficherDetails();
		
		System.out.println("Bonjour " + pers.getprenom() + "  " + pers.getNom() + "  " + (  pers.surnom));
	}

	
	
}
