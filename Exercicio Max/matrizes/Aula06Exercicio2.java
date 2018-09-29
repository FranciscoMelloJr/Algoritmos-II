package matrizes;
/* Escreva um programa em java para mostrar o menor elemento da 
 * diagonal principal de uma matriz 4x4.
 */

import javax.swing.JOptionPane;
public class Aula06Exercicio2 {

	public static void main(String args[]) {
		
		int linhas=4, colunas=4; //linhas e colunas da matriz
		int m[][] = new int[linhas][colunas]; //declara uma matriz 4X4
		int i,j; //índices ou posições da matriz
		
		int menor; //variável para armazenar o menor valor da diagonal principal
		
		//Armazena os valores na matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Número na linha "+i+" coluna "+j));
		
		//Lê a matriz e verifica o menor valor da diagonal principal
		menor = m[0][0]; //atribui o primeiro valor da diagonal principal 
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				if (i == j) //se "i" e "j" forem iguais, estamos na diagonal princial
					if (m[i][j] < menor)
						menor = m[i][j];
		
		//Mostra o menor valor
		System.out.println("O menor valor da diagonal principal é: "+menor);
	}
}
