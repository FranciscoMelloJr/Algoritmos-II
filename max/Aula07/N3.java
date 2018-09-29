package Aula07;

import javax.swing.JOptionPane;

public class N3 {

	public static void main(String[] args) {

		int soma = 0, inicio = 0, destino = 0, i, j, linha = 6, coluna = 6, matriz[][] = new int[linha][coluna],
				vetor[] = new int[coluna];
		boolean start = true;
		for (i = 0; i < linha; i++)
			for (j = 0; j < coluna; j++)
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Distancia da cidade " + i + " da cidade " + j));
		
		for (i = 0; i < linha; i++)
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Roteiro de cidade : "));

		for (i = 0; i < linha; i++)
			if (start) {
				inicio = vetor[i];
				start = false;
			} else {
				destino = vetor[i];
				soma += matriz[inicio][destino];
				inicio = destino;
			}
		System.out.println("Distância percorrida: "+soma);
	}
}