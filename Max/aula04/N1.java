package aula04;

import javax.swing.JOptionPane;

public class N1 {

	public static void main(String[] args) {

		int i, n = 3;
		double somador = 0, media, maior = 0, menor = 999999999, vetor[] = new double[n];
		String entrada;

		for (i = 0; i < n; i++) {
			entrada = JOptionPane.showInputDialog("insira o " + (i + 1) + "� n�mero: ");
			vetor[i] = Double.parseDouble(entrada);
			somador += vetor[i];
			if (vetor[i] < menor)
				menor = vetor[i];
			if (vetor[i] > maior)
				maior = vetor[i];
		}
		System.out.println("Menor n�mero: " + menor);
		System.out.println("Maior n�mero: " + maior);
		media = somador / n;
		System.out.println("M�dia: " + media);
		System.out.print("N�meros menores que a m�dia: ");
		for (i = 0; i < n; i++) {
			if (vetor[i] < media)
				System.out.print(vetor[i]+", ");
		}
	}
}