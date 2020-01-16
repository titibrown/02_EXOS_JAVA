/**
 * 
 */

/**
 * @author CRM
 *
 */
public class BoucleFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// for (int i = 0; i < 10; i++) {
		// System.out.println(i);
		// }

		// for (int x = -5; x<=5; x++) {
		// if (x == 0) {
		// System.out.println("Division par 0");
		// break;
		// }

		// int x = -3;
		// for (; x <= 5; x++) {
		// if (x == 0) {
		// System.out.println("Division par 0");
		// continue;
	

	// System.out.println(1.0 / x);

	
	for(int x = -5 ;x<=5;x++)
	{
		if (x == 0) {
			System.out.println("Division par 0");
			return;

		}

		System.out.println(1.0 / x);
	}

}

}
