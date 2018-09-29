package Aula05;

import javax.swing.JOptionPane;

public class N1 {

	public static void main(String[] args) {

		int maior, menor, i, j, linha = 3, coluna = 2, matriz[][] = new int[linha][coluna];

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++)
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
		
		maior = matriz[0][0];
		menor = matriz[0][0];

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++) {
				if (matriz[i][j] > maior)
					maior = matriz[i][j];
				if (matriz[i][j] < menor)
					menor = matriz[i][j];
			}
		System.out.println("O maior valor é: "+maior+". O menor valor é: "+menor);
	}
}