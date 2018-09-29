package matrizes;
/* Escreva um programa em java que multiplique os elemtos de 
 * cada linha de uma matriz pelo elemento da diagonal principal 
 * daquela linha. Matriz 4X4.
 */

import javax.swing.JOptionPane;
public class Aula06Exercicio6 {

	public static void main(String[] args) {

		int linhas=4, colunas=4; //linhas e colunas da matriz
		int m[][] = new int[linhas][colunas]; //declara uma matriz 4x4
		int i,j; //índices ou posições da matriz

		int v[] = new int[linhas]; //declara um vetor para armazenar a diagonal principal 

		//Armazena os valores na matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Número na linha "+i+" coluna "+j));
		
		//Lê a matriz e armazena a diagonal principal em um vetor
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				if (i == j)
					v[i]=m[i][j];
		
		//Multiplica cada elemento da matriz pelos valores do vetor 
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				m[i][j]=m[i][j]*v[i];
		
		//Mostra a matriz depois da multiplicação
		for (i=0; i<=linhas-1; i++) {
			for (j=0; j<=colunas-1; j++)
				System.out.print(m[i][j]+" ");
			System.out.println("");
		}	
	}

}
