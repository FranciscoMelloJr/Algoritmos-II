package aula02;

import javax.swing.JOptionPane;

public class N3 {

	public static void main(String[] args) {

		int i, n = 2, vetor1[] = new int[n], numero;
		String entrada;
		boolean armazenado = false;
		for (i = 0; i < n; i++) {
			entrada = JOptionPane.showInputDialog("N�mero: ");
			vetor1[i] = Integer.parseInt(entrada);
		}
		entrada = JOptionPane.showInputDialog("Buscar o n�mero: ");
		numero = Integer.parseInt(entrada);
		for (i = 0; i < n; i++) {
			if (numero == vetor1[i])
				armazenado = true;
		}
		if (armazenado)
			System.out.println("O n�mero est� armazenado");
		else
			System.out.println("O n�mero n�o est� armazenado");
	}
}