/* Escreva uma função que receba dois valores inteiros e 
 * retorne a soma dos números entre eles. 
 * Por exemplo, para 2 e 5 a saída dever ser a soma de 2+3+4+5, ou seja, 14
 */

package funcoesProcedimentos;

import javax.swing.JOptionPane;
public class Aula11Exercicio05 {
	
	// Função para somar os números no intervalo entre n1 e n2
	public static int soma(int n1, int n2) {
		int s=0;
		
		for(int i=n1; i<=n2; i++) //laço para soma dos números
			s = s + i;
		
		return s; //retorna o valor de s (soma)
	}

	public static void main(String[] args) {
		int numero1, numero2;

		numero1=Integer.parseInt(JOptionPane.showInputDialog("Primeiro número"));
		numero2=Integer.parseInt(JOptionPane.showInputDialog("Segundo número"));

		//Chama a função e retorna o valor da soma
		System.out.println("A soma dos números no intervalo ["+numero1+","
				+ numero2+"] é "+soma(numero1, numero2)); 
	}

}
