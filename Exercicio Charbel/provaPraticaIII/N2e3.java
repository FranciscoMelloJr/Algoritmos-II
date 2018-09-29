package provaPraticaIII;

import javax.swing.JOptionPane;

	class bluRay {
		String titulo;
		String gravadora;
		int duracao;
	}

	class livros {
		String autor;
		String titulo;
		String editora;
		int ano;
	}

	/*Solução da questão 2 e 3*/
	
		public class N2e3 {

			static void insereD(bluRay DVD[], int Dqnt) {

				for (int i = 0; i < Dqnt; i++) {
					DVD[i].titulo = JOptionPane.showInputDialog("Titulo (DVD)");
					DVD[i].gravadora = JOptionPane.showInputDialog("Gravadora (DVD)");
					DVD[i].duracao = Integer.parseInt(JOptionPane.showInputDialog("Duração (DVD)"));
				}
			}
			static void insereL(livros Livro[], int Lqnt) {

				for (int i = 0; i < Lqnt; i++) {
					Livro[i].autor = JOptionPane.showInputDialog("Autor (Livro)");
					Livro[i].titulo = JOptionPane.showInputDialog("Titulo (Livro)");
					Livro[i].editora = JOptionPane.showInputDialog("Editora (Livro)");
					Livro[i].ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de publicação (Livro)"));
				}
			}
			
			static void imprimeD (bluRay DVD[], int Dqnt) {
				
				for (int i=0; i<Dqnt; i++) {
					System.out.println("Título do filme: "+DVD[i].titulo+" ");
					System.out.println("Gravadora: "+DVD[i].gravadora+" ");
					System.out.println("Duração"+DVD[i].duracao+" ");
				}
			}	
			
			static void imprimeL (livros Livro[], int Lqnt) {
				
				for (int i=0; i<Lqnt; i++) {
					System.out.println("Autor do livro: "+Livro[i].autor+" ");
					System.out.println("Título do livro: "+Livro[i].titulo+" ");
					System.out.println("Editora: "+Livro[i].editora+" ");
					System.out.println("Ano de publicação: "+Livro[i].ano+" ");
				}
			}	
			
		static void BubbleD(bluRay DVD [], int Dqnt) {
				for (int i = 0; i < DVD.length; i++) {
				for (int j = 0; j < DVD.length - 1; j++) {
					String titulo1 = DVD[j].titulo;
					String titulo2 = DVD[j+1].titulo;
					int resultado = titulo1.compareTo(titulo2);
					String aux = "";	
						if (resultado >0 ) {
							aux = DVD[j+1].titulo;
							DVD[j+1].titulo = DVD[j].titulo;
							DVD[j].titulo=aux;				
					}
				}
			}
		}
		static void BubbleL(livros Livro [], int Lqnt) {
			for (int i = 0; i < Livro.length; i++) {
			for (int j = 0; j < Livro.length - 1; j++) {
				String titulo1 = Livro[j].autor;
				String titulo2 = Livro[j+1].autor;
				int resultado = titulo1.compareTo(titulo2);
				String aux = "";	
					if (resultado >0 ) {
						aux = Livro[j+1].autor;
						Livro[j+1].autor = Livro[j].autor;
						Livro[j].autor=aux;				
				}
			}
		}
	}
		
			public static void main(String[] args) {

				int qntL, qntD;

				qntL = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de livros"));
				qntD = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de DVD's"));

				bluRay d[] = new bluRay[qntD];
				livros l[] = new livros[qntL];
				
				for (int i = 0; i < qntD; i++)
					d[i] = new bluRay();
				for (int i = 0; i < qntL; i++)
					l[i] = new livros();

				insereD(d,qntD);
				insereL(l,qntL);
				imprimeD(d,qntD);
				imprimeL(l,qntL);
			System.out.println("-----Ordenados-----");
				BubbleD(d,qntD);
				BubbleL(l,qntL);
				imprimeD(d,qntD);
				imprimeL(l,qntL);
			}
		}