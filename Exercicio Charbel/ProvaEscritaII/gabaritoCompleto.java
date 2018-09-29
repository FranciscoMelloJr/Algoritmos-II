package ProvaEscritaII;

import javax.swing.JOptionPane;

public class gabaritoCompleto {

	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println(" = QUESTÃO 1 = ");
		System.out.println("");
		
		int n = 50;
		int[][] matriz = new int[n][n];
		
		int qtdNr = 1;
		//Registro dos números
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				String nrTxt = JOptionPane.showInputDialog(null, "Informe o número (" + qtdNr + "): ");
				int nrInt = Integer.parseInt(nrTxt);
				matriz[i][j] = nrInt;
				qtdNr++;
			}
		}
		
		//Mostra os números
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("");
		}
				
		//Questão 1-A
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
		System.out.println("1-A) Média: " + media);
		
		//Questão 1-B
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
		
		//Questão 1-C
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
		System.out.println("1-C) Média das bordas: " + mediaBorda);
		//
		
		System.out.println("");
		System.out.println(" = QUESTÃO 2 = ");
		System.out.println("");
		
		//Registro dos dados
		int nrPessoas = 500;
		double[][] dadosPessoas = new double[nrPessoas][2];
		
		for (int i=0; i<nrPessoas; i++) {
			String strIdade  = JOptionPane.showInputDialog(null, "Informe a idade: ");
			String strAltura = JOptionPane.showInputDialog(null, "Informe a altura: ");
			double valorIdade   = Double.parseDouble(strIdade);
			double valorAltura  = Double.parseDouble(strAltura);
			dadosPessoas[i][0] = valorIdade;  //índice 0 guarda a idade
			dadosPessoas[i][1] = valorAltura; //índice 1 guarda a altura
		}
		
		//Mostra os dados
		System.out.println("Pessoa\tIdade\tAltura");
		for (int i=0; i<nrPessoas; i++) {
			System.out.println(i + "\t" + dadosPessoas[i][0] + "\t" + dadosPessoas[i][1]);
		}
		
		//Questão 2-A : Calcule a média aritmética da altura das pessoas que tem entre 20 e 25 anos (inclusive)
		int nr2025 = 0;
		double soma2025 = 0;
		for (int i=0; i<nrPessoas; i++) {
			if ((dadosPessoas[i][0] >= 20) && (dadosPessoas[i][0] <= 25)) {
				nr2025++;
				soma2025 += dadosPessoas[i][1]; //índice 1 guarda a altura
			}
		}
		double media2025 = soma2025 / nr2025;
		System.out.println("2-A) Média da altura para idades entre 20 e 25 anos: " + media2025);
		
		//Questão 2-B : Calcule a média aritmética da idade das pessoas que tem mais do que 1,80m
		int nr180 = 0;
		double soma180 = 0;
		for (int i=0; i<nrPessoas; i++) {
			if (dadosPessoas[i][1] > 1.80D) {
				nr180++;
				soma180 += dadosPessoas[i][0]; //índice 0 guarda a idade
			}
		}
		double media180 = soma180 / nr180;
		System.out.println("2-B) Média da idade para quem tem mais do que 1,80m: " + media180);
		
		//Questão 2-C : Informe a respectiva idade das 3 pessoas mais altas
		//A maneira mais fácil de resolver essa questão seria ordenar previamente a matriz pela altura das pessoas
		int indMaiorAltura1 = -1;
		int indMaiorAltura2 = -1;
		int indMaiorAltura3 = -1;
		double maiorAlturaAux;
		
		//Procura a  maior altura 1
		maiorAlturaAux = 0;
		for (int i=0; i<nrPessoas; i++) {
			if (dadosPessoas[i][1] > maiorAlturaAux) { //verifica se é maior do que a altura 1
				maiorAlturaAux  = dadosPessoas[i][1]; 
				indMaiorAltura1 = i;
			}
		}
		//Procura a  maior altura 2
		maiorAlturaAux = 0;
		for (int i=0; i<nrPessoas; i++) {
			if (dadosPessoas[i][1] > maiorAlturaAux) { //verifica se é maior do que a altura 2
				if (i != indMaiorAltura1) { //verifica se não está sendo usada como a maior altura 1 
					maiorAlturaAux  = dadosPessoas[i][1]; 
					indMaiorAltura2 = i;
				}
			}
		}
		//Procura a  maior altura 3
		maiorAlturaAux = 0;
		for (int i=0; i<nrPessoas; i++) {
			if (dadosPessoas[i][1] > maiorAlturaAux) { //verifica se é maior do que a altura 3
				if ((i != indMaiorAltura1) && (i != indMaiorAltura2)){ //verifica se não está sendo usada como a maior altura 1 ou 2 
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
		System.out.println(" = QUESTÃO 3 = ");
		System.out.println("");
		
		//Registro dos números na matriz
		int[][] matrizNumeros = new int[4][5];
		for (int i=0; i<4; i++) {
			int somaNr = 0;
			for (int j=0; j<4; j++) {
				String strNum = JOptionPane.showInputDialog(null, "Informe o número: ");
				matrizNumeros[i][j] = Integer.parseInt(strNum);
				somaNr += matrizNumeros[i][j];
			}
			matrizNumeros[i][4] = somaNr; //armazena a soma na última coluna da linha
		}
		//Mostra os valores
		for (int i=0; i<4; i++) {
			System.out.println("Soma da linha " + i + ": " + matrizNumeros[i][4]);
		}
		
		
	}

}
