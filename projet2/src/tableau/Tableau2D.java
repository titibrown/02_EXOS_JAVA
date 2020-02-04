/**
 * 
 */
package tableau;

/**
 * @author CRM
 *
 */
public class Tableau2D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// déclaration d'un tableau 2D
		int[][] tab2D = new int[2][3];
		// Déclaration avec initialisation
		int[][] tab2Dim = { { 0, 3, 5 }, { 0, 2, 4 } };
		// Accès aux éléments
		System.out.println("élément [0][0] : " + tab2Dim[0][0]);
		System.out.println("élément [1][2] : " + tab2Dim[1][2]);

		// modification d'un élèments
//
//		tab2Dim[1][2] = 6;
//		System.out.println("élément [1][2] après modif :" + tab2Dim[1][2]);
//
//		// taille du tableau
//		System.out.println("Tialle du tableau tab2Dim :" + tab2Dim.length);
//
//		// nombre de collones
//		System.out.println("Nombre de collones :" + tab2Dim[0].length);
//
//		// Parcours du tableau
//		System.out.println("Parcours du tableau :");
//		for (int i = 0; i < tab2Dim.length; i++) {
//			for (int j = 0; j < tab2Dim[i].length; j++) {
//				System.out.println("élément[" + i + "][" + j + "] : " + tab2Dim[i][j]);

				int[][] tab2Dvar1 = new int[3][];
				tab2Dvar1[0] = new int[1];
				tab2Dvar1[1] = new int[2];
				tab2Dvar1[2] = new int[1];
				tab2Dvar1[0][0] = 1;
				tab2Dvar1[1][0] = 1;
				tab2Dvar1[1][1] = 1;
				tab2Dvar1[2][0] = 1;
//					parcour du tableau
				for (int i = 0; i < tab2Dvar1.length; i++) {
					for (int j = 0; j < tab2Dvar1[i].length; j++) {
						System.out.print(tab2Dvar1[i][j]);
					}
					System.out.println();
				}
				System.out.println("\n\n");
				int[][] tab2var2 = { { 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1 }, { 1, 1, 1, 1, 1, 1, 1 } };
				
				for (int i = 0; i < tab2var2.length; i++) {
					for (int j = 0; j < tab2var2[i].length; j++) {
						System.out.print(tab2var2[i][j]);
					}
					System.out.println();

			}

}

	{

}
}


