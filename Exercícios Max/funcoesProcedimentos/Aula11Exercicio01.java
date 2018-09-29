/* Escreva uma função para receber o ano corrente e o ano de nascimento 
 * de uma pessoa e retorne a idade da pessoa.
*/

package funcoesProcedimentos;

import javax.swing.JOptionPane;
public class Aula11Exercicio01 {
	
	//Função para calcular a idade entre o ano corrente e o ano de nascimento	
	public static int idade(int ano, int nascimento) {

		return ano - nascimento; //retorna a diferença entre os anos (idade)
	}

	public static void main(String[] args) {

		int anoCorrente, anoNascimento;
		anoCorrente = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
		anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Nascimento"));

		//Chama a função e imprime a idade
		System.out.println("A idade é "+idade(anoCorrente, anoNascimento));
		
	}

}
