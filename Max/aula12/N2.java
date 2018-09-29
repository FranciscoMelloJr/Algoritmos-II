package aula12;

import javax.swing.JOptionPane;

public class N2 {

	static int parImpar (int n) {
		
		if (n%2==0)
			return 1;
		else 
			return 0;
	}
	
	public static void main(String[] args) {

		int numero, somaI=0, somaP=0;
		
		for (int i=0; i<10; i++) {
		numero=Integer.parseInt(JOptionPane.showInputDialog("Número "+i));
		if (parImpar(numero)==1)
			somaP+=numero;
		else 
			somaI+=numero;	
		}
		System.out.println("Total de pares = "+somaP);
		System.out.println("Total de Impares = "+somaI);
	}
}