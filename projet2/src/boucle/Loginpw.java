package boucle;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class Loginpw {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		   final String USERNAME = "CRM";
		   final  String PASSWORD = "123";
		    
		    

		    Scanner input1 = new Scanner(System.in);
		    System.out.println("Enter Username : ");
		    String username = input1.next();

		    System.out.println("Enter Password : ");
		    String password = input1.next();

		    if (username.equals(USERNAME) && password.equals(PASSWORD)) {

		     System.out.println("Access Granted! Welcome!");
		    }

		    else if (!username.equals(USERNAME)) {
		        System.out.println("Invalid Username!");
		    } 
		    		    
		    else if (!password.equals(PASSWORD)) {
		        System.out.println("Invalid Password!");
		    } else {
		        System.out.println("Invalid Username & Password!");
		    }

		}

		}
