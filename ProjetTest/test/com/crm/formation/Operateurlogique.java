/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class Operateurlogique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 =bool1 && bool2;
		System.out.println(bool3);
			
		boolean bool4 = true;
		boolean bool5 = true;
		boolean bool6 = bool4 ^ bool5;
		System.out.println(bool6);
		
		boolean bool7 = true;
		boolean bool8 = true;
		boolean bool9 = bool7 || bool8;
		System.out.println(!bool9);
		
		boolean bool10 = 1>2;
		boolean bool11 = 5==6;
		boolean bool12 = bool10 || bool11;
		System.out.println(bool12);
		System.out.println(!bool10);
		 
		short nb1, nb2, nb3, nb4;
		nb1 = 1;
		nb2 = 2;
		nb3 = 6;
		nb4 = 7;
		boolean bool22 = nb1>nb2;
		boolean bool23 = (nb3==nb4);
		boolean bool24 = bool22 || bool23;
		System.out.println(bool24);
		System.out.println(!bool22);
		
		
		
		
		
		
		
		
	}

}
