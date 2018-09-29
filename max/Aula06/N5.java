package Aula06;

import javax.swing.JOptionPane;

public class N5 {

	public static void main(String[] args) {

		int somador, i, j, linha = 4, coluna = 3, vetor[] = new int[linha], matriz[][] = new int[linha][coluna];

		for (i = 0; i < linha; i++) {
			somador = 0;
			for (j = 0; j < coluna; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Número na linha " + i + " coluna " + j));
				somador += matriz[i][j];
			}
			vetor[i] = somador;
		}
		for (i = 0; i < linha; i++)
			System.out.println("Soma da linha "+i+" : "+vetor[i]);
	}
}