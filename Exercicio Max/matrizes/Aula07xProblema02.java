package matrizes;
// Mostra a matriz transposta de uma matriz 4x3

import javax.swing.JOptionPane;
public class Aula07xProblema02 {
	public static void main (String args[]) {
		
		int linha=4, coluna=3; //linhas e colunas da matriz 4x3
		int m[][] = new int[linha][coluna]; //declara uma matriz de inteiros 4x3
		int i, j; //índices ou posições da matriz
		
		//Armazena valores na matriz
		for (i=0; i<=linha-1; i++)
			for (j=0; j<=coluna-1; j++)
				m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Número na linha: "+i+" e coluna: "+j));
		
		//Mostra a matriz transposta
		for (j=0; j<=coluna-1; j++){
			for (i=0; i<=linha-1; i++)
				System.out.print(m[i][j]+" ");
			System.out.println("");
		}	
	}
}
