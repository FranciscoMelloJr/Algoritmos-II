package funcoesProcedimentosIII;

import javax.swing.JOptionPane;

public class N3 {

	static int i, n = 10;
	static double vetor[] = new double[n];

	static double leDados() {

		vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Número"));

		return vetor[i];

	}

	static double somaVetor(double v[]) {
		int i, soma = 0;
		for (i = 0; i < v.length; i++)
			soma += v[i];
		return soma;

	}

	public static void main(String[] args) {

		for (i = 0; i < n; i++)
			leDados();
		System.out.println(somaVetor(vetor));
	}
}
