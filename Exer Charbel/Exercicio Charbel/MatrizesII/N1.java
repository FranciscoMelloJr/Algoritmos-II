package MatrizesII;

import javax.swing.JOptionPane;

public class N1 {

	public static void main(String[] args) {

		int i = 0, j = 0, linha = 99, coluna = 5;
		String matriz[][] = new String[linha][coluna];

		for (i = 0; i < linha; i++) {
			j = 0;
			matriz[i][j] = JOptionPane.showInputDialog("Produtos comprados na segunda: ");
			if (matriz[i][j] == null || matriz[i][j].isEmpty()) {
				i = linha;
			}
		}
		for (i = 0; i < linha; i++) {
			j = 1;
			matriz[i][j] = JOptionPane.showInputDialog("Produtos comprados na terça: ");
			if (matriz[i][j] == null || matriz[i][j].isEmpty()) {
				i = linha;
			}
		}
		for (i = 0; i < linha; i++) {
			j = 2;
			matriz[i][j] = JOptionPane.showInputDialog("Produtos comprados na quarta: ");
			if (matriz[i][j] == null || matriz[i][j].isEmpty()) {
				i = linha;
			}
		}
		for (i = 0; i < linha; i++) {
			j = 3;
			matriz[i][j] = JOptionPane.showInputDialog("Produtos comprados na quinta: ");
			if (matriz[i][j] == null || matriz[i][j].isEmpty()) {
				i = linha;
			}
		}
		for (i = 0; i < linha; i++) {
			j = 4;
			matriz[i][j] = JOptionPane.showInputDialog("Produtos comprados na sexta: ");
			if (matriz[i][j] == null || matriz[i][j].isEmpty()) {
				i = linha;
			}
		}
		System.out.println("Produtos comprados durante a semana: ");
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				if (matriz[i][j] != null) {
					System.out.print(matriz[i][j] + " ");
				} else
					System.out.print("");
			}
		}
	}
}