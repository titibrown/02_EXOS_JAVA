package com.crm.bo;

import java.util.Date;

public class Personnes {

	// Attributs

	public String surnom;
	private String nom;
	private String prenom;
	protected Date dateNaissance;

	// Méthodes

	/**
	 * cette méthode renvoie la valeur de l'attribut nom
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;

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
	System.out.println("Vous êtes " + prenom + nom +surnom );

	}

	
}
