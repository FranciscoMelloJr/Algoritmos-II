package vetores;
/* Escreva um programa para armazenar em um vetor 
 * todos os n�meros m�ltiplos de 5, no intervalo de 1 a 500. 
 * Ap�s isso, o programa deve imprimir todos os valores armazenados.
 */

public class Aula03Exercicio01 {

	public static void main(String[] args) {

		int n; //tamanho do vetor
		n=500/5; //n�mero de m�ltiplos no intervalo
		int vetor[] = new int[n];  //declara o vetor e aloca espa�o
		int i; //�ndice ou posi��o do vetor;
		int aux=0; // tinha int resto;
				
		//Armazenar os valores (m�ltiplos)
		for (i=0; i<=n-1; i++) {
			aux+=5;
			vetor[i]=aux;
		}	
		
		//Imprime os valores armazenados
		for (i=0; i<=n-1; i++)
			System.out.println(vetor[i]);
	}
}
