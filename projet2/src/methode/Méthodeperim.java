package methode;
import java.util.Scanner;

import utils.Utils;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class Méthodeperim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int longueur, largeur, perimetre;
		longueur = 5;
		largeur = 4;
		perimetre = Utils.perimetre(longueur, largeur);
		System.out.println(perimetre);
		System.out.println("Veuillez taper la largeur du rectangle");
		
	
	}
}