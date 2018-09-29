package matrizes;
/* Escreva um programa em java para mostrar a 
 * matriz identidade de uma matriz 4x4.
 */
//package Matrizes;

public class Aula05Exercicio2 {

	public static void main(String[] args) {

		int linhas = 4; //Número de linhas da matriz
		int colunas = 4; //Número de colunas da matriz
		int m[][] = new int[linhas][colunas]; //declara uma matriz inteira 4x4
		int i,j; //índices ou posições da matriz
		
		//Cria a matriz identidade
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				if (i == j)   //se o "i" é igual a "j" estamos na diagonal principal
					m[i][j]=1;
				else
					m[i][j]=0;
		
		//Mostra matriz 
		for (i=0; i<=linhas-1; i++) {
			for (j=0; j<=colunas-1; j++)
				System.out.print(m[i][j]);
			System.out.println("");
		}	
	}
}
