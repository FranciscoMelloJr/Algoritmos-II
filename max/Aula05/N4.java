package Aula05;

import javax.swing.JOptionPane;

public class N4 {

	public static void main(String[] args) {

		int i, j, linha = 3, coluna = 3, matriz[][] = new int[linha][coluna];

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++)
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Número: "));

		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++)
				if (i > j)
					System.out.print(matriz[i][j]+" ");
			System.out.println("");
		}
	}
}