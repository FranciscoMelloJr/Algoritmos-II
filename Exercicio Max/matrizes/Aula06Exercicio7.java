package matrizes;
/* Escreva um programa em java para calcular a m�dia 
 * dos elementos acima da diagonal principal de uma matriz 4X4.
 */

import javax.swing.JOptionPane;
public class Aula06Exercicio7 {

	public static void main(String[] args) {

		int linhas=4, colunas=4; //linhas e colunas da matriz
		int m[][] = new int[linhas][colunas];
		int i,j; //�ndices ou posi��es da matriz
		
		double soma=0; //vari�vel para somar os valores
		double media; //vari�vel para armazenar a media
		int contador=0; //vari�vel para contar n�mero de elementos
		
		//Armazena os valores na matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("N�mero na linha "+i+" coluna "+j));

		//L� a matriz e soma os valores acima da diagonal principal
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++) 
				if (i < j ) { //Se o "i" for menor que "j" temos os n�meros acima da diagonal principal
					soma = soma + m[i][j];
					contador++;
				}	
		
		//Calcula e Mostra a m�dia
		media = soma / contador; 
		System.out.println("A m�dia � "+media);
	}

}
