package aula02;

import javax.swing.JOptionPane;

public class N4 {

	public static void main(String[] args) {

		int i, n = 3, contador = 0;
		String entrada;
		double venda[] = new double[n], compra[] = new double[n];

		for (i = 0; i < n; i++) {
			entrada = JOptionPane.showInputDialog("Preço de compra da " + (i + 1) + "ª" + " mercadoria: ");
			compra[i] = Double.parseDouble(entrada);
			entrada = JOptionPane.showInputDialog("Preço de venda da " + (i + 1) + "ª" + " mercadoria: ");
			venda[i] = Double.parseDouble(entrada);
		}
		for (i = 0; i < n; i++) {
			if (venda[i] < (compra[i] + compra[i] * 0.10))
				contador++;
		}
		System.out.println("Quantidade de mercadorias com lucro abaixo de 10%: " + contador);
		contador = 0;
		for (i = 0; i < n; i++) {
			if (venda[i] >= compra[i] * 1.10 & venda[i] <= compra[i] * 1.20)
				contador++;
		}
		System.out.println("Quantidade de mercadorias com lucro acima de 10% e abaixo de 20%: " + contador);
		contador = 0;
		for (i = 0; i < n; i++) {
			if (venda[i] > compra[i] * 1.20)
				contador++;
		}
		System.out.println("Quantidade de mercadorias com lucro acima de 20%: " + contador);
	}
}
