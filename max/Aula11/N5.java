package Aula11;

import javax.swing.JOptionPane;

public class N5 {

	public static int soma(int n1, int n2) {
		int s = 0;

		for (int i = n1; i <= n2; i++)
			s = s + i;

		return s;
	}

	public static void main(String[] args) {

		int numero1, numero2;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro número"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo número"));

		System.out.println(soma(numero1, numero2));

	}
}