package aula02;

import javax.swing.JOptionPane;

public class N1 {

	public static void main(String[] args) {
		int i, n = 2, vetor1[] = new int[n];
		String num;
		for (i = 0; i < n; i++) {
			num = JOptionPane.showInputDialog("Número: ");
			vetor1[i] = Integer.parseInt(num);
		}
		int vetor2[] = new int[n];
		for (i = 0; i < n; i++) {
			vetor2[i] = vetor1[i] * 3;
			System.out.println(vetor2[i]);

		}
	}

}