package vetoresI;

import javax.swing.JOptionPane;

public class N1 {

	public static void main(String[] args) {
	
		int n=2, i;
		String nome[]=new String[n],sobrenome[]=new String[n];
		
		for (i=0; i<n; i++)  {
		nome[i]=JOptionPane.showInputDialog("Nome do aluno: ");
		sobrenome[i]=JOptionPane.showInputDialog("Sobrenome do aluno: ");
}
		for (i=0; i<n; i++)  {
			System.out.println("Nome: "+nome[i]+" Sobrenome: "+sobrenome[i]);
		}
	}
}