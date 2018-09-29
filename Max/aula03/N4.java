package aula03;

import javax.swing.JOptionPane;

public class N4 {

	public static void main(String[] args) {

		String entrada;
		int i, n = 5;
		double somador = 0, media = 0, vetor[] = new double[n], vetor2[] = new double[n];

		for (i = 0; i < n; i++) {
			entrada = JOptionPane.showInputDialog("Insira a altura do " + (i + 1) + "º atleta");
			vetor[i] = Double.parseDouble(entrada);
			somador += vetor[i];
		}
		media = somador / n;
		for (i = 0; i < n; i++) {
			if (vetor[i] > media) {
				vetor2[i] = vetor[i];
				
			}
		}
		System.out.println("Jogadores com a altura maior que a média: ");
		for (i = 0; i < n; i++) {
			if (vetor2[i] != 0)
			System.out.println(vetor2[i]+"m");
		}
	}
}