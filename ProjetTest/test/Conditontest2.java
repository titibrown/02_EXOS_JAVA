/**
 * 
 */

/**
 * @author CRM
 *
 */
public class Conditontest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nb = 3;
		String chaine = "ok";
		
		
		if (nb > 10 && chaine.equals("ok")) {
			System.out.println("condition remplie");
		} else if (nb > 10 || chaine.equals("ok")) {
			System.out.println("Une des deux condition remplie");
		} else {
			System.out.println("Condition non remplie");
		}
	}
}