package aula15;

import javax.swing.JOptionPane;

public class N1 {

	static int somatorio (int n) {

		if (n>1)
			n+=somatorio(n-1);
		return n;	
		
	}
	
	public static void main(String[] args) {

		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
		System.out.println(somatorio(numero));
	}
}