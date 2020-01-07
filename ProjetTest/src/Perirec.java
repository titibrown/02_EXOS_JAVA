import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class Perirec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Caclculer le périmètre d'un rectangle");
		Scanner sc = new Scanner(System.in);	
		double longueur;
		double largeur;
		double perimètre;
		System.out.println("Veuillez taper la longueur du rectangle");
		longueur = sc.nextDouble();
		System.out.println("Veuillez taper la largeur du rectangle");
		largeur = sc.nextDouble();
		perimètre = 2 * longueur + 2 * largeur;
		String perimeter;
		System.out.println("Le périmètre est de : "+perimètre);
		sc.close();
	}

}
