package buscaOrdenacaoI;

import java.util.Random;

public class N3 {

	public static void main(String[] args) {

		Random randon = new Random();
		int[][] array = new int[10][10];

		System.out.println("------Array Desordenado------");
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[j][i] = randon.nextInt(9) + 1;

				System.out.print(array[j][i] + "  ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println(" ");

		int n = 0;
		while (n < array.length) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - 1; j++) {
					if (array[n][j] > array[n][j + 1]) {
						int aux = array[n][j];
						array[n][j] = array[n][j + 1];
						array[n][j + 1] = aux;
					}
				}
			}
			n++;
		}
		System.out.println("---Array Ordenado em ordem crescente---");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println(" ");
		}
	}
}