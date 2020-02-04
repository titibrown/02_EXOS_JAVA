package mathint;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class Périmetrerectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int largeur = 0;
		int longueur = 0;
		 
		try
		{
		
		Scanner entree = new Scanner(System.in);
		 
		System.out.println("Veuillez taper la longueur du rectangle");
		longueur = Integer.parseInt(entree.nextLine());
		 		
		System.out.println("Veuillez taper la largeur du rectangle");
		largeur = Integer.parseInt(entree.nextLine());
		 		 
		}
		
		catch(NumberFormatException ne)
		{
		System.out.println("Valeur incorrecte" + ne);
		System.exit(0); 
		}
		 
		 
		int perimetre = 2 * (longueur + largeur);
		 
		System.out.println(" Le périmètre du rectangle est " + perimetre);
		}
		 
			 
	
		
		
	}


