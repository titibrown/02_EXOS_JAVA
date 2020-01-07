/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class OperateurTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int maVariableInt1;
		maVariableInt1 = 36;
		System.out.println(maVariableInt1);
		// Opérateur d'assignement d affectation
		int maVariableInt2;
		maVariableInt2 = maVariableInt1;
		System.out.println(maVariableInt2);
		
		int maVariableInt3;
		maVariableInt3 = maVariableInt2 = maVariableInt1 = 58;
		System.out.println(maVariableInt1);
		System.out.println(maVariableInt2);
		System.out.println(maVariableInt3);
		
		
		int somme1;
		somme1 = 5 + 6;
		System.out.println(somme1);
		
		int addition;
		addition = somme1 + 7;
		System.out.println(addition);
		
		int soustraction;
		soustraction = 8 - 4;
		System.out.println(soustraction);
		
		int multi;
		multi = 8 * 4;
		System.out.println(multi);
		
		int division;
		division = 80 / 4;
		System.out.println(division);
				
				
		int quotient1;
		quotient1 = 5 / 2;
		System.out.println(quotient1);
		
		float quotient2 = 5f / 2;
		System.out.println(quotient2);
		
		int modulo;
		modulo = 5 % 2;
		System.out.println(modulo);
		
		
		
		
		
		
	}

}
