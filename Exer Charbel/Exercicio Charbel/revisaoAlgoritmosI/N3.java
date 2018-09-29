package revisaoAlgoritmosI;

import javax.swing.JOptionPane;

public class N3 {

	public static void main(String[] args) {
	  String entrada;
		int quantidade,resultado,soma = 0,divisor = 0, numero;
		entrada= JOptionPane.showInputDialog("Quantos números irá digitar? ");
		quantidade= Integer.parseInt(entrada);
		for (int i=0; i<quantidade; i++)   {
			entrada= JOptionPane.showInputDialog("Insira o número");
			divisor++;
			numero= Integer.parseInt(entrada);
			soma = soma+numero;
	  }
	  resultado = soma/divisor;
	  JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
	}

}