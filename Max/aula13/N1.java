package aula13;

import javax.swing.JOptionPane;

class Professor {
	String nome;
	String curso;
	double horario;
}

public class N1 {

	static void insereDados(Professor professor[], int n) {

		for (int i = 0; i < n; i++) {
			professor[i].nome = JOptionPane.showInputDialog("Nome");
			professor[i].curso = JOptionPane.showInputDialog("Curso");
			professor[i].horario = Double.parseDouble(JOptionPane.showInputDialog("Carga Horária"));
		}
	}

	static void imprimeDados(Professor professor[], int n) {

		for (int i = 0; i < n; i++) {
			System.out.println(professor[i].nome + " ");
			System.out.println(professor[i].curso + " ");
			System.out.println(professor[i].horario + " ");
		}
	}

	public static void main(String[] args) {

		int n = 3;
		Professor p[] = new Professor[n];
		for (int i = 0; i < n; i++)
			p[i] = new Professor();

		insereDados(p, n);
		imprimeDados(p, n);
	}
}