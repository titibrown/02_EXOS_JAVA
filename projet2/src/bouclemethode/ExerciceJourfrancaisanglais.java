package bouclemethode;

import java.util.Scanner;

public class ExerciceJourfrancaisanglais {



	public static void main(String[] args) {

//		Quelle est la langue source ?
//		Français
//		Quel jour voulez-vous traduire ?
//		Lundi
//		"Lundi" se dit en anglais "Monday"
//		Quelle est la langue source ?
//		Anglais
//		Quel jour voulez-vous traduire ?
//		Tuesday
//		"Tuesday" se dit en anglais "Mardi"
		
		
		String[][] jour = { { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" },
				{ "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" } };
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez la langue de départ:");
		String langue = sc.nextLine();
		if (langue.equalsIgnoreCase("Français")) {
			System.out.println("Entrez un jour de la semaine en Français:");
			String jour1 = sc.nextLine();
			sc.close();
		 
			for (int i = 0 ; i < jour[0].length; i++) {
				if (jour[0][i].equalsIgnoreCase(jour1)) {
					System.out.println(jour[i + 1][i]);
					break;
				}
				if (i == jour[1].length - 1) {
					System.out.println("Erreur dans votre choix de saisi");
				}
			}
		}
		if (langue.equalsIgnoreCase("Anglais")) {
			System.out.println("Entrez un jour de la semaine en Anglais:");
			String jour1 = sc.nextLine();
			for (int i = 1 ; i < jour[0].length; i++) {
				if (jour[i][i].equalsIgnoreCase(jour1)) {
					System.out.println(jour[i - 1][i]);
					break;
				}
				if (i == jour[1].length - 1) {
					System.out.println("Erreur");
				}
			}
		}
	}
}