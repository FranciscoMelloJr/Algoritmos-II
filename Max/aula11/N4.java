package aula11;

import javax.swing.JOptionPane;

public class N4 {

	static String nomeMes(int m) {
			
		String v[] = {"Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho",
				  "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		return v[m-1];
	}

	public static void main(String[] args) {

		int mes;
		
		mes = Integer.parseInt(JOptionPane.showInputDialog("M�s"));
		System.out.println(nomeMes(mes));
		
	}
}