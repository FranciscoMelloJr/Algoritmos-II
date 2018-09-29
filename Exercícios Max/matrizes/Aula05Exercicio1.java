package matrizes;
/* Escreva um programa em javapara achar os valores mínimo e máximo 
 * em uma matriz. Use uma matriz 2x3
 */
//package Matrizes;

import javax.swing.JOptionPane;
public class Aula05Exercicio1 {

	public static void main(String[] args) {
			
		int linhas = 2; //Número de linhas da matriz
		int colunas = 3; //Número de colunas da matriz
		int m[][] = new int[linhas][colunas]; //declara uma matriz inteira 2x3
		int i,j; //índices ou posições da matriz
		
		int maior, menor; // variáveis para os valores máximo e mínimo
		
		//Armazena valores na matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++) 
				m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Número na linha "+i+" e coluna "+j));
		
		//Atribui o primeiro valor da matriz as variáveis de controle
		maior = m[0][0];
		menor = m[0][0];
		
		//Lê a matriz e define os valores máximo e mínimo
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++) {
				if (m[i][j] > maior)
					maior = m[i][j];
				if (m[i][j] < menor)
					menor = m[i][j];
			}
		
		//Mostra os valores máximo e mínimo
		System.out.println("O maior valor é: "+maior+" e o menor valor é: "+menor);
	}
}
