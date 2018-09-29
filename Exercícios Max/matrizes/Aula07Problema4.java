package matrizes;
//Escreva um programa para multiplicar duas matrizes: A3x2 e B2x2


import javax.swing.JOptionPane;
public class Aula07Problema4 {

	public static void main(String[] args) {

		int A[][]= new int[3][2];
		int B[][]= new int[2][2];
		int P[][]= new int[3][2];
		int i,j; //índices ou posições da matriz
		
		int soma=0; //variável para guardar as somas dos pontos
		
		//Armazena as informações na matriz 1
		for (i=0; i<=2; i++)
			for (j=0; j<=1; j++)
				A[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Matriz 1: Valor da linha "+i+" na coluna "+j));
		
		//Armazena as informações na matriz 2
		for (i=0; i<=1; i++) 
			for (j=0; j<=1; j++) 
				B[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Matriz 2: Valor da linha "+i+" na coluna "+j));

		//Multiplica as matrizes
		for (i=0; i<=2; i++)
			for (j=0; j<=1; j++) {
				soma=0;
				for (int k=0; k<=1; k++)
					soma = soma + A[i][k]*B[k][j];
				P[i][j]=soma;
			}
		
		//Mostra a matriz com o resultado
		for (i=0; i<=2; i++) {
			for (j=0; j<=1; j++) 
				System.out.print(P[i][j]+" ");
			System.out.println("");	
		}
	}
}
