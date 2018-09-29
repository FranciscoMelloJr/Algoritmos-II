/* Criar uma função para retornar o nome do mês passando o 
 * seu respectivo número
 */
package funcoesProcedimentos;

import javax.swing.JOptionPane;
public class Aula11Exercicio04 {

	//Função para retornar o nome do mês do ano
	public static String nomeMes(int m){

		//Declara um vetor com os nomes dos meses
		String v[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
					  "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		
		return v[m-1]; //Retorna o nome do mês (posição do vetor)
	}
	
	public static void main(String[] args) {

		int mes; 
		
		mes=Integer.parseInt(JOptionPane.showInputDialog("Insira o número do mês"));

		//Chama a função para imprimir o nome do mês
		System.out.println(nomeMes(mes));
		
	}

}
