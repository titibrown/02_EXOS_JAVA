/**
 * 
 */
package methode;

/**
 * @author CRM
 *
 */
public class Méthodefonction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int nb1 = 2;
		int nb2 = 3;
		int s = somme(nb1, nb2);
		System.out.println(s);

	}

	public static int somme(int a, int b) {
		int s = a + b;
		return s;
	}
}