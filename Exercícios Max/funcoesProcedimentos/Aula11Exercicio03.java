// Escreva uma fun��o que receba um valor inteiro e retorna o seu fatorial.

package funcoesProcedimentos;

import javax.swing.JOptionPane;
public class Aula11Exercicio03 {
	
	//Fun��o para calcular o fatorial de um n�mero (n)
	public static int fatorial(int n){
		int fat=1;

		for (int i=1; i<=n; i++) //la�o para calculo do fatorial
			fat = fat * i;

		return fat; //retorna o fatorial (fat)

	}

	public static void main(String[] args) {

		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero"));
		
		//Chama a fun��o e retorna o valor do fatorial da vari�vel "numero"
		System.out.println("O fatorial de "+numero+" � "+fatorial(numero));
		
	}

}
