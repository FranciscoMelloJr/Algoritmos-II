package aula04;

import javax.swing.JOptionPane;

public class N3 {

	public static void main(String[] args) {

		int n = 5, aux = n - 1, i;
		double numerosA[] = new double[n], numerosZ[] = new double[n];

		for (i = 0; i < n; i++) {
			numerosA[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira o número: "));
		}
		for (i = 0; i < n; i++) {
			numerosZ[aux] = numerosA[i];
			aux--;
		}
		for (i = 0; i < n; i++) {
			System.out.println(numerosZ[i]);
		}
	}
}