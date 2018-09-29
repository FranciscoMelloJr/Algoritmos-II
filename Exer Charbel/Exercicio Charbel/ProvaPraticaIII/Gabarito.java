package ProvaPraticaIII;
import javax.swing.JOptionPane;

class Livro {
	String autor;
	String titulo;
	String editora;
	int ano;
}

class DVD {
	String titulo;
	String gravadora;
	int duracao;
}


public class Gabarito {

	public static void main(String[] args) {
		//QUESTÃO 1
		int n1 = 3;
		int n2 = 2;
		int resultado = somaNumeros(n1, n2);
		System.out.println("Resultado da multiplicação de " + n1 + " por " + n2 + ": " + resultado);
		
		
		//---------------------------------------------------
		//QUESTÃO 2
		int nr_livros = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a qtde de Livros a cadastrar:"));
		int nr_dvds = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a qtde de DVDs a cadastrar:"));
		
		Livro[] vetor_livros = new Livro[nr_livros];
		DVD[] vetor_dvds = new DVD[nr_dvds];
		
		//Cadastra os livros
		for (int i=0; i<nr_livros; i++) {
			vetor_livros[i] = new Livro();
			vetor_livros[i].autor = JOptionPane.showInputDialog(null, "Informe o autor do livro " + (i+1) + ":");
			vetor_livros[i].titulo = JOptionPane.showInputDialog(null, "Informe o título do livro " + (i+1) + ":");
			vetor_livros[i].editora = JOptionPane.showInputDialog(null, "Informe a editora do livro " + (i+1) + ":");
			vetor_livros[i].ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano de publicação do livro " + (i+1) + ":"));
		}
		
		//Cadastra os DVDs
		for (int i=0; i<nr_dvds; i++) {
			vetor_dvds[i] = new DVD();
			vetor_dvds[i].titulo = JOptionPane.showInputDialog(null, "Informe o título do DVD " + (i+1) + ":");
			vetor_dvds[i].gravadora = JOptionPane.showInputDialog(null, "Informe a gravadora do DVD " + (i+1) + ":");
			vetor_dvds[i].duracao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a duração do DVD (em minutos) " + (i+1) + ":"));
		}
		
		//Mostra o cadastro
		System.out.println();
		System.out.println("Livros cadastrados:");
		mostraLivros(vetor_livros);
		
		System.out.println();
		System.out.println("DVDs cadastrados:");
		mostraDVDs(vetor_dvds);
		
		//---------------------------------------------------
		//QUEST�O 3
		
		//Invoca os m�todos para ordenar os vetores
		ordena_livro_bubble(vetor_livros);
		ordena_dvd_bubble(vetor_dvds);
		
		//Mostra o cadastro ordenado
		System.out.println();
		System.out.println("Livros cadastrados (ordenados por autor):");
		mostraLivros(vetor_livros);
		
		System.out.println();
		System.out.println("DVDs cadastrados (ordenados por título):");
		mostraDVDs(vetor_dvds);
	}

	
	static void ordena_livro_bubble(Livro[] vetor_orig) {
		for (int i = 0; i < vetor_orig.length; i++) {
			for (int j = 0; j < vetor_orig.length - 1; j++) {
				if (vetor_orig[j].autor.compareTo(vetor_orig[j+1].autor) > 0) {
					Livro aux = vetor_orig[j+1];
					vetor_orig[j+1] = vetor_orig[j];
					vetor_orig[j] = aux;
				}
			}
		}
	}
	
	private static void ordena_dvd_bubble(DVD[] vetor_orig) {
		for (int i = 0; i < vetor_orig.length; i++) {
			for (int j = 0; j < vetor_orig.length - 1; j++) {
				if (vetor_orig[j].titulo.compareTo(vetor_orig[j+1].titulo) > 0) {
					DVD aux = vetor_orig[j+1];
					vetor_orig[j+1] = vetor_orig[j];
					vetor_orig[j] = aux;
				}
			}
		}
	}
	
	private static void mostraLivros(Livro[] vetor_livros) {
		for (int i = 0; i < vetor_livros.length; i++) {
			System.out.println("Livro " + (i+1));
			System.out.print("Autor:" + vetor_livros[i].autor);
			System.out.print("   Título:" + vetor_livros[i].titulo);
			System.out.print("   Editora:" + vetor_livros[i].editora);
			System.out.println("   Ano de publicação:" + vetor_livros[i].ano);
			System.out.println();
		}
	}

	private static void mostraDVDs(DVD[] vetor_dvds) {
		for (int i = 0; i < vetor_dvds.length; i++) {
			System.out.println("DVD " + (i+1));
			System.out.print("   Título:" + vetor_dvds[i].titulo);
			System.out.print("   Gravadora:" + vetor_dvds[i].gravadora);
			System.out.println("   Duração:" + vetor_dvds[i].duracao);
			System.out.println();
		}
	}

	//Questão 1
	private static int somaNumeros(int n1, int n2) {
		if (n2 > 0) {
			return n1 + somaNumeros(n1, n2-1);
		} else {
			return 0;
		}
	}

}
