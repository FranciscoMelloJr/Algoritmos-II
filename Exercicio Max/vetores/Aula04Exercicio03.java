package vetores;
/* Escreva um programa que leia 5 n�meros e armazene em um vetor. 
 * Primeiro armazene. Depois crie um outro vetor armazenando
 * os valores na sequ�ncia inversa. Exemplo: 4,5,1,7,8..... 8,7,1,5,4.
 */
import javax.swing.JOptionPane;

public class Aula04Exercicio03 {

	public static void main(String[] args) {

		int n=5; //tamanho do vetor
		int vetor1[]=new int[n];  //declara e aloca espa�o para o vetor 1
		int vetor2[]=new int[n]; //declara e aloca espa�o para o vetor 2
		int i; //�ndice ou posi��o do vetor
		int aux; //vari�vel auxiliar para ajudar na invers�o
		
		//L� os n�meros e armazena no vetor
		for (i=0; i<=n-1; i++) 
			vetor1[i]=Integer.parseInt(JOptionPane.showInputDialog("N�mero"));
		
		//L� o vetor original (vetor 1) e armazena no vetor 2 na ordem inversa
		aux=n-1;
		for (i=0; i<=n-1; i++){
			vetor2[aux]=vetor1[i];
			aux--; //decrementa a vari�vel de 1 em 1
		}
		
		//Mostra o vetor 2 (ordem inversa)
		for (i=0; i<=n-1; i++)
			System.out.println(vetor2[i]);
	}

}
