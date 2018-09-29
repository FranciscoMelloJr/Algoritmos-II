package matrizes;
//* Calcular dist�ncias entre cidades em uma matriz


import javax.swing.JOptionPane;
public class Aula07Problema3 {

	public static void main(String[] args) {

		int linhas=6, colunas=6; //linhas e colunas da matriz
		int distancia[][] = new int[linhas][colunas]; //declara uma matriz 6x6
		int i,j; //�ndices ou posi��es da matriz
		
		int roteiro[] = new int[linhas]; //declara o vetor do roteiro
		int origem=0,destino=0; //vari�veis para guardar passo-a-passo o percursso
		int soma=0; //vari�vel para guardar o somat�rio das dist�ncias
		boolean priVez=true;
		
		//Armazena as dist�ncias na matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				distancia[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Dist�ncia na linha "+i+" e coluna "+j));
		
		//Armazena o roteiro no vetor
		for (i=0; i<=linhas-1; i++)
			roteiro[i]=Integer.parseInt(JOptionPane.showInputDialog("Roteiro - Cidade "+i));
		
		//L� o roteiro, verifica na matriz a dist�ncia e faz o somat�rio
		for (i=0; i<=linhas-1; i++) {
			if (priVez) {
				origem=roteiro[i];
				priVez=false;
			} else {
				destino=roteiro[i];
				soma = soma + distancia[origem][destino];
				origem=destino;
			}
		}	
		
		//Imprime a dist�ncia do roteiro
		System.out.println("Dist�ncia percorrida = "+soma);
		
	}
}
