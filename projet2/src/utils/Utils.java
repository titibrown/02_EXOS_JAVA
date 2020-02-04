/**
 * 
 */
package utils;

/**
 * @author CRM
 *
 */
public class Utils {
//	final double MONPI = Math.PI;
	public static final double MONPI = 3.14;
	public static final String COULEUR_BLEU = "bleu";
	public static final int MA_CONSTANTE = 5;
	
	
	
	public static int somme(int a, int b) {
//		final int MA_CONSTANTE = 2;
		int s = a + b + MA_CONSTANTE;
		return s;
	}

	public static int perimetre(int longueur, int largeur) {
//		final int MA_CONSTANTE = 2;
		int p;
		p = (longueur + largeur) * 2 + MA_CONSTANTE;
		return p;
	}

	public static void afficherMessage(String texte) {
		System.out.println(texte);

	}

	public static float surfaceCerlce(int rayon) {
		// declaration d'une constante PI
		final float PI = 3.14f;

		// Calcul de la surface
		float surface = PI * rayon * rayon;

		return surface;

	}
	
	public static double CircleArea(double r) {
        return (Math.PI * Math.pow(r, 2) );
            

	}
		

	public static void afficherMessage1(String texte) {
		System.out.println(texte);
	}

	public static int lireEntier(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static char lireCaractere(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
}