package boucle;

import java.util.Scanner;

public class LoginTab {

	public static void main(String[] args) {

//		Entrez votre login
//		root
//		Entrez votre mot de passe
//		toto
//		Echec de l'authentification, veuillez réessayer
//		Entrez votre login
//		root
//		Entrez votre mot de passe
//		K25@ml
//		Connexion réussie

//		Mise en place variable
		String[][] login = { { "root", "sylvain", "gabi", "laurent", "tim" }, { "1234", "56789", "12", "21", "234" } };
		Scanner sc = new Scanner(System.in);
//		Entré login et chek true
		System.out.println("Veuillez saisir votre login:");
		String login1 = sc.nextLine();
		for (int i = 0; i < login[0].length; i++) {
			if (login[0][i].equals(login1)) {
//				Login == true + enregistrement MDP
				String mdp1 = login[1][i];
				System.out.println("Veuillez saisir votre mot de passe:");
				String mdp = sc.nextLine();
				if (mdp.equals(mdp1)) {
					System.out.println("Connexion reussie!");
					return;
				}else {
					System.out.println("Mauvais Mot de Passe!");
				}
			}else if (i == login[0].length-1) {
				System.out.println("Mauvais Login!");
			}
		}
	}
}