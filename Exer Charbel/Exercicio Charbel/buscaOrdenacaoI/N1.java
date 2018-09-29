package buscaOrdenacaoI;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class N1 {

	static int buscaBinariaRecursiva(int[] vetor, int valor) {
		
		return buscaRecursiva(vetor, valor, 0, vetor.length - 1);

	}

	static int buscaRecursiva(int[] vetor, int valor, int menor, int maior) {

		int media = (maior + menor) / 2;
		if (menor > maior)
			return -1;
		if (vetor[media] == valor)
			return media;
		if (vetor[media] < valor)
			return buscaRecursiva(vetor, valor, media + 1, maior);
		else
			return buscaRecursiva(vetor, valor, menor, media - 1);

	}

	public static void main(String[] args) {

		int vetor[] = { 9, 3, 5, 7, 1 };
		Arrays.sort(vetor);
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor:"));
		int resultado = buscaBinariaRecursiva(vetor, valor);
		if (resultado <0)
			System.err.println("Elemento não encontrado!");
		else System.out.println("Elemento no indice: " + resultado);

	}

}
