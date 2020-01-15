/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Switchtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
				
		int chiffre;
		Scanner sc = new Scanner(System.in);
		System.out.println("make your selection");
		chiffre = sc.nextInt();
	
		switch (chiffre) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
				
		System.out.println("You have chosen " + chiffre  );
		break;
		
		default:
		System.out.println("None of you choice is available");
		
		
	}

}
	
}
