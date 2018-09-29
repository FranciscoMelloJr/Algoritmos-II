package Aula05;

import javax.swing.JOptionPane;

public class N3 {

	public static void main(String[] args) {

		int i, j, linha = 3, coluna = 2, matriz1[][] = new int[linha][coluna], matriz2[][] = new int[linha][coluna],
				soma[][] = new int[linha][coluna];

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++) {
				matriz1[i][j] = Integer
						.parseInt(JOptionPane.showInputDialog("Primeira matriz linha " + i + " coluna " + j + " :"));
				matriz2[i][j] = Integer
						.parseInt(JOptionPane.showInputDialog("Segunda matriz linha " + i + " coluna " + j + " :"));
			}
		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++)
				soma[i][j] = matriz1[i][j] + matriz2[i][j];
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++)
				System.out.print(soma[i][j]+" ");
			System.out.println("");
		}
	}
}