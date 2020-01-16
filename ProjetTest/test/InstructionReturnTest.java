/**
 * 
 */

/**
 * @author CRM
 *
 */
public class InstructionReturnTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nombre = 3;
		System.out.println("Methode 1\n####################");
		afficherListeNombre1(nombre);
		System.out.println("\nMethode 2\n####################");
		afficherListeNombre2(nombre);
		System.out.println("\nMethode 3\n####################");
		afficherListeNombre3(nombre);

	}

	public static void afficherListeNombre1(int nb) {
		System.out.println("Début méthode afficherListeNombre");
		for (int i = 0; i <= nb; i++) {
			if (i == 1) {
				System.out.println("Valeur de i avant break = " + i);
				break;
			}
			System.out.println(i);
		}
		System.out.println(" fin méthode afficherListeNombre");
	}
	
	public static void afficherListeNombre2(int nb) {
		System.out.println("Début méthode afficherListeNombre");
		for (int i = 0; i <= nb; i++) {
			if (i == 1) {
				System.out.println("Valeur de i avant continue = " + i);
				continue;
			}
			System.out.println(i);
		}
		System.out.println(" fin méthode afficherListeNombre");
	}
	
	public static void afficherListeNombre3(int nb) {
		System.out.println("Début méthode afficherListeNombre");
		for (int i = 0; i <= nb; i++) {
			if (i == 1) {
				System.out.println("Valeur de i avant return = " + i);
				return;
			}
			System.out.println(i);
		}
		System.out.println(" fin méthode afficherListeNombre");
	}

}
