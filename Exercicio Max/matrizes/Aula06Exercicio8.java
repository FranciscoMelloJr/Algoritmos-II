package matrizes;
/* O elemento minimax de uma matriz é o menor elemento de uma linha
 * onde se encontra o maior elemento da matriz. Escreva um programa em java
 * para mostrar o elemento minimax e a sua posição em uma matriz 4X3.
 */

import javax.swing.JOptionPane;
public class Aula06Exercicio8 {

	public static void main(String[] args) {

		int linhas=4, colunas=3; //linhas e colunas da matriz
		int m[][] = new int[linhas][colunas]; //declara uma matriz 4x3
		int i,j; //índices ou posições da matriz

		int maior, menor; //variáveis para guardar o maior e menor elementos da matriz
		int ln=0; //variável para guardar a linha onde está o maior elemento
		
		//Armazena os valores na matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Número na linha "+i+" coluna "+j));

		//Lê a matriz e encontra o maior elemento
		maior=m[0][0]; //atribui o primeiro valor da matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				if (m[i][j] > maior) {
					maior = m[i][j];
					ln = i; //atribui a linha onde está o maior elemento
				}
		
		//Encontra o menor elemento da linha do maior elemento
		menor=m[ln][0]; //atribui o primeir elemento da linha
		for (j=0; j<=colunas-1; j++) {
			System.out.print(m[ln][j]+" ");
			if (m[ln][j] < menor)
				menor = m[ln][j];

		}	
		//Mostra o elemento minimax da matriz
		System.out.println("\n O elemento minimax da matriz é "+menor);
	}

}
