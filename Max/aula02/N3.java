package aula02;

import javax.swing.JOptionPane;

public class N3 {

	public static void main(String[] args) {

		int i, n = 2, vetor1[] = new int[n], numero;
		String entrada;
		boolean armazenado = false;
		for (i = 0; i < n; i++) {
			entrada = JOptionPane.showInputDialog("Número: ");
			vetor1[i] = Integer.parseInt(entrada);
		}
		entrada = JOptionPane.showInputDialog("Buscar o número: ");
		numero = Integer.parseInt(entrada);
		for (i = 0; i < n; i++) {
			if (numero == vetor1[i])
				armazenado = true;
		}
		if (armazenado)
			System.out.println("O número está armazenado");
		else
			System.out.println("O número não está armazenado");
	}
}