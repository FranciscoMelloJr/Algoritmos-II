package Aula03;

import javax.swing.JOptionPane;

public class N5 {

	public static void main(String[] args) {

		int i, n = 5;
		double nota1, nota2, media[] = new double[n];
		String nomes[] = new String[n], entrada;

		for (i = 0; i < n; i++) {
			nomes[i] = JOptionPane.showInputDialog("Nome do aluno: ");
			entrada = JOptionPane.showInputDialog("Insira a primeira nota do aluno " + (i + 1) + ": ");
			nota1 = Double.parseDouble(entrada);
			entrada = JOptionPane.showInputDialog("Insira a segunda nota do aluno " + (i + 1) + ": ");
			nota2 = Double.parseDouble(entrada);
			media[i] = ((nota1 + nota2) / 2);
		}
		for (i = 0; i < n; i++)
			System.out.println("Nome:" + nomes[i] + ". Média: " + media[i]);
	}
}