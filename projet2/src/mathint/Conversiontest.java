/**
 * 
 */
package mathint;

/**
 * @author CRM
 *
 */
public class Conversiontest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Java va convertir automatiquement une valeur d'un type et un type plus "large"
		//Implicite
		int x =123456;
		long y = x;
		System.out.println(x);
		System.out.println(y);
		
		//Explicite (On force)
		//Conversion Explicite
		//la converstion d'une valeur de type vers un type plus petit peut entrainer une perte de données
		//La converstion doit être forcé pour être effectuée
		
		int v = 65537;
		short z = (short)v;
		System.out.println(v);
		System.out.println(z);
		
		
		long l1 = 123456789;
		long l2 = 123456788;
		float f1 = l1;
		float f2 = l2;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(l1-l2);
		System.out.println(f1-f2);

	

		
		
	}

}
