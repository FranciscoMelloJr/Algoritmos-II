package aula06;

import javax.swing.JOptionPane;

public class N3 {

	public static void main(String[] args) {

		int aux = 0, entrada, linha = 3, coluna = 3, i, j, matriz[][] = new int[linha][coluna],
				vetor[] = new int[linha * coluna];

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++)
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Número linha " + i + " coluna " + j));
		entrada = Integer.parseInt(JOptionPane.showInputDialog("Número :"));

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++) {
				vetor[aux] = matriz[i][j] * entrada;
				aux++;
			}
		for (i = 0; i < aux; i++)
			System.out.print(vetor[i] + " ");
	}
}