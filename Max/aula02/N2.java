package aula02;

import javax.swing.JOptionPane;

public class N2 {

	public static void main(String[] args) {

		int i, n = 5;
		String quantidade[] = new String[n], nome[] = new String[n];

		for (i = 0; i < n; i++) {
			nome[i] = JOptionPane.showInputDialog("Produto: ");
			quantidade[i] = JOptionPane.showInputDialog("Quantidade");
		}
		for (i = 0; i < n; i++) {
			System.out.println("Produto: " + nome[i] + " Quantidade: " + quantidade[i]);
		}
	}
}