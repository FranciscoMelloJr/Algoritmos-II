package Aula06;

import javax.swing.JOptionPane;

public class N7 {

	public static void main(String[] args) {

		int i, j, linha = 4, coluna = 4;
		double somador = 0, contador = 0, matriz[][] = new double[linha][coluna];

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("N�mero na linha " + i + " coluna " + j));
				if (j > i) {
					somador += matriz[i][j];
					contador++;
				}
			}
		System.out.println("M�dia: " + somador / contador);
	}

}
