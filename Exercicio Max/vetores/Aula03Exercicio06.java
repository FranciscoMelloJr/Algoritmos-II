package vetores;
/* A série de Fibonacci é formada pela sequência:1,1,2,3,5,8,13,21,34,55,...
 * Escreva um programa que armazene em um vetor 
 * os 20 primeiros termos da série. Depois imprimir as informações
 */
public class Aula03Exercicio06 {

	public static void main(String[] args) {
		
		int n=20; //tamanho do vetor
		int fib[]=new int[n]; //declara o vetor e aloca espaço
		int i; //índice ou posição do vetor
		
		//Calcular o valor da série e armazenar no vetor
		for (i=0; i<=n-1; i++) {
			if (i==0 || i==1)
				fib[i]=1;
			else
				fib[i]=fib[i-1]+fib[i-2];
		}
		
		//Imprimir a sequência
		for (i=0; i<=n-1; i++)
			System.out.print(fib[i]+", ");
	}

}
