package funcoesProcedimentosI;

import javax.swing.JOptionPane;

public class N1 {

	public static void main(String[] args) {
		
		double n1, n2;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número 1"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número 2 "));

		mostraNumeros(n1, n2);
	}
	static void mostraNumeros(double n1, double n2) {

		System.out.println("Numero 1: " + n1 + " Numero 2: " + n2);
	}
}