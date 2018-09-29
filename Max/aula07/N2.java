package aula07;

import javax.swing.JOptionPane;

public class N2 {

	public static void main(String[] args) {

		int contador = 0, i, j, linha = 8, coluna = 6;
		String matriz[][] = new String[linha][coluna], notas[] = new String[linha - 1];

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++)
				if (j == 0)
					matriz[i][j] = JOptionPane.showInputDialog("Nome do aluno: ");
				else
					matriz[i][j] = JOptionPane.showInputDialog("Questão " + j + " : ");
		for (j = 0; j < coluna - 1; j++)
			notas[j] = JOptionPane.showInputDialog("Gabarito questão " + (j + 1) + " : ");

		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++)
				if (j == 0)
					System.out.println("Nome do aluno : " + matriz[i][j] + " ");
				else if (matriz[i][j].equals(notas[j - 1]))
					contador++;
			System.out.println(contador);
			contador = 0;
		}
	}
}