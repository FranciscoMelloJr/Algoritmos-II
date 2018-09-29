package aula07;

import javax.swing.JOptionPane;

public class N4 {

	public static void main(String[] args) {

		int somador = 0, k, i, j, A[][] = new int[3][2], B[][] = new int[2][2], C[][] = new int[3][2];

		for (i = 0; i < 3; i++)
			for (j = 0; j < 2; j++)
				A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Número na linha " + i + " coluna " + j));
		for (i = 0; i < 2; i++)
			for (j = 0; j < 2; j++)
				B[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Número na linha " + i + " coluna " + j));

		for (i = 0; i < 3; i++)
			for (j = 0; j < 2; j++) {
				somador = 0;
				for (k = 0; k < 2; k++)
					somador += A[i][k] * B[k][j];
				C[i][j] = somador;
			}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 2; j++)
				System.out.print(C[i][j] + " ");
			System.out.println("");
		}
	}
}