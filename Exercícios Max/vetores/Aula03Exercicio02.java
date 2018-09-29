package vetores;
/* Escreva um programa para armazenar em um vetor 
 * todos os números ímpares no intervalo entre 1 e 100. 
 * Depois imprimir os valores armazenados
 */

public class Aula03Exercicio02 {

	public static void main(String[] args) {
		
		int intervalo=100; // final do intervalo 
		int n=intervalo/2; //tamanho do vetor (metade dos números)
		int vetor[]=new int[n];
		int i; //índice ou posição do vetor
		int resto, aux=0; 
		
		//Armazenar os valores no vetor
		for(i=0; i<=intervalo-1; i++) {
			resto=i%2;
			if (resto != 0) {
				vetor[aux]=i;
			    aux++;
			}    
		}
			
		//Imprimir os valores
		for (i=0; i<=n-1; i++)
			System.out.println(vetor[i]);
	}

}
