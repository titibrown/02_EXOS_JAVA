package com.crm.boapp;

public class Comptebancaire {
	
	
	private int numCompte;
    private double solde;
    private double decouvert;
    private String prenomTitulaire;
    private String nomTitulaire;
    public double decouvertMax;
    private double retraitSolde;

    public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public double getDecouvert() {
		return decouvert;
	}
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	public String getPrenomTitulaire() {
		return prenomTitulaire;
	}
	public void setPrenomTitulaire(String prenomTitulaire) {
		this.prenomTitulaire = prenomTitulaire;
	}
	public String getNomTitulaire() {
		return nomTitulaire;
	}
	public void setNomTitulaire(String nomTitulaire) {
		this.nomTitulaire = nomTitulaire;
	}
	public double getDecouvertMax() {
		return decouvertMax;
	}
	public void setDecouvertMax(double decouvertMax) {
		this.decouvertMax = decouvertMax;
	}
	
	public double getRetraitSolde() {
		return retraitSolde;
	}
	public void setRetraitSolde(double retraitSolde) {
		this.retraitSolde = retraitSolde;
	}

	public void afficherDetails() {
		System.out.println( prenomTitulaire + nomTitulaire + solde);
			
}
}


