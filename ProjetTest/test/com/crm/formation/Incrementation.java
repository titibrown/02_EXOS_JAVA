/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class Incrementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	//incrémentation (ajouter +) et décrémentation (enlever -)
		
		int nb = 2;
		nb= nb +1;
		System.out.println(nb);
			
		
		
		int nb1 = 2;
		int nb2 = nb1++;
		System.out.println(nb1);
		System.out.println(nb2);
		
		int nb0 = 2;
		int nb01 = ++nb1;
		System.out.println(nb0);
		System.out.println(nb01);
	}

}
