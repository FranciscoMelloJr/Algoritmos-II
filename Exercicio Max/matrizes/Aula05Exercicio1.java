package matrizes;
/* Escreva um programa em javapara achar os valores m�nimo e m�ximo 
 * em uma matriz. Use uma matriz 2x3
 */
//package Matrizes;

import javax.swing.JOptionPane;
public class Aula05Exercicio1 {

	public static void main(String[] args) {
			
		int linhas = 2; //N�mero de linhas da matriz
		int colunas = 3; //N�mero de colunas da matriz
		int m[][] = new int[linhas][colunas]; //declara uma matriz inteira 2x3
		int i,j; //�ndices ou posi��es da matriz
		
		int maior, menor; // vari�veis para os valores m�ximo e m�nimo
		
		//Armazena valores na matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++) 
				m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("N�mero na linha "+i+" e coluna "+j));
		
		//Atribui o primeiro valor da matriz as vari�veis de controle
		maior = m[0][0];
		menor = m[0][0];
		
		//L� a matriz e define os valores m�ximo e m�nimo
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++) {
				if (m[i][j] > maior)
					maior = m[i][j];
				if (m[i][j] < menor)
					menor = m[i][j];
			}
		
		//Mostra os valores m�ximo e m�nimo
		System.out.println("O maior valor �: "+maior+" e o menor valor �: "+menor);
	}
}
