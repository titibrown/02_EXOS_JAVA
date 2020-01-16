/**
 * 
 */
package projet2;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Testou {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
////		System.out.println("Bonjour Tim a bientot 31 ans");
////	}
	
//	public static void main(String[] args) {
//		String str = "Bonjour Tim a bientot 31 ans";
//		System.out.println(str);
//	}
	
//	public static void main(String[] args) {
//		int age = 31;
//		String str = "Bonjour Tim a bientot " + age + " ans";
//		System.out.println(str);
//	}
	
//	public static void main(String[] args) {
//		int age = 31;
//		String prenom = "Tim";
//		String str = "Bonjour " + prenom + " a bientot " + age + " ans";
//		System.out.println(str);
//	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Quel est le prenom");
//		String prenom = sc.nextLine();
//		int age = 31;
//		String str = "Bonjour " + prenom + " a bientot " + age + " ans";
//		System.out.println(str);
//		sc.close();
//	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Quel est le prenom");
//		String prenom = sc.nextLine();
//		System.out.println("Quel est l'age");
//		int age = sc.nextInt();
//		String str = "Bonjour " + prenom + " a bientot " + age + " ans";
//		System.out.println(str);
//		sc.close();
//	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Quel est le prenom");
//		String prenom = sc.nextLine();
//		System.out.println("Quel est l'age");
//		int age = sc.nextInt() + 10;
//		String str = "Bonjour " + prenom + " dans dix ans aura " + age + " ans";
//		System.out.println(str);
//		sc.close();
//	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Quel est le prenom");
//		String prenom = sc.nextLine();
//		System.out.println("Quel est l'age");
//		int age = sc.nextInt() + 10;
//		String str = "Bonjour " + prenom + " dans dix ans aura " + age + " ans";
//		System.out.println(str);
//		sc.close();
	
			public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Quel est votre prenom");
			String prenom = sc.nextLine();
			System.out.println("Quel est le prenom de votre Chère et Tendre");
			String prenom2 = sc.nextLine();
			System.out.println("Quel est votre age ?");
			int age = sc.nextInt()   ;
			System.out.println("Quel est l'age de " + prenom2 );
			int age2 = sc.nextInt() ;
			System.out.println("Quand serez vous riche?");
			int xannee = sc.nextInt() ;
			int age3 = age + age2 + xannee*2;
			String str = ("Quand vous deviendrez milliardaires " 
					+ prenom +" et " 
					+ prenom2 +  " auront " 
					+ age3 +  " a eux 2. ");
			System.out.println(str);
			sc.close();
	}

}
