package aula06;

import javax.swing.JOptionPane;

public class N2 {

	public static void main(String[] args) {

		int i, j, linha = 4, coluna = 4, matriz[][] = new int[linha][coluna];

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++)
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Número na linha " + i + " coluna " + j));

		int menor = matriz[0][0];
		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++)
				if ((i == j) & (matriz[i][j] < menor))
					menor = matriz[i][j];
		System.out.println("Memor valor da diagonal principal: "+menor);
	}
}