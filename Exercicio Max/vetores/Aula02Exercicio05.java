package vetores;
/* Armazenar em um vetor os valores 1,2,3,4,5,6,7,8,9 e 10.
 * Depois ler o vetor e multiplicar por dois os n�meros pares e
 * armazen�-los no mesmo vetor. Depois imprimir os valores do vetor
 */

public class Aula02Exercicio05 {

	public static void main(String[] args) {
		
		int i; // �ndice ou posi��o do vetor
		int vetor[]=new int[10];
		int resto; 
		
		//Armazenar os n�meros no vetor
		for (i=0; i<=9; i++) {
			vetor[i]=i;
		}
		
		//Ler os n�meros e multiplicar por 2 os n�meros pares e armazen�-los
		for (i=0; i<=9; i++) {
			resto = vetor[i]%2;  //Acha o resto da divis�o
			if (resto==0)
				vetor[i]=vetor[i]*2;    
		}
			
		//Imprimir os valores do vetor
		for (i=0; i<=9; i++)
			System.out.println("N�mero: "+vetor[i]);
	}
}
