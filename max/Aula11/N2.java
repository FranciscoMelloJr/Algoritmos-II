package Aula11;

import javax.swing.JOptionPane;

public class N2 {

	public static String conceito(double nota) {

		String retorn;

		if (nota < 5)
			retorn = "D";
		else if (nota >= 5 & nota < 7)
			retorn = "C";
		else if (nota >= 7 & nota < 9)
			retorn = "B";
		else
			retorn = "A";

		return retorn;
	}

	public static void main(String[] args) {

		double media;

		media = Double.parseDouble(JOptionPane.showInputDialog("Média"));
		System.out.println(conceito(media));

	}
}