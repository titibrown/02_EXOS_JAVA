/**
 * 
 */
package methode;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Maxinombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//  Entrez un 1er nombre :
		//	12
		//	Entrez un 2e nombre :
		//	25
		//	Entrez un 3e nombre :
		//	8
		//	Le plus grand nombre est 25
						
		Scanner lectureClavier = new Scanner (System.in);
        
		int number1 =0;
		int number2 =0;
		int number3 =0;
       
        
        System.out.print("Enter a first number: ");
        number1 = lectureClavier.nextInt();
    
        System.out.print("Enter a second number: ");
        number2 = lectureClavier.nextInt();
        
        System.out.print("Enter a third number: ");
        number3 = lectureClavier.nextInt();
        
        if(number1>= number2 && number1>= number3) {
        	System.out.println("The biggest number is " + number1);
         } 
        
        else if (number2>= number1 && number2>= number3) {
        	 System.out.println("The biggest number is " + number2);}
         
        else {
        	 System.out.println("The biggest number is " + number3);}
    	}
//	else if (number3>= number1 && number3>= number2) {
//		System.out.println("The biggest number is " + number3);}
//}
	}
