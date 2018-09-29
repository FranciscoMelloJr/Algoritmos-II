package funcoesProcedimentos;

import javax.swing.JOptionPane;

public class Aula12Exercicio01 {

	public static int verTriangulo(int a, int b, int c) {
		if ((a < b+c) && (b < a+c) && (c < b+c))
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args) {

		int l1, l2, l3;
		
		l1=Integer.parseInt(JOptionPane.showInputDialog("Lado 1"));
		l2=Integer.parseInt(JOptionPane.showInputDialog("Lado 1"));
		l3=Integer.parseInt(JOptionPane.showInputDialog("Lado 1"));
		
		if (verTriangulo(l1,l2,l3) == 1)
			System.out.println("É um triângulo");
		else
			System.out.println("Não é um triângulo");

	}

}
