package matrizes;
/* Escreva um programa em javapara mostrar apenas 
 * os elementos abaixo da diagonal principal. Use uma matriz 3X3.
 */
//package Matrizes;
import javax.swing.JOptionPane;

public class Aula05Exercicio4 {

	public static void main(String[] args) {

		int linhas=3; //N�mero de linhas da matriz
		int colunas=3; //N�mero de colunas da matriz
		int m[][] = new int[linhas][colunas]; //declara uma matriz inteira 3x3
		int i,j; //�ndices ou posi��es da matriz
		
		//Armazena os valores na matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("N�mero na linha "+i+" e coluna "+j));
		
		//Mostra os valores abaixo da diagonal principal
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				if (i > j) //se o "i" for maior que o "j" teremos os n�meros abaixo da diagonal principal
					System.out.print(m[i][j]+" ");
	}
}
