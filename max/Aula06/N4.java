package Aula06;

import javax.swing.JOptionPane;

public class N4 {

	public static void main(String[] args) {

		int soma = 0, i, j, linha = 5, coluna = 5, matriz[][] = new int[linha][coluna];

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++)
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Número na linha " + i + " coluna " + j));
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++)
				if (i % 2 == 0)
					soma += matriz[i][j];
			if (soma != 0) {
				System.out.println("Soma da linha " + i + " :" + soma);
				soma = 0;
			}
		}
	}
}