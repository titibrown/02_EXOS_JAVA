package com.crm.bo;

import java.util.Date;
import java.util.Scanner;

public class Personne {
//
//	// Attributs
//
	public String surnom;
	private String nom;
	private String prenom;
	protected Date dateNaissance;
	
	// Constructeurs

	public Personne() {

		nom = "";
		prenom = "";
		surnom = "";
		System.out.println("Construction d'un objet Personne (sans param)");

	}

	public Personne(String prenom, String nom) {

		this.prenom = prenom;
		this.nom = nom;
	}

	// Méthodes

	/**
	 * cette méthode renvoie la valeur de l'attribut nom
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;

	}

	public boolean isEquals(Personne pers) {
		if (this.prenom.equals(pers.prenom) && this.nom.contentEquals(pers.nom)) {
			return true;
		}
		return false;

	}

	public int incrementeNombre(int nb) {
		return nb++;

	}

	public void modifierPersonne(Personne pers) {
		pers.nom.toUpperCase();
		pers.prenom.toUpperCase();

	}

	// Méthode qui modifie la Valeur de l'attribut nom
	public void setNom(String n) {

		nom = n;
	}

	public String getprenom() {
		return prenom;

	}

	public void setprenom(String p) {
		prenom = p;

	}

	protected Date dateNaissance() {
		return dateNaissance;

	}

	public void afficherDetails() {
		System.out.println(prenom + nom + surnom);
	}

//	}

	public void afficherDetails(String langue) {
		if (langue.equals("Français")) {
			System.out.println("bonjour vous êtes: " + prenom + "," + nom + "," + surnom);
		}
		if (langue.equals("Anglais"))
			System.out.println("Hello you are: " + prenom + "," + nom + "," + surnom);
	}

}
