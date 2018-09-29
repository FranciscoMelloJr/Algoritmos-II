package matrizes;
/* Escreva um programa em java que armazene em um vetor 
 * a soma de cada uma das linhas de uma matriz 4X3
 */

import javax.swing.JOptionPane;
public class Aula06Exercicio5 {

	public static void main(String[] args) {

		int linhas=4, colunas=3; //linhas e colunas da matriz
		int m[][] = new int[linhas][colunas]; //declara uma matri 4x3
		int i,j; //índices ou posições da matriz
		
		int soma=0; //variável para guardar as somas dos elementos
		int v[] = new int[linhas]; //declara um vetor com o número de linhas da matriz
		
		//Armazena os valores na matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Número na linha "+i+" coluna "+j));

		//Lê a matriz, faz as somas das linhas e armazena no vetor
		for (i=0; i<=linhas-1; i++) {
			for (j=0; j<=colunas-1; j++)
				soma=soma+m[i][j];
			v[i]=soma;
			soma=0;
		}	
		
		//Mostra o vetor
		System.out.println("Valores do vetor");
		for (i=0; i<=linhas-1; i++)
			System.out.println("Linha: "+i+" soma: "+v[i]+" ");
	}
}
