package ProvaPraticaI;

import javax.swing.JOptionPane;

public class N1 {
	public static void main(String[] args) {
		int nr_alunos = 100;
		String[] vetor_nomes = new String[nr_alunos];
		int[] vetor_idades = new int[nr_alunos];
		double[] vetor_notas = new double[nr_alunos*3];
		int nr_notas = 0;
		
		//cadastra os dados dos alunos
		for (int i=0; i<nr_alunos; i++) { //alunos
			String nome = JOptionPane.showInputDialog(null, "Nome: ");
			vetor_nomes[i] = nome;
			int idade   = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade: "));
			vetor_idades[i] = idade;
			for (int j=0; j<3; j++) {//notas
				vetor_notas[nr_notas] = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota" + (j+1) + ": "));
				nr_notas++;
			}
			
		}
		
		//a
		double soma_notas = 0;
		for (int i=0; i<nr_notas; i++) {
			soma_notas += vetor_notas[i];
		}
		double media_geral = soma_notas / nr_notas;
		System.out.println("Média geral das notas: " + media_geral);
		
		//b
		double menor_nota = 11;
		int i_menor_nota = -1;
		double maior_nota = -1;
		int i_maior_nota = -1;
		for (int i=0; i<nr_notas; i++) {
			//encontra a menor nota
			if (vetor_notas[i] < menor_nota) {
				menor_nota = vetor_notas[i];
				i_menor_nota = i;
			}
			//encontra a maior nota
			if (vetor_notas[i] > maior_nota) {
				maior_nota = vetor_notas[i];
				i_maior_nota = i;
			}
		}
		int i_aluno_menor_nota = i_menor_nota / 3;
		int i_aluno_maior_nota = i_maior_nota / 3;
		System.out.println("Aluno com a menor nota: " + vetor_nomes[i_aluno_menor_nota]);
		System.out.println("Aluno com a maior nota: " + vetor_nomes[i_aluno_maior_nota]);
		
		//c
		int soma_maior_20 = 0;
		int conta_maior_20 = 0;
		for (int i=0; i<nr_alunos; i++) {
			if (vetor_idades[i] > 20) {
				int inicio_notas_aluno = i*3;
				int fim_notas_aluno = inicio_notas_aluno + 3; 
				for (int n=inicio_notas_aluno; n<fim_notas_aluno; n++) {
					soma_maior_20 += vetor_notas[n];
					conta_maior_20++;
				}
			}
		}
		double media_maior_20 = soma_maior_20 / conta_maior_20;
		System.out.println("Média dos alunos com mais de 20 anos: " + media_maior_20);
		
		System.out.println("-----------------");
		for (int i=0; i<nr_notas; i++) {
			System.out.println(vetor_notas[i]);
		}
	}
}
