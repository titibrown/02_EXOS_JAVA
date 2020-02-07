package com.crm.bo;

public class Rectangle {

	// #################################ATTRIBUT####################################

	public float longueur;
	public float largeur;

//	// ################################ CONSTRUCTOR ################################
	public Rectangle() {
		
		longueur = 0;
		largeur = 0;
	}

	public Rectangle(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;

	}

//	// ############################## GETTER & SETTER ##############################
	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public float getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public float perimetre() {
		return (longueur + largeur) * 2;

	}

	public float aire() {

		return longueur * largeur;
	}
//	// ################################## METHODS ##################################

	public void afficherdetail() {
		System.out.println("La longueur du rectange est : " + getLongueur());
		System.out.println("La largeur du rectange est : " + getLargeur());

		System.out.println("périmètre : " + perimetre());
		System.out.println(" surface : " + aire());
	}

	
	
	
}
