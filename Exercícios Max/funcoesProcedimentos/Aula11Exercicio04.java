/* Criar uma fun��o para retornar o nome do m�s passando o 
 * seu respectivo n�mero
 */
package funcoesProcedimentos;

import javax.swing.JOptionPane;
public class Aula11Exercicio04 {

	//Fun��o para retornar o nome do m�s do ano
	public static String nomeMes(int m){

		//Declara um vetor com os nomes dos meses
		String v[] = {"janeiro", "fevereiro", "mar�o", "abril", "maio", "junho",
					  "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		
		return v[m-1]; //Retorna o nome do m�s (posi��o do vetor)
	}
	
	public static void main(String[] args) {

		int mes; 
		
		mes=Integer.parseInt(JOptionPane.showInputDialog("Insira o n�mero do m�s"));

		//Chama a fun��o para imprimir o nome do m�s
		System.out.println(nomeMes(mes));
		
	}

}
