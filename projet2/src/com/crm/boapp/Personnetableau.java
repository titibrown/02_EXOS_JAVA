package com.crm.boapp;

import java.util.Scanner;
import com.crm.bo.Personne;

public class Personnetableau {

	Scanner sc = new Scanner(System.in);
	int nbPersonne = 0;System.out.println("De combien de personne se compose votre équipe ?")
	nbPersonne=Integer.parseInt(sc.nextLine());
	Personne[] tabPers = new Personne[nbPersonne]; { // Déclaration d'un tableau d'objet de type Personne

	// construction d'objets de type Personne pour chaque case du tableau
	for(
	int i = 0;i<tabPers.length;i++)
	{
		tabPers[i] = new Personne();
		System.out.println("\nMembre n° " + (i + 1) + ", veuillez saisir votre Prénom :");
		tabPers[i].setprenom(sc.nextLine());
		System.out.println("Veuillez saisir votre Nom :");
		tabPers[i].setNom(sc.nextLine());
		System.out.println("Veuillez saisir votre Surnom :");
		tabPers[i].surnom = sc.nextLine();
		tabPers[i].afficherDetails();
	}System.out.println("\nListe des membres de l'équipe :");for(
	Personne per:tabPers)
	{
		System.out.println(per.surnom + " (" + per.getPrenom() + " " + per.getNom() + ")");
	}

	sc.close();
}
