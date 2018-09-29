package funcoesProcedimentosII;

import javax.swing.JOptionPane;

public class N1 {

	static int k, x, i, j, linha = 2, coluna = 2;
	static double matriz[][] = new double[linha][coluna];

	public static void main(String[] args) {

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++)
				matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Linha " + i + " Coluna " + j));
		mostraValores();
		somaLinha();
	}

	static void somaLinha() {
		do {
			x = Integer.parseInt(JOptionPane.showInputDialog("Número da linha para soma: "));
			if ((x < linha) & (x >= 0)) {
				System.out.println("Mostra soma da linha " + x);
				double s = 0;
				for (j = 0; j < coluna; j++)
					s += matriz[x][j];
				System.out.println(s);
			}
		} while ((x < linha) & (x >= 0));
		System.out.println("Fim de programa.");
	}

	static void mostraValores() {
		System.out.println("Mostra Valores");
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++)
				System.out.print(matriz[i][j] + "\t");
			System.out.println();
		}
		mostraLinha();
	}

	static void mostraLinha() {
		System.out.println("Mostra linha");
		k = Integer.parseInt(JOptionPane.showInputDialog("Número da linha: "));
		for (j = 0; j < coluna; j++)
			System.out.print(matriz[k][j] + "\t");
		System.out.println();
	}
}