package revisaoAlgoritmosI;

import javax.swing.JOptionPane;
public class N1 {

	public static void main(String[] args) {
		
		String nome , nome1;
		nome = JOptionPane.showInputDialog("Insira o seu nome: ");
		nome1 = JOptionPane.showInputDialog("Insira o seu sobrenome: ");
		
		if  ( nome.equals("Sergio") | nome.equals("S�rgio") & nome1.equals("Malandro")) 
			JOptionPane.showMessageDialog(null, "i�i�");
		  else {
		JOptionPane.showMessageDialog(null, "O seu nome completo �: "+nome+" "+nome1);
		}
	}

}
