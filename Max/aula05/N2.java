package aula05;

public class N2 {

	public static void main(String[] args) {

		int linha = 4, coluna = 4, i, j, matriz[][] = new int[linha][coluna];

		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++)
				if (i == j)
					matriz[i][j] = 1;
				else
					matriz[i][j] = 0;

		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++)
				System.out.print(matriz[i][j]);
			System.out.println("");
		}
	}
}