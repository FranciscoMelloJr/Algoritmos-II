package vetores;
/* Escreva um programa que leia 10 n�meros e 
 * armazene em um vetor a metade de cada n�mero. 
 * Depois imprimir os valores armazenados
 */
import javax.swing.JOptionPane;

public class Aula03Exercicio03 {

	public static void main(String[] args) {
		
		int n=10; // tamanho do vetor
		double vetor[]=new double[n]; // declara o vetor e aloca espa�o
		int i; // �ndice ou posi��o do vetor
		String entrada;
		
		//Ler e armazenar os n�meros
		for (i=0; i<=n-1; i++) {
			entrada = JOptionPane.showInputDialog("N�mero");
			vetor[i]=(Double.parseDouble(entrada)/2);
		}

		//Imprimir os valores
		for (i=0; i<=n-1; i++)
			System.out.println(vetor[i]);
	}
}
