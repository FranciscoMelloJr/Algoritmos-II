package tiposHeterogeneosI;

import javax.swing.JOptionPane;

class Pessoa {

	String nome;
	int idade;
	char sexo;
}

public class N1 {

	static void insereDados(Pessoa p[], int n) {

		for (int i = 0; i < n; i++) {
			p[i] = new Pessoa();
			p[i].nome = JOptionPane.showInputDialog("Nome");
			p[i].idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
			p[i].sexo = JOptionPane.showInputDialog("Sexo M ou F").charAt(0);

		}
	}

	static void mostraDados(Pessoa p[], int n) {

		double soma = 0;
		int c = 0;

		for (int i = 0; i < n; i++) {
			System.out.println(p[i].nome + " ");
			System.out.println(p[i].idade + " ");
			System.out.println(p[i].sexo + " ");
			if ((p[i].sexo == ('M') | (p[i].sexo == ('m')))) {
				soma += p[i].idade;
				c++;
			}
		}
		System.out.println("Mulheres com mais de 30 anos");
		for (int i = 0; i < n; i++) {
			if (((p[i].sexo == ('F') | (p[i].sexo == ('f')))) & (p[i].idade > 30)) {
				System.out.println(p[i].nome + " ");
				System.out.println(p[i].idade + " ");
				System.out.println(p[i].sexo + " ");
			}
		}
		if (soma != 0)
			System.out.println("Média de idade dos homens: " + soma / c);
	}

	public static void main(String[] args) {

		int n = 3;
		Pessoa pessoa[] = new Pessoa[n];

		insereDados(pessoa, n);
		mostraDados(pessoa, n);
	}
}