package aula04;

import javax.swing.JOptionPane;

public class N2 {

	public static void main(String[] args) {

		int maior = 0, n = 2, i, quantidade[] = new int[n];
		String mais = "", nomes[] = new String[n];
		double soma = 0, valor[] = new double[n];

		for (i = 0; i < n; i++) {
			nomes[i] = JOptionPane.showInputDialog("Nome do produto: ");
			valor[i] = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto: "));
			quantidade[i] = Integer.parseInt(JOptionPane.showInputDialog("Quantidades vendidas do produto: "));
			soma += quantidade[i] * valor[i];
			if (quantidade[i] > maior)
				maior = quantidade[i];
			mais = nomes[i];
		}
		for (i = 0; i < n; i++) {
			System.out.println("Nome do produto: " + nomes[i]);
			System.out.println("Valor do produto: " + valor[i] + "R$");
			System.out.println("Quantidade vendida: " + quantidade[i]);
			System.out.println("Total: " + quantidade[i] * valor[i] + "R$");
		}
		System.out.println("O produto mais vendido foi: " + mais);
		System.out.println("Faturamento: " + soma + "R$");
	}
}