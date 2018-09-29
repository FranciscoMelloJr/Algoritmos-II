/* Escreva uma fun��o que recebe a m�dia final 
* de um aluno e retorna o seu conceito
*/
package funcoesProcedimentos;

import javax.swing.JOptionPane;
public class Aula11Exercicio02 {
	
	//Fun��o para associar a m�dia (n) a um conceito
	public static String conceito(double n) {
		String c;
		
		if (n <= 4.9)
			c = "D";
		else if (n >= 5 && n <= 6.9)
			c = "C";
		else if (n >= 7 && n <= 8.9)
			c = "B";
		else
			c = "A";
		
		return c;  //retorna o conceito
	}
	

	public static void main(String[] args) {

		double media;
		media = Double.parseDouble(JOptionPane.showInputDialog("M�dia"));

		//Chama a fun��o e imprime o conceito da vari�vel "media"
		System.out.println("O conceito � "+conceito(media));

	}

}
