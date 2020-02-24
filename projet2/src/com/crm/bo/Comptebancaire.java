package com.crm.bo;

public class Comptebancaire {
	
	
	private int numCompte;
    private float solde;
    private float decouvert;
    private String prenomTitulaire;
    private String nomTitulaire;
    public double decouvertMax;
    private double retraitSolde;

    public Comptebancaire () {
    	
    	numCompte =0;
    	solde = 0;
    	decouvert = 0;
    	prenomTitulaire="";
    	nomTitulaire="";
    	decouvertMax=0;
    	retraitSolde=0;
    	    	
    }
    
    public Comptebancaire (int numCompte,float solde,float decouvert,String prenomTitulaire,String nomTitulaire,double decouvertMax, double retraitSolde) {
    	
    	
    	this.numCompte=numCompte;
    	this.solde=solde;
    	this.decouvert=decouvert;
    	this.prenomTitulaire=prenomTitulaire;
    	this.nomTitulaire=nomTitulaire;
    	this.decouvertMax=decouvertMax;
    	this.retraitSolde=retraitSolde;
    
    	
    public void retrait() {
    	System.out.println("Vous avez effectué un retrait");
    	
    	
    }
    	
    	
    }
        
    
    public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public double getDecouvert() {
		return decouvert;
	}
	public void setDecouvert(float decouvert) {
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


