package funcoesProcedimentos;

import javax.swing.JOptionPane;
public class Exemplo03 {

	public static double media(double n1, double n2, double n3) {

		double m; 
		
		m = (n1+n2+n3)/3;
		return m;
	}
	
	public static void main(String[] args) {

		double nota1, nota2, nota3;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3"));
		
		System.out.println("A média é "+media(nota1,nota2,nota3));
	}
}
