package funcoesProcedimentos;

import javax.swing.JOptionPane;

public class Aula12Exercicio03 {

	public static double soma(double n1, double n2) {
		return n1+n2;
	}
	
	public static double subtrai(double n1, double n2) {
		return n1-n2;
	}

	public static double multiplica(double n1, double n2) {
		return n1*n2;
	}
	public static double divisao(double n1, double n2) {
		return n1/n2;
	}


	public static void main(String[] args) {

		int op;
		double v1, v2;
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog("Menu \n 1-Adi��o \n 2-Subtra��o \n 3-Multiplica��o \n 4-Divis�o \n 5-Sair"));
			if (op!=5) {
				v1=Double.parseDouble(JOptionPane.showInputDialog("Primeiro n�mero"));
				v2=Double.parseDouble(JOptionPane.showInputDialog("Segundo n�mero"));
				if (op==1)
					System.out.println(soma(v1,v2));
				if (op==2)
					System.out.println(subtrai(v1,v2));
				if (op==3)
					System.out.println(multiplica(v1,v2));
				if (op==4)
					System.out.println(divisao(v1,v2));
			}
		} while (op!=5);		
	}
}
