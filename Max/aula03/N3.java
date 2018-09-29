package aula03;

import javax.swing.JOptionPane;

public class N3 {

	public static void main(String[] args) {

		int i, n = 10;
		String entrada;
		double vetor[] = new double[n];

		for (i = 0; i < n; i++) {

			entrada = JOptionPane.showInputDialog("Insira o " + (i + 1) + "º número");
			vetor[i] = (Double.parseDouble(entrada)/2);
		}
		for (i = 0; i < n; i++)
			System.out.println(vetor[i]);
	}
}