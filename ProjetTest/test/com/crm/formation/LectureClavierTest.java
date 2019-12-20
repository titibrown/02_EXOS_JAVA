/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class LectureClavierTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un mot");
		String str;
		str = sc.nextLine();
		System.out.println("Vous avez saisi "+ str);
		System.out.println("\nVoulez vous afficher un message de fin ? (oui/non)");
		str = sc.nextLine();
		System.out.println("Vous avez saisi "+ str);
		if (str == "oui") {
			System.out.println("FIN");
		}
	}
}