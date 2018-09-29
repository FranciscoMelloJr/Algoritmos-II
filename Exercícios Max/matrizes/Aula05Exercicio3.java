package matrizes;
// Escreva um programa para somar duas matrizes 3x2.

//package Matrizes;

import javax.swing.JOptionPane;
public class Aula05Exercicio3 {

	public static void main(String[] args) {

		int linhas=3; //Número de linhas da matriz
		int colunas=2; //Número de colunas da matriz
		double m1[][] = new double[linhas][colunas]; //declara uma matriz real 3x2
		double m2[][] = new double[linhas][colunas]; //declara outra matriz
		double soma[][] = new double[linhas][colunas]; //declara uma matriz para receber o resultado da soma
		int i,j; //índices ou posições da matriz
		
		//Armazena valores nas matrizes m1 e m2
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++) {
				m1[i][j]=Double.parseDouble(JOptionPane.showInputDialog("Matriz 1 - Número na linha "+i+" na coluna "+j));
				m2[i][j]=Double.parseDouble(JOptionPane.showInputDialog("Matriz 2 - Número na linha "+i+" na coluna "+j));
			}
		//Soma as matrizes e armazena na matriz "soma"
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				soma[i][j] = m1[i][j] + m2[i][j];
		
		//Mostra a matriz "soma"
		for (i=0; i<=linhas-1; i++) {
			for (j=0; j<=colunas-1; j++)
				System.out.print(soma[i][j]+" ");
			System.out.println("");
		}	
	}
}
