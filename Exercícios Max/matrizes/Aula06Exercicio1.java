package matrizes;
/* Escreva um programa em java para somar os elementos 
 * da diagonal principal e diagonal secund�ria de uma matriz 4x4.
 */

import javax.swing.JOptionPane;
public class Aula06Exercicio1 {

	public static void main(String[] args) {

		int linhas= 4, colunas = 4; //linas e colunas da matriz
		int m[][] = new int[linhas][colunas]; //declara uma matriz 4x4
		int i,j; //�ndices ou posi��es da matriz
		
		int somaPrincipal=0, somaSecundaria=0; //vari�veis para guardar as somas 
		
		//Armazena os valores inteiros na matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("N�mero na linha "+i+" coluna "+j));
		
		//L� a matriz e faz as somas
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++){
				if (i == j)  //Se "i" e "j" forem iguais, � a diagonal principal
					somaPrincipal = somaPrincipal + m[i][j];
				if (j == linhas-1-i)
					somaSecundaria = somaSecundaria + m[i][j];
			}	
		
		//Mostra os resultados
		System.out.println("Soma da diagonal prim�ria: "+somaPrincipal);
		System.out.println("Soma da diagonal secund�ria: "+somaSecundaria);
	}
}
