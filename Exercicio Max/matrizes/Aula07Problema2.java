package matrizes;
// Alunos e quest�es - verifica��o de pontos com gabarito


import javax.swing.JOptionPane;
public class Aula07Problema2 {

	public static void main(String[] args) {

		int linhas=8, colunas=6; //linhas e colunas da matriz
		String alunoQuestao[][] = new String[linhas][colunas]; //declara a matriz de alunos e quest�es
		int i,j; //�ndices ou posi��es da matriz
		
		String gabarito[] = new String[colunas-1];
		int soma=0; //vari�vel para guardar as somas dos pontos
		
		//Armazena as informa��es na matriz
		for (i=0; i<=linhas-1; i++)
			for (j=0; j<=colunas-1; j++)
				if (j==0)
					alunoQuestao[i][j]=JOptionPane.showInputDialog("Nome do Aluno");
				else 
					alunoQuestao[i][j]=JOptionPane.showInputDialog(
							"Resposta da Quest�o "+j);
		
		
		//Armazena o gabarito no vetor
		for (j=0; j<=colunas-2; j++)
			gabarito[j]=JOptionPane.showInputDialog("Gabarito - quest�o "+j);
	
		//L� a matriz e o gabarito e calcula os pontos dos alunos
		for (i=0; i<=linhas-1; i++) {
			for (j=0; j<=colunas-1; j++)
				if (j == 0)
					System.out.print("Aluno: "+alunoQuestao[i][j]+" ");
				else 
					if (alunoQuestao[i][j].equals(gabarito[j-1]))
						soma++;
			System.out.println(soma);
			soma=0;
		}	
	}
}
