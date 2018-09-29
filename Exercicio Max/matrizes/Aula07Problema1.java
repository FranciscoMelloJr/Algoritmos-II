package matrizes;
/* Escreva um programa para armazenar uma matriz 5x5 e 
 * trocar a diagonal principal com a secundária. 
 * Mostrar a matriz depois da alteração.
 */

import javax.swing.JOptionPane;
public class Aula07Problema1 {

	public static void main(
			String[] args) {

		int linhas=5, colunas=5; //linhas e colunas da matriz
		int m[][] = new int[linhas][colunas]; //declara uma matriz de inteiros 5x5
		int i,j; //índices ou posições da matriz
		
		int diagonalP[] = new int[linhas];
		int diagonalS[] = new int[linhas];
	
		//Armazena os valores na matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++) {
				m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Número na linha "+i+" e coluna "+j));
				if (i == j) //diagonal principal
					diagonalP[i]=m[i][j];
				if (j == linhas-1-i) //diagonal secundária
					diagonalS[i]=m[i][j];
			}	
		
		//Lê a matriz e realiza a troca
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++){
				if (i == j)
					m[i][j]=diagonalS[i]; //realiza a substituição 
				if (j == linhas-1-i)
					m[i][j]=diagonalP[i]; //realiza a substituição
			}	

		//Mostra a matriz
		for (i=0; i<=linhas-1; i++) {
			for (j=0; j<=colunas-1; j++)
				System.out.print(m[i][j]+" ");
			System.out.println("");
		}	
	}
}
