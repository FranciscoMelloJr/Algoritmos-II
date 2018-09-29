package vetoresII;

import javax.swing.JOptionPane;

public class N1 {

	public static void main(String[] args) {

		String quantidade;
		int n;
		quantidade = JOptionPane.showInputDialog("Número de alunos: ");
		n = Integer.parseInt(quantidade);
		int i, divisor = 0;
		double maior = 0, menor = 10, soma = 0, media, nota[] = new double[n];
		String entrada, nome[] = new String[n], idade[] = new String[n];

		for (i = 0; i < n; i++) {
			nome[i] = JOptionPane.showInputDialog("Insira o nome completo do aluno: ");
			idade[i] = JOptionPane.showInputDialog("Insira a idade do aluno: ");
			entrada = JOptionPane.showInputDialog("Insira a nota do aluno: ");
			nota[i] = Double.parseDouble(entrada);
			soma = soma + nota[i];
			divisor++;
			if (nota[i] < menor)
				menor = nota[i];
			if (nota[i] > maior)
				maior = nota[i];
		}
		for (i = 0; i < n; i++) {
			if (nota[i] == menor)
				System.out.println("A menor nota foi de :" + nome[i]);
		}
		for (i = 0; i < n; i++) {
			if (nota[i] == maior)
				System.out.println("A maior nota foi de : " + nome[i]);
		}
		media = soma / divisor;
		System.out.println("Média das notas de todos os alunos: " + media);

		for (i = 0; i < n; i++)
			if (nome[i].equals("Fausto Silva"))
				System.out.println("Oh louco meu!");
			else
				System.out.println("Brincadeira!");

	}
}