package aurelien;

import java.util.Scanner;

public class Exercice {public static void main(String[] args) {
	// Variables declarations
	Scanner sc;
	String prenom, prenom2, result;
	int age, age2, riche;
	
	// Scanner instantiation
	sc= new Scanner(System.in);
	
	// Variables assignments
	System.out.println("Quel est votre prenom");
	prenom = sc.nextLine();
	System.out.println("Quel est le prenom de votre Chère et Tendre");
	prenom2 = sc.nextLine();
	System.out.println("Quel est votre age ?");
	age = sc.nextInt() ;
	System.out.println("Quel est l'age de " + prenom2 + " ?");
	age2 = sc.nextInt() ;
	System.out.println("Quand serez vous riche?");
	riche = sc.nextInt() ;
	result = "Quand vous deviendrez riches, " 
			+ prenom + " et " + prenom2 + " auront " 
			+ (age + age2 + riche*2) + "ans a tous les 2";
	
	// Printing
	System.out.println(result);
	
	// Scanner closing
	sc.close();
	}

}
