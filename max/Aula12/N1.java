package Aula12;

import javax.swing.JOptionPane;

public class N1 {

	static int verTriangulo(int a, int b, int c) {

		if ((a < b + c) & (b < a + c) & (c < a + b))
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {

		int l1, l2, l3;

		l1 = Integer.parseInt(JOptionPane.showInputDialog("Lado 1"));
		l2 = Integer.parseInt(JOptionPane.showInputDialog("Lado 1"));
		l3 = Integer.parseInt(JOptionPane.showInputDialog("Lado 1"));

		if (verTriangulo(l1, l2, l3) == 1)
			System.out.println("É Triangulo");
		else
			System.out.println("Não é triangulo");
	}
}