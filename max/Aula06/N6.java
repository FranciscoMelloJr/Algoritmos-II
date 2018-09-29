package Aula06;

import javax.swing.JOptionPane;

public class N6 {

	public static void main(String[] args) {

		int i, j, linha = 4, coluna = 4, matriz[][] = new int[linha][coluna],
				vetor[] = new int[linha];

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Número na linha " + i + " coluna " + j));
				if (i == j)
					vetor[i] = matriz[i][j];
			}
		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++)
				matriz[i][j] = vetor[i] * matriz[i][j];

		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++)
				System.out.print(matriz[i][j] + " ");
			System.out.println("");
		}
	}
}
