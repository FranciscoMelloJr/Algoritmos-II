package Aula11;

import javax.swing.JOptionPane;

public class N1 {

	public static int idade (int corrente, int nascimento) {
		
		return (corrente - nascimento);
		
	}
	
	public static void main(String[] args) {

		int x,y;
		
		x=Integer.parseInt(JOptionPane.showInputDialog("Ano atual"));
		y=Integer.parseInt(JOptionPane.showInputDialog("Ano nascimento"));
		System.out.println(idade(x,y));
	}
}