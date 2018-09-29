package vetores;
/* Escreva um programa que leia 10 números e 
 * armazene em um vetor a metade de cada número. 
 * Depois imprimir os valores armazenados
 */
import javax.swing.JOptionPane;

public class Aula03Exercicio03 {

	public static void main(String[] args) {
		
		int n=10; // tamanho do vetor
		double vetor[]=new double[n]; // declara o vetor e aloca espaço
		int i; // índice ou posição do vetor
		String entrada;
		
		//Ler e armazenar os números
		for (i=0; i<=n-1; i++) {
			entrada = JOptionPane.showInputDialog("Número");
			vetor[i]=(Double.parseDouble(entrada)/2);
		}

		//Imprimir os valores
		for (i=0; i<=n-1; i++)
			System.out.println(vetor[i]);
	}
}
