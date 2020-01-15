/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Billettrain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quel est votre Age :");
		age = sc.nextInt();
		
		if (age >= 50) {
			System.out.println("Vous avez droit a une réduction de 30 %");
		} else if (age <= 15) {
			System.out.println("Vous avez droit a une réduction de 50 % ");
		} else if (age <= 40) {
			System.out.println("Vous avez droit a aucune réduction");
		}
		sc.close();
	}

}
