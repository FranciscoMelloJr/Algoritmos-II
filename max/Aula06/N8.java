package Aula06;

import javax.swing.JOptionPane;

public class N8 {

	public static void main(String[] args) {

		int menor, maior = 0, ind=0, i, j, linha = 4, coluna = 3, matriz[][] = new int[linha][coluna];

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Número na linha " + i + " coluna " + j));
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					ind = i;
				}
			}
		i=ind;
		menor = matriz[ind][0];
		for (j = 0; j < coluna; j++) {
			System.out.print(matriz[ind][j]+" ");
			if (matriz[i][j]<menor)
				menor=matriz[i][j];
		}
		System.out.print("\nO elemento minimax da matriz é "+menor);
	}
}