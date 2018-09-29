package provaPraticaIII;

import javax.swing.JOptionPane;

public class N1 {
	static int r=0;
	public static int somaNumeros(int n1, int n2) {
	
		if (n1 > 0) {
			r+=n2;
			return somaNumeros(n1 - 1, n2);
		}
		return r;
	}

	public static void main(String[] args) {

		int numero1, numero2;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro número"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo número"));

		int resultado = somaNumeros(numero1, numero2);
		System.out.println(resultado);
	}
}