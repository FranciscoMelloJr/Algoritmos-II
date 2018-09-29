package matrizes;
/* Escreva um programa em java que leia um valor qualquer e 
 * multiplique cada elemento de uma matriz 3X3 e armazene em um vetor. 
 * Mostre o vetor.
 */

import javax.swing.JOptionPane;
public class Aula06Exercicio3 {

	public static void main(String[] args) {

		int linhas=3, colunas=3; //linhas e colunas da matriz
		int m[][] = new int[linhas][colunas]; //declara uma matriz 3x3
		int i,j; //�ndices ou posi��es da matriz
		
		int valor; // valor para efetuar a multiplica��o
		int v[] = new int[colunas*linhas]; //declara um vetor com o tamanho da matriz
		int k=0; //�ndice ou posi��o do vetor
		
		//Armazena os valores na matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("N�mero na linha "+i+" coluna "+j));
		
		//Insere o valor de multiplica��o
		valor = Integer.parseInt(JOptionPane.showInputDialog("Valor para multiplica��o: "));
		
		//L� a matriz, multiplica pelo valor e armazena no vetor
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++){
				v[k]=m[i][j]*valor;
				k++;
			}	
		
		//Mostra o vetor
		System.out.println("Valores do vetor");
		for (i=0; i<=k-1; i++)
			System.out.print(v[i]+" ");
	}

}
