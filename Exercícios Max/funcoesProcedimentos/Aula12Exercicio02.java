package funcoesProcedimentos;

import javax.swing.JOptionPane;

public class Aula12Exercicio02 {

	public static int parImpar(int n) {
		if (n%2 == 0)
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		int numero, somaP=0, somaI=0;
		
		for (int i=0; i<=9; i++) {
			numero=Integer.parseInt(JOptionPane.showInputDialog("N�mero "+i));
			if (parImpar(numero)==1)
				somaP=somaP+numero;
			else
				somaI=somaI+numero;
		}
		System.out.println("Total de pares = "+somaP);
		System.out.println("Total de �mpares = "+somaI);
	}

}
