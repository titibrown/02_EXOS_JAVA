package com.crm.boapp;

import java.util.Vector;

import com.crm.bo.Personne;

public class Vectorapp {

	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {

		Vector groupe = new Vector();
		Personne michael = new Personne("Michael", "Jordan");
		Personne Lebron = new Personne("lebron", "James");

		groupe.addElement(michael);
		groupe.addElement(Lebron);

		Personne unBasketteur1 = (Personne) groupe.get(0);
		System.out.println(unBasketteur1.getNom());

		System.out.println("Mon équipe a :" + groupe.size() + "joueurs");

		Personne kobe = new Personne("Kobe", "Bryant");
		groupe.addElement(kobe);

		System.out.println("Mon équipe a : " + groupe.size() + "joueurs");

		System.out.println("le joueur lebron James est à la " + (groupe.indexOf(Lebron) + 1) + " position");

		Lebron.surnom = "King James";

		Personne lebronModif = (Personne)groupe.get(1);
		System.out.println("Le surnom de Lebron James est " + lebronModif.surnom);

	}
}
