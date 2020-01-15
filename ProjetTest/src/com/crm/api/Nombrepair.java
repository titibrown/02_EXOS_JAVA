/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Nombrepair {

	/**
	 * @param args
	 */

	// entrer un nombre:2
	// ce nombre est pair:
	// entrer un nombre 3
	// se nombr eest impair

	public static void main(String[] args) {

		Scanner sc;
		int number;
		sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		number = sc.nextInt();
		fcIsEven(number);
		sc.close();
	}

	public static void fcIsEven(int a) {
		if (a % 2 == 0)
			System.out.println(a + " is even");
		else
			System.out.println(a + " is odd");
	}
}