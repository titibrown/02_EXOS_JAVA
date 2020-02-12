package com.crm.bo;

//L'application gèrera les caractériques suivantes :
//- marque
//- couleur
//- nombre de portes
//- boîte manuelle ou auto
//- prix
//L'utilisera pourra afficher ces propriétés
//Le possesseur de la voiture pourra également :
//- démarrer sa voiture
//- accéder à la vitesse courante
//- accélérer (d'une vitesse donnée)
//- ralentir (d'une vitesse donnée)
//- s'arrêter
//- klaxonner(afficher "tututut")
//Exigences fonctionnelles :
//La voiture ne doit pas dépasser la vitesse autorisée en fonction du type de route
//50 km/h en ville
//80 km/h sur route
//130 km/h sur autoroute

public class Voiture {

	private String marque;
	private String couleur;
	private int porte;
	private String manuelle;
	private String auto;
	private float prix;

	public Voiture() {

		marque = "";
		couleur = "";
		porte = 0;
		manuelle = "";
		auto = "";
		prix = 0;

	}

	public Voiture(String marque, String couleur, int porte, String auto, String manuelle, int prix) {

		this.marque = marque;
		this.couleur = couleur;
		this.porte = porte;
		this.manuelle = manuelle;
		this.auto = auto;
		this.prix = prix;

	}

	public void demarrer() {

		System.out.println("démarrage");

	}

	public void arreter() {
		System.out.println("stop");

	}

	public String getmarque() {
		return marque;
	}

	public void setmarque(String m) {
		marque = m;

	}

	public String getcouleur() {
		return couleur;
	}

	public void setcouleur(String c) {
		couleur = c;

	}

	public int getprix() {
		return (int) prix;
	}

	public void setprix(String prix) {
		prix = "";
	}

	public String getmanuelle() {
		return manuelle;
	}

	public void setmanuelle(String ma) {
		manuelle = ma;
	}

	public String getauto() {
		return auto;
	}

	public void setauto(String a) {
		auto = a;
	}

	public int getporte() {
		return porte;

	}

	public void setporte(String porte) {
		porte = "";
	}

	public void affiche() {
		System.out.println("Marque : " + marque);
		System.out.println("couleur" + couleur);
		System.out.println("Nombre de porte" + porte);
		System.out.println("Manuelle" + manuelle);
		System.out.println("Auto" + auto);
		System.out.println("prix" + prix);

		{

		}
	}
}
