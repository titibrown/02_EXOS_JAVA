package tableau;
/**
 * 
 */

/**
 * @author CRM
 *
 */
public class TableauTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialisation
		int [] tabInt;
		tabInt = new int [5];
		
		int [] tabInt1 = new int[5];
		System.out.println(tabInt1[0]);
		
		//Affectation 
		tabInt1[0]=5;
		System.out.println(tabInt1[0]);
		
		System.out.println(tabInt1[1]);
		
		//Initia + affect 
		int tabInt2[]= {1,2,3,4,5,6};
		System.out.println(tabInt2[4]);
		System.out.println(tabInt2[0]);
		
		
		//Afficher taille tableau
		System.out.println("La taille du tableau est :" + tabInt2.length);
				
		
		
		
		//Parcours du tableau
		
	//	System.out.println("Parcours du tableau:");
		for (int i = 0; i <tabInt2.length; i++)

			System.out.println(tabInt2[i]);

	//	System.out.println("Parcours du tableau version 2");
		
		for (int nb : tabInt2) {
			System.out.println(nb);
		}
	}
	
	

}
