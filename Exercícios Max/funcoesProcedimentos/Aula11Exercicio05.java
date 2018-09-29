/* Escreva uma fun��o que receba dois valores inteiros e 
 * retorne a soma dos n�meros entre eles. 
 * Por exemplo, para 2 e 5 a sa�da dever ser a soma de 2+3+4+5, ou seja, 14
 */

package funcoesProcedimentos;

import javax.swing.JOptionPane;
public class Aula11Exercicio05 {
	
	// Fun��o para somar os n�meros no intervalo entre n1 e n2
	public static int soma(int n1, int n2) {
		int s=0;
		
		for(int i=n1; i<=n2; i++) //la�o para soma dos n�meros
			s = s + i;
		
		return s; //retorna o valor de s (soma)
	}

	public static void main(String[] args) {
		int numero1, numero2;

		numero1=Integer.parseInt(JOptionPane.showInputDialog("Primeiro n�mero"));
		numero2=Integer.parseInt(JOptionPane.showInputDialog("Segundo n�mero"));

		//Chama a fun��o e retorna o valor da soma
		System.out.println("A soma dos n�meros no intervalo ["+numero1+","
				+ numero2+"] � "+soma(numero1, numero2)); 
	}

}
