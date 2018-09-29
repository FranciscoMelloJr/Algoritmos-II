package vetoresI;

import javax.swing.JOptionPane;

public class N3 {

	public static void main(String[] args) {

		int n=2, i;
		double divisor = 0,soma = 0,maior=0,nota[]=new double [n];
		String nome[]=new String[n],sobrenome[]=new String[n], entrada;
		
		for (i=0; i<n; i++)  {
		nome[i]=JOptionPane.showInputDialog("Nome do aluno: ");
		sobrenome[i]=JOptionPane.showInputDialog("Sobrenome do aluno: ");
		entrada=JOptionPane.showInputDialog("Insira a nota do aluno: ");
		nota[i]=Double.parseDouble(entrada);
		soma=nota[i]+soma;
		divisor++;
		if (nota[i]>maior)
			maior=nota[i];
}
		double media;
		media=soma/divisor;
		for (i=0; i<n; i++)  
			System.out.println("Nome: "+nome[i]+" Sobrenome: "+sobrenome[i]+" Nota: "+nota[i]);
		System.out.println("Média das notas de todos os alunos: "+media);
		System.out.println("Maior nota: "+maior);
		System.out.println("Aprovados: ");
		for (i=0; i<n; i++)  {
			if (nota[i]>=7) 
				System.out.println("Nome: "+nome[i]+" Sobrenome: "+sobrenome[i]);	
		}
	}
}