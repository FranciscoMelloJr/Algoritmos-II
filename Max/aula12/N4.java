package aula12;

import javax.swing.JOptionPane;

public class N4 {
	
		public static void saldo(double conta) {
			System.out.println("Saldo = "+conta);
		}
		
		public static double deposito(double valor, double conta) {
			double total;
			total = valor+conta;
			return total;
		}
		
		public static double saque(double valor, double conta) {
			double total;
			if (valor > conta) {  
				System.out.println("Saldo insuficiente");
				return conta;
			}	
			total = conta - valor;
			return total;
		}
		

	public static void main(String[] args) {

		int op;
		double cc=0, v; 
		
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog("Menu \n 1-Saldo \n 2-Depósito \n 3-Saque \n 4-Sair"));
			switch (op) {
			case (1) : saldo(cc); break ;
			case (2) : v=Double.parseDouble(JOptionPane.showInputDialog("Valor"));
						cc=deposito(v,cc); break;
			case (3) : v=Double.parseDouble(JOptionPane.showInputDialog("Valor"));
						cc=saque(v,cc);	break;	
			}
		} while (op != 4);
	}
}
