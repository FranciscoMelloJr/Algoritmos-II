// Escreva uma função que receba um valor inteiro e retorna o seu fatorial.

package funcoesProcedimentos;

import javax.swing.JOptionPane;
public class Aula11Exercicio03 {
	
	//Função para calcular o fatorial de um número (n)
	public static int fatorial(int n){
		int fat=1;

		for (int i=1; i<=n; i++) //laço para calculo do fatorial
			fat = fat * i;

		return fat; //retorna o fatorial (fat)

	}

	public static void main(String[] args) {

		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
		
		//Chama a função e retorna o valor do fatorial da variável "numero"
		System.out.println("O fatorial de "+numero+" é "+fatorial(numero));
		
	}

}
