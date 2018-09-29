package funcoesProcedimentosI;

import javax.swing.JOptionPane;

public class N3 {

	static int divisor = 0, linha = 2, coluna = 2;
	static double somadorp = 0, somador = 0, matriz[][] = new double[linha][coluna];
	static int i, j, k;

	public static void main(String[] args) {

		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Linha " + (i) + " Coluna " + (j)));
				somador += matriz[i][j];
				mostraMatriz();
				if (i == j)
					somadorp += matriz[i][j];
			}
			System.out.println();
		}
		divisor = linha * coluna;
		Media();
		mediaPrincipal();
	}

	static void mostraMatriz() {
		System.out.print(matriz[i][j] + "\t");
		if ((i == linha - 1) & (j == coluna - 1))
			mostraLinha();
	}

	static void mostraLinha() {
		k = Integer.parseInt(JOptionPane.showInputDialog("Linha :"));
		System.out.println();
		for (int j = 0; j < coluna; j++)
			System.out.print(matriz[k][j] + "\t");
	}

	static void Media() {

		System.out.println("Média aritmética: " + somador / divisor);

	}

	static void mediaPrincipal() {

		System.out.println("Média aritmética da diagonal principal: " + somadorp / linha);

	}
}