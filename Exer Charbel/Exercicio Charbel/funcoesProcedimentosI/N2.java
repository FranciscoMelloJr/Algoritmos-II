package funcoesProcedimentosI;

import javax.swing.JOptionPane;

public class N2 {

	public static void main(String[] args) {
	
		double n1,n2;
		
		n1 = LeNumero();
		n2 = LeNumero();
		mostraNumeros(n1, n2);
	}
	
	public static double LeNumero() {

		return Double.parseDouble(JOptionPane.showInputDialog("Número: "));

	}
	static void mostraNumeros(double n1, double n2) {

		System.out.println("Numero 1: " + n1 + " Numero 2: " + n2);
	}
}
