package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Rectangle;

public class Rectangleapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		La future application devra répondre aux besoins suivants :
//		- stocker les caractéristiques d'un rectangle et pouvoir les restituer à l'utilisateur
//		- calculer son périmètre
//		- calculer sa surface
//		- faire une comparaison avec un autre rectangle
//		Exercice : repère orthonormé
//		La future application devra répondre aux besoins suivants :
//		- stocker les coordonnées d'un point dans le repère(abcisses, ordonnées) et pouvoir les restituer à l'utilisateur
//		- calculer la distance entre 2 points
//		Rappel : consignes pour réaliser les exercices
//		1/ Créer le diagramme de classe dans EA
//		2/ Créer la classe métier correspondante en java(package com.crm.bo)
//		3/ Créer la classe de test avec des interactions utilisateur(package com.crm.boapp)
//		N.B : ne pas créer de méthodes statiques

	
		
		Scanner sc = new Scanner(System.in);
		Rectangle rect1 = new Rectangle();		
		
		System.out.println("Entrer la longueur");
		rect1.setLongueur((int) sc.nextFloat());
		System.out.println("Entrer la largeur");
		rect1.setLargeur((int) sc.nextFloat());
				

		////////////////////////////////////				
//		Rectangle rec1 = new Rectangle();
		rect1.afficherdetail();
		///////////////////////////////////
		sc.close();


}
}
