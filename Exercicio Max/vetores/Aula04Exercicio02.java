package vetores;
/*Escreva um programa para armazenar os nomes, os valores e 
 * as quantidades vendidas de 5 produtos. 
 * Primeiro armazene os dados. Depois leia o vetor e imprima 
 * o faturamento em função das vendas e o nome do produto mais vendido.
 */
import javax.swing.JOptionPane;

public class Aula04Exercicio02 {

	public static void main(String[] args) {

		int n=5; //tamanho do vetor
		String produto[] = new String[n]; //declara o vetor para os nomes
		double valor[] = new double[n]; //declara o vetor para os valores
		int qtde[] = new int[n];  // declara o vetor para as quantidades
		
		int i; // índice ou posição do vetor
		int maior;
		String produtoMaisVendido="";
		double soma=0;
		
		//Lê as informações e armazena nos vetores
		for (i=0; i<=n-1; i++) {
			produto[i]=JOptionPane.showInputDialog("Nome do Produto");
			valor[i]=Double.parseDouble(JOptionPane.showInputDialog("Valor"));
			qtde[i]=Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
		}
		
		//Atribui o primeiro valor do vetor qtde a variável "maior"
		maior=qtde[0];
		
		//Lê o vator e imprime as informações
		System.out.println("Faturamento");
		for (i=0; i<=n-1; i++) {
			if (qtde[i]>maior) {
				maior = qtde[i];
				produtoMaisVendido = produto[i];
			}	
			System.out.print("Produto: "+produto[i]);
			System.out.print("  Valor: "+valor[i]);
			System.out.print("  Qtde: "+qtde[i]);
			System.out.println("  Total: "+valor[i]*qtde[i]);
			soma=soma+valor[i]*qtde[i];
		}
		
		//Imprime o produto mais vendido e o total de faturamento
		System.out.println("Produto mais vendido: "+produtoMaisVendido);
		System.out.println("Faturamento: "+soma);
	}
}
