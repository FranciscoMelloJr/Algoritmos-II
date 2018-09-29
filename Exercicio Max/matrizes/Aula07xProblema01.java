package matrizes;
// Problema 1 da Aula 07x - Produção/Custo/Lucro

public class Aula07xProblema01 {

	public static void main(String[] args) {

		int producao[][] = {{30,20},
							{5,10},
							{7,15},
							{22,18},
							{8,15},
							{10,30},
							{12,8},
							{25,38},
							{7,9},
							{21,15},
							{15,18},
							{18,25}};  //declara matriz de produção 12x2
		int valor[][] = {{250,100},
						 {450,180}};  //declara matriz de valores (custo e lucro) 2x2
		int totalCustoC1 = 0; //variável para guardar o total de custo de C1
		int totalLucroC1 = 0; //variável para guardar o total de lucro de C1
		int totalCustoC2 = 0; //variável para guardar o total de custo de C2
		int totalLucroC2 = 0; //variável para guardar o total de lucro de C2
		
 		//Declaração do vetor com os nomes dos meses
		String mes[] = {"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
		
		int linhaP = 12, colunaP = 2; //linhas e colunas da matriz de produção
		int i,j; //índices ou posições das matrizes
		
		//Lê a matriz de produção e calcula os valores por mês
		for (i=0; i<=linhaP-1; i++)
			for (j=0; j<=colunaP-1; j++){
				System.out.print(mes[i]+" "); //mostra o nome do mês
				if (j==0)
					System.out.print("C1"+" ");
				else
					System.out.print("C2"+" ");
				
				for (int k=0; k<=colunaP-1; k++) {
					if (k==0) {
						if (j==0)
							totalCustoC1 = totalCustoC1 + producao[i][k]*valor[k][j];
						else
							totalLucroC1 = totalLucroC1 + producao[i][k]*valor[k][j];
						System.out.print("CUSTO: ");
					}	
					else {
						if (j==0)
							totalCustoC2 = totalCustoC2 + producao[i][k]*valor[k][j];
						else
							totalLucroC2 = totalLucroC2 + producao[i][k]*valor[k][j];
						System.out.print("LUCRO: ");
					}	
					System.out.print(producao[i][k]*valor[k][j]+" ");
				}
				System.out.println("");
			}
		System.out.println("Total anual Custo C1: "+totalCustoC1);
		System.out.println("Total anual Lucro C1: "+totalLucroC1);
		System.out.println("Total anual Custo C2: "+totalCustoC2);
		System.out.println("Total anual Lucro C2: "+totalLucroC2);
	}
}
