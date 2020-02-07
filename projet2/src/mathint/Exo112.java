package mathint;
/**
 * 
 */
import java.util.Scanner;
/**
 * @author CRM
 *
 */
public class Exo112 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner	sc = new Scanner(System.in);
		int		nombre;
		int		nombre2;
		float	moyenne;
		String	réponse = null;
		
		System.out.println("Veuillez saisir un nombre");		
		nombre = sc.nextInt();
		
		while (réponse == "oui") 
		{
			System.out.println("Veuillez saisir un autre nombre");		
			nombre2 = sc.nextInt();
	
			moyenne = ((float)nombre + (float)nombre2) / 2;
			System.out.println("La moyenne est de "+moyenne);
		}
		System.out.println("Souhaitez-vous faire un autre calcul ? (Oui/Non)");
		réponse = sc.nextLine();
		
		
	}

}
