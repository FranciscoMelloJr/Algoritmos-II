package vetores;
/* Armazenar em um vetor os valores 1,2,3,4,5,6,7,8,9 e 10.
 * Depois ler o vetor e multiplicar por dois os números pares e
 * armazená-los no mesmo vetor. Depois imprimir os valores do vetor
 */

public class Aula02Exercicio05 {

	public static void main(String[] args) {
		
		int i; // índice ou posição do vetor
		int vetor[]=new int[10];
		int resto; 
		
		//Armazenar os números no vetor
		for (i=0; i<=9; i++) {
			vetor[i]=i;
		}
		
		//Ler os números e multiplicar por 2 os números pares e armazená-los
		for (i=0; i<=9; i++) {
			resto = vetor[i]%2;  //Acha o resto da divisão
			if (resto==0)
				vetor[i]=vetor[i]*2;    
		}
			
		//Imprimir os valores do vetor
		for (i=0; i<=9; i++)
			System.out.println("Número: "+vetor[i]);
	}
}
