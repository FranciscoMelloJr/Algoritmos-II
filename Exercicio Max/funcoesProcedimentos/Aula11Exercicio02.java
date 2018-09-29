/* Escreva uma função que recebe a média final 
* de um aluno e retorna o seu conceito
*/
package funcoesProcedimentos;

import javax.swing.JOptionPane;
public class Aula11Exercicio02 {
	
	//Função para associar a média (n) a um conceito
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
		media = Double.parseDouble(JOptionPane.showInputDialog("Média"));

		//Chama a função e imprime o conceito da variável "media"
		System.out.println("O conceito é "+conceito(media));

	}

}
