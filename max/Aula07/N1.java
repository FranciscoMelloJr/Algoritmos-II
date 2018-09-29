package Aula07;

import javax.swing.JOptionPane;

public class N1 {

	public static void main(String[] args) {

		int i, j, linha = 5, coluna = 5, matriz[][] = new int[linha][coluna], vetor1[] = new int[linha],
				vetor2[] = new int[linha];

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Número na linha " + i + " coluna" + j));
				if (i == j)
					vetor1[i] = matriz[i][j];
				if (j == linha - 1 - i)
					vetor2[i] = matriz[i][j];
			}
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++)
				System.out.print(matriz[i][j] + " ");
			System.out.println("");
		}
		System.out.println("");
		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++) {
				if (i == j)
					matriz[i][j] = vetor2[i];
				if (j == linha - 1 - i)
					matriz[i][j] = vetor1[i];
			}
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++)
				System.out.print(matriz[i][j] + " ");
			System.out.println("");
		}
	}
}