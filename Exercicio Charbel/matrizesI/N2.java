package matrizesI;

import javax.swing.JOptionPane;

public class N2 {

	public static void main(String[] args) {

		int i, j = 0, linha = 3, coluna = 5;
		String busca, entrada, nomes[] = new String[linha];
		double buscasomador = 0, mediamenor, mediamaior, media, maior, menor, somador = 0,
				notas[][] = new double[linha][coluna];

		for (i = 0; i < linha; i++) {
			nomes[i] = JOptionPane.showInputDialog("Nome do aluno " + (i + 1));
		}
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				entrada = JOptionPane.showInputDialog((j + 1) + "ª nota do aluno " + (i + 1));
				notas[i][j] = Double.parseDouble(entrada);
			}
		}
		mediamenor = 11;
		mediamaior = -1;
		for (i = 0; i < linha; i++) {
			somador = 0;
			System.out.print(nomes[i] + " - ");
			for (j = 0; j < coluna; j++) {
				System.out.print(notas[i][j]);
				somador += notas[i][j];
				if (j != (coluna - 1)) {
					System.out.print(" , ");
				} else {
					media = somador / coluna;
					System.out.println(" = Média: " + media);
					if (media > mediamaior) {
						mediamaior = media;
					}
					if (media < mediamenor) {
						mediamenor = media;
					}
				}
			}
		}
		maior = -1;
		menor = 11;
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				if (notas[i][j] > maior)
					maior = notas[i][j];
				if (notas[i][j] < menor)
					menor = notas[i][j];
			}
		}
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				if (menor == notas[i][j]) {
					System.out.println("Aluno com a menor nota: " + nomes[i] + " - " + menor);
				}
				if (maior == notas[i][j]) {
					System.out.println("Aluno com a maior nota: " + nomes[i] + " - " + maior);
				}
				somador = 0;
			}
		}
		media = 0;
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				somador += notas[i][j];
				media = somador / coluna;
			}
			if (mediamenor == media) {
				System.out.println("Aluno com a menor média: " + nomes[i] + " - " + mediamenor);
			}
			if (mediamaior == media) {
				System.out.println("Aluno com a maior média: " + nomes[i] + " - " + mediamaior);
			}
			somador = 0;
		}

		int indBusca = -1;
		do {
			busca = JOptionPane.showInputDialog("Insira o nome do aluno: ");
			while (busca == null || busca.isEmpty()) {
				busca = JOptionPane.showInputDialog("Insira um nome válido: ");
			}
			for (i = 0; i < linha; i++) {
				if (nomes[i].equals(busca)) {
					System.out.print("Notas do aluno: ");
					indBusca = 1;
					for (j = 0; j < coluna; j++) {
						System.out.print(notas[i][j]);
						buscasomador += notas[i][j];
						if (j != coluna - 1) {
							System.out.print(" , ");
						}
					}
					System.out.println(" = Média: " + buscasomador / coluna);
				}
			}
		} while (indBusca == -1);
	}
}