package revisaoAlgoritmosI;

import javax.swing.JOptionPane;

public class N2 {

	public static void main(String[] args) {
	  String entrada;
		int resultado,soma = 0,divisor = 0, numero;
	  for (int i=0; i<3; i++)   {
			entrada= JOptionPane.showInputDialog("Insira o número");
			divisor++;
			numero = Integer.parseInt(entrada);
			soma = soma+numero;
	  }
	  resultado = soma/divisor;
	  JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
	}

}
