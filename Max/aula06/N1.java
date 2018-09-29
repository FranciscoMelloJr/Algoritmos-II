package aula06;

import javax.swing.JOptionPane;

public class N1 {

	public static void main(String[] args) {

		int somador1 = 0, somador2 = 0, i, j, linha = 4, coluna = 4, matriz[][] = new int[linha][coluna];

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++)
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Número na linha "+i+" coluna "+j));
		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++) {
				if (i == j)
					somador1 += matriz[i][j];
				if (j == linha - 1 - i)
					somador2 += matriz[i][j];
			}
		System.out.println("Soma da diagonal principal: " + somador1);
		System.out.println("Soma da diagonal secundaria: " + somador2);
	}
}