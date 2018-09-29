package matrizes;
/* Escreva um programa em java que mostre a soma 
 * dos elementos das linhas pares de uma matriz 4X4.
 */

import javax.swing.JOptionPane;
public class Aula06Exercicio4 {

	public static void main(String[] args) {

		int linhas=4, colunas=4; //linhas e colunas da matriz
		int m[][] = new int[linhas][colunas]; //declara uma matriz 5x5
		int i,j; //índices ou posições da matriz
		
		int soma=0; //variável para guardar a soma dos elementos
		
		//Armazena os valores na matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Número na linha "+i+" coluna "+j));
				
		//Lê a matriz e soma os elementos das linhas pares
		for (i=0; i<=linhas-1; i++){
			for (j=0; j<=colunas-1; j++)
				if (i%2 == 0) //Calcula o resto da divisão da linha por 2 (verifica se é par)
					soma = soma + m[i][j];
			if (soma != 0) {
				System.out.println("Soma da linha "+i+": "+soma);
				soma=0;
			}	
		}	
	}

}



