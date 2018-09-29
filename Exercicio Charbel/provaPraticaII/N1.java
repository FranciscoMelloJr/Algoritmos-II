package provaPraticaII;

import javax.swing.JOptionPane;

public class N1 {

	public static void main(String[] args) {
		int mes1,k = 0, indmes = 0, i, j, linha = 4, coluna = 2;
		double matriz[][] = new double[linha][coluna];
		String entrada1, entrada;
		double somadormes1 = 0, maior = 0, somadormes = 0, somadorano = 0, somadorsemana = 0;

		for (i = 0; i < linha; i++) {
			somadormes = 0;
			for (j = 0; j < coluna; j++) {
				entrada = JOptionPane.showInputDialog("Vendas do mês " + (i + 1) + " Semana " + (j + 1));
				matriz[i][j] = Double.parseDouble(entrada);
				somadormes += matriz[i][j];
				if (somadormes > maior) {
					maior = somadormes;
					indmes = (i + 1);
				}
			}
			System.out.println("Total vendido no mês " + (i + 1) + " = R$" + somadormes);
		}
		System.out.println("O mês " + indmes + " vendeu mais, valor = " + maior);
		j = 0;
		do {
			for (i = 0; i < linha; i++) {
				somadorsemana += matriz[i][j];
			}
			System.out.println("Semana " + (j + 1) + " : R$" + somadorsemana);
			j++;
			somadorsemana = 0;
		} while (j < coluna);
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				somadorano += matriz[i][j];
			}
		}
		System.out.println("Total vendido no ano: R$" + somadorano);
		do {
			entrada1 = JOptionPane.showInputDialog("Insira o mês: ");
			mes1 = Integer.parseInt(entrada1);
			for (i = 0; i < linha; i++) {
				if (mes1 == (i + 1)) {
					for (j = 0; j < coluna; j++) {
						somadormes1 += matriz[i][j];
					}
					System.out.println("Soma do mês "+mes1 +" : R$"+ somadormes1);
				}
				somadormes1 = 0;
			}
			k++;
		} while (k < 2);

	}
}