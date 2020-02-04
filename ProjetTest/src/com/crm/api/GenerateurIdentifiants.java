package com.crm.api;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class GenerateurIdentifiants {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		// Entrer votre prénom
		//Timothy
		//Entrer votre nom
		//Brown
		//Votre login sera T.BROWN
		//votre mot de passe est : BR@wn4
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillze rentrer votre prenom");
		String prenom = sc.nextLine();
		System.out.println("Veuillez rentrer votre Nom");
		String nom = sc.nextLine();
		sc.close();
		String prenom2 = prenom.substring(0,1).toUpperCase();
		String nom2 = nom.toUpperCase();		
		System.out.println("Votre login sera " + prenom2 + "."+ nom2);
		String mdp = nom.substring(0,2).toUpperCase()+nom.substring(2).replace("a","@").replace("o","0" );
		System.out.println("votre mot de passe sera " + mdp + nom.length());
	
			
	
	}


	
	
	
}
