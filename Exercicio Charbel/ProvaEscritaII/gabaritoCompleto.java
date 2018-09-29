package ProvaEscritaII;

import javax.swing.JOptionPane;

public class gabaritoCompleto {

	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println(" = QUEST�O 1 = ");
		System.out.println("");
		
		int n = 50;
		int[][] matriz = new int[n][n];
		
		int qtdNr = 1;
		//Registro dos n�meros
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				String nrTxt = JOptionPane.showInputDialog(null, "Informe o n�mero (" + qtdNr + "): ");
				int nrInt = Integer.parseInt(nrTxt);
				matriz[i][j] = nrInt;
				qtdNr++;
			}
		}
		
		//Mostra os n�meros
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("");
		}
				
		//Quest�o 1-A
		int conta = 0;
		int soma = 0;
		for (int i=0; i<n; i++) {
			if ((i%2)==0) {
				for (int j=0; j<n; j++) {
					if ((j%2)==0) {
						soma += matriz[i][j];
						conta++;
					}
				}
			}
		}
		int media = soma/conta;
		System.out.println("1-A) M�dia: " + media);
		
		//Quest�o 1-B
		System.out.println("1-B) Matriz sem a diagonal principal:");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (i != j) {
					System.out.print(matriz[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("");
		}
		
		//Quest�o 1-C
		int somaColunaEsq  = 0;
		int somaColunaDir  = 0;
		int somaLinhaCima  = 0;
		int somaLinhaBaixo = 0;
		
		int qtdeColunaEsq  = n;
		int qtdeColunaDir  = n;
		int qtdeLinhaCima  = n-2;
		int qtdeLinhaBaixo = n-2;
		
		int qtdeBorda = qtdeColunaEsq + qtdeColunaDir + qtdeLinhaCima + qtdeLinhaBaixo; 
		
		//Soma a linha de cima
		for (int j=1; j<n-1; j++) {
			somaLinhaCima += matriz[0][j];
		}
		//Soma a linha de baixo
		for (int j=1; j<n-1; j++) {
			somaLinhaBaixo += matriz[n-1][j];
		}
		//Soma a coluna da esquerda
		for (int i=0; i<n; i++) {
			somaColunaEsq += matriz[i][0];
		}
		//Soma a coluna da direita
		for (int i=0; i<n; i++) {
			somaColunaEsq += matriz[i][n-1];
		}
		
		int somaBorda = somaColunaEsq + somaColunaDir + somaLinhaCima + somaLinhaBaixo;
		int mediaBorda = somaBorda / qtdeBorda;
		System.out.println("1-C) M�dia das bordas: " + mediaBorda);
		//
		
		System.out.println("");
		System.out.println(" = QUEST�O 2 = ");
		System.out.println("");
		
		//Registro dos dados
		int nrPessoas = 500;
		double[][] dadosPessoas = new double[nrPessoas][2];
		
		for (int i=0; i<nrPessoas; i++) {
			String strIdade  = JOptionPane.showInputDialog(null, "Informe a idade: ");
			String strAltura = JOptionPane.showInputDialog(null, "Informe a altura: ");
			double valorIdade   = Double.parseDouble(strIdade);
			double valorAltura  = Double.parseDouble(strAltura);
			dadosPessoas[i][0] = valorIdade;  //�ndice 0 guarda a idade
			dadosPessoas[i][1] = valorAltura; //�ndice 1 guarda a altura
		}
		
		//Mostra os dados
		System.out.println("Pessoa\tIdade\tAltura");
		for (int i=0; i<nrPessoas; i++) {
			System.out.println(i + "\t" + dadosPessoas[i][0] + "\t" + dadosPessoas[i][1]);
		}
		
		//Quest�o 2-A : Calcule a m�dia aritm�tica da altura das pessoas que tem entre 20 e 25 anos (inclusive)
		int nr2025 = 0;
		double soma2025 = 0;
		for (int i=0; i<nrPessoas; i++) {
			if ((dadosPessoas[i][0] >= 20) && (dadosPessoas[i][0] <= 25)) {
				nr2025++;
				soma2025 += dadosPessoas[i][1]; //�ndice 1 guarda a altura
			}
		}
		double media2025 = soma2025 / nr2025;
		System.out.println("2-A) M�dia da altura para idades entre 20 e 25 anos: " + media2025);
		
		//Quest�o 2-B : Calcule a m�dia aritm�tica da idade das pessoas que tem mais do que 1,80m
		int nr180 = 0;
		double soma180 = 0;
		for (int i=0; i<nrPessoas; i++) {
			if (dadosPessoas[i][1] > 1.80D) {
				nr180++;
				soma180 += dadosPessoas[i][0]; //�ndice 0 guarda a idade
			}
		}
		double media180 = soma180 / nr180;
		System.out.println("2-B) M�dia da idade para quem tem mais do que 1,80m: " + media180);
		
		//Quest�o 2-C : Informe a respectiva idade das 3 pessoas mais altas
		//A maneira mais f�cil de resolver essa quest�o seria ordenar previamente a matriz pela altura das pessoas
		int indMaiorAltura1 = -1;
		int indMaiorAltura2 = -1;
		int indMaiorAltura3 = -1;
		double maiorAlturaAux;
		
		//Procura a  maior altura 1
		maiorAlturaAux = 0;
		for (int i=0; i<nrPessoas; i++) {
			if (dadosPessoas[i][1] > maiorAlturaAux) { //verifica se � maior do que a altura 1
				maiorAlturaAux  = dadosPessoas[i][1]; 
				indMaiorAltura1 = i;
			}
		}
		//Procura a  maior altura 2
		maiorAlturaAux = 0;
		for (int i=0; i<nrPessoas; i++) {
			if (dadosPessoas[i][1] > maiorAlturaAux) { //verifica se � maior do que a altura 2
				if (i != indMaiorAltura1) { //verifica se n�o est� sendo usada como a maior altura 1 
					maiorAlturaAux  = dadosPessoas[i][1]; 
					indMaiorAltura2 = i;
				}
			}
		}
		//Procura a  maior altura 3
		maiorAlturaAux = 0;
		for (int i=0; i<nrPessoas; i++) {
			if (dadosPessoas[i][1] > maiorAlturaAux) { //verifica se � maior do que a altura 3
				if ((i != indMaiorAltura1) && (i != indMaiorAltura2)){ //verifica se n�o est� sendo usada como a maior altura 1 ou 2 
					maiorAlturaAux  = dadosPessoas[i][1]; 
					indMaiorAltura3 = i;
				}
			}
		}
		
		System.out.println("2-C) Informando a idade das pessoas mais altas.");
		System.out.println("Pessoa 1 -> Altura " + dadosPessoas[indMaiorAltura1][1] + " | Idade: " + dadosPessoas[indMaiorAltura1][0]);
		System.out.println("Pessoa 2 -> Altura " + dadosPessoas[indMaiorAltura2][1] + " | Idade: " + dadosPessoas[indMaiorAltura2][0]);
		System.out.println("Pessoa 3 -> Altura " + dadosPessoas[indMaiorAltura3][1] + " | Idade: " + dadosPessoas[indMaiorAltura3][0]);
		
		
		System.out.println("");
		System.out.println(" = QUEST�O 3 = ");
		System.out.println("");
		
		//Registro dos n�meros na matriz
		int[][] matrizNumeros = new int[4][5];
		for (int i=0; i<4; i++) {
			int somaNr = 0;
			for (int j=0; j<4; j++) {
				String strNum = JOptionPane.showInputDialog(null, "Informe o n�mero: ");
				matrizNumeros[i][j] = Integer.parseInt(strNum);
				somaNr += matrizNumeros[i][j];
			}
			matrizNumeros[i][4] = somaNr; //armazena a soma na �ltima coluna da linha
		}
		//Mostra os valores
		for (int i=0; i<4; i++) {
			System.out.println("Soma da linha " + i + ": " + matrizNumeros[i][4]);
		}
		
		
	}

}
