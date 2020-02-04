/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Exosomme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Exercice : écrire une méthode qui calcule la somme des éléments passés en paramètres et l'utiliser dans un main comme suit :
//		Entrer le nombre d'éléments du tableau :
//		3
//		Entrer un élément :
//		1
//		Entrer un élément :
//		2
//		Entrer un élément :
//		3
//		La somme des éléments du tableau est : 6
		
//		int tabInt1[]= {1,2,3,4,5,};
//		int tabInt2[]= {6,7,8,9,10,};	
//	
////		int somme = tabSomme(tabInt1);
////		int somme2 = tabSomme(tabInt2);
////		
////		System.out.println("la somme total est " + (somme + somme2));
//		
//		System.out.println("la somme total est " + (tabSomme(tabInt1) + tabSomme(tabInt2)));
//		
//		 
		Scanner sc = new Scanner(System.in);
		int tailleTabl, sommeX;
		System.out.println("Veuillez Entrez le nombre d'éléments du tableau");
		tailleTabl = sc.nextInt();
		int[] tabl = new int[tailleTabl];
		for (int i = 0; i < tabl.length; i++) {
			System.out.println("Entrez l'élément n " + (i + 1));
			tabl[i] = sc.nextInt();
			
			
		}
		sommeX = tabSomme(tabl);
		System.out.println("La somme des éléments du tableau est : " + sommeX);
		sc.close();
	}
		
	

	public static int tabSomme(int[] tableau) {
		int somme;
		somme = 0;
		for (int i = 0; i < tableau.length; i++) {
			somme = somme + tableau[i];

		}
		return somme; 
	}
}
