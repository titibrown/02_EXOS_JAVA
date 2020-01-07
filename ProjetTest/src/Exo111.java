/**
 * 
 */
import java.util.Scanner;
/**
 * @author CRM
 *
 */
public class Exo111 
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
		
		System.out.println("Veuillez saisir un nombre");		
		nombre = sc.nextInt();
		
		System.out.println("Veuillez saisir un autre nombre");		
		nombre2 = sc.nextInt();
	
		moyenne = ((float)nombre + (float)nombre2) / 2;
		System.out.println("La moyenne est de "+moyenne);
	}

}
