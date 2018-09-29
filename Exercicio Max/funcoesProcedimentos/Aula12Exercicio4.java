package funcoesProcedimentos;

import javax.swing.JOptionPane;

public class Aula12Exercicio4 {

	// Função para verificar o saldo 
	public static void saldo(double conta) {
		System.out.println("Saldo = "+conta);
	}
	
	// Função para realizar o depósito  
	public static double deposito(double valor, double conta) {
		double total;
		total = valor+conta;
		return total;
	}
	
	// Função para realizar o saque
	public static double saque(double valor, double conta) {
		double total;
		if (valor > conta) {  //verifica se o valor sacado é maior que o valor da conta
			System.out.println("Saldo insuficiente");
			return conta;
		}	
		total = conta - valor;
		return total;
	}
	
	// Programa principal
	public static void main(String[] args) {
		int op;
		double cc=0, v;  //variáveis para controlar o valor da conta e o valor de saque ou depósito
		
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog("Menu \n 1-Saldo \n 2-Depósito \n 3-Saque \n 4-Sair"));
			if (op!=4) {
				if (op==1)
					saldo(cc);
				else {
					v=Double.parseDouble(JOptionPane.showInputDialog("Valor"));
					if (op==2) {
						cc=deposito(v,cc);
					}	
					else {
						cc=saque(v,cc);
					}	
				}	
			}
		} while (op != 4);
	}
}
