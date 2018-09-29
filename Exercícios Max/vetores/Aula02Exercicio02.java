package vetores;
/* Ler e armazenar em dois vetores os nomes e as 
 * quantidades de 5 produtos 
 */

import javax.swing.JOptionPane;

public class Aula02Exercicio02 {

	public static void main(String[] args) {

		int i; // índice ou posição do vetor;
		int n = 5; // tamanho do vetor;
		String nome[]=new String[n];  // declaração e alocação do vetor para codigos 
		int quantidade[] = new int[n]; // declaração e alocação vetor para quantidade
		String entrada;		
		
		// Leitura e armazenamento dos códigos e quantidades
		for (i=0; i<=n-1; i++ ) {
			nome[i]=JOptionPane.showInputDialog("Nome do Produto");
			entrada=JOptionPane.showInputDialog("Quantidade");
			quantidade[i]=Integer.parseInt(entrada);
		}
	
		// Imprimir os dados
		for (i=0; i<=n-1; i++) 
			System.out.println("Produto: "+nome[i]+" Quantidade: "+quantidade[i]);
	}
}
