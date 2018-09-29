package vetores;
/* Escreva um programa para armazenar em dois vetores as seguintes sequências:
 *  Primeiro vetor: 1,2,3,4,5. Segundo vetor: 6,7,8,9,10. 
 *  Depois imprima a multiplicação do primeiro elemento do vetor1 
 *  com o último elemento do vetor2, a multiplicação do segundo elemento
 *  do vetor1 com o penúltimo elemento do vetor2, e assim sucessivamente.
 */
public class Aula04Exercicio04 {

	public static void main(String[] args) {
		
		int n=5; //tamanho do vetor
		int vetor1[]= {1,2,3,4,5}; //declara e inicializa com os valores o vetor 1
		int vetor2[]= {6,7,8,9,10}; //declara e inicializa com os valores o vetor 2
		int i; //índice ou posição do vetor
		
		int aux=n-1; //variável auxiliar para ajudar na inversão
				
		//Lê os vetores e multiplica seus elementos na ordema inversa
		for (i=0; i<=n-1; i++) {
			System.out.println(vetor1[i]*vetor2[aux]);
			aux--; //decrementa a variável de 1 em 1
		}
	}
}
