package vetores;
/* A s�rie de Fibonacci � formada pela sequ�ncia:1,1,2,3,5,8,13,21,34,55,...
 * Escreva um programa que armazene em um vetor 
 * os 20 primeiros termos da s�rie. Depois imprimir as informa��es
 */
public class Aula03Exercicio06 {

	public static void main(String[] args) {
		
		int n=20; //tamanho do vetor
		int fib[]=new int[n]; //declara o vetor e aloca espa�o
		int i; //�ndice ou posi��o do vetor
		
		//Calcular o valor da s�rie e armazenar no vetor
		for (i=0; i<=n-1; i++) {
			if (i==0 || i==1)
				fib[i]=1;
			else
				fib[i]=fib[i-1]+fib[i-2];
		}
		
		//Imprimir a sequ�ncia
		for (i=0; i<=n-1; i++)
			System.out.print(fib[i]+", ");
	}

}
