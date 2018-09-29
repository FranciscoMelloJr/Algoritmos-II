package revisaoAlgoritmosI;

import javax.swing.JOptionPane;

public class N4 {

	public static void main(String[] args) {
	  String entrada;
		int resultado,soma=0,divisor=0, numero=0;
		while (numero>=0) {
			entrada = JOptionPane.showInputDialog("Insira o número");
			numero= Integer.parseInt(entrada);
			if (numero>=0) 
				divisor++;
			soma = soma+numero;
			}
			resultado = soma/divisor;
		JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
 	}
}
