package aula11;

import javax.swing.JOptionPane;

public class N3 {

	static int fatorial(int num) {

		int r = 1;
		for (int i = 1; i <=num; i++)
			r = r * i;
		return r;
	}

	public static void main(String[] args) {

		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));

		System.out.println(fatorial(numero));

	}
}