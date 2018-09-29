package funcoesProcedimentosIII;

import javax.swing.JOptionPane;

public class N2 {

	static double somaVetor (double v []) {
		int i, soma=0;
		for (i=0; i<v.length; i++)
			soma +=v[i];
		return soma;
			
	}
	
	public static void main(String[] args) {

		int i,n=10;
		double vetor [] = new double [n];	
		
		for (i=0;i<n;i++)
		vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Número"));
		System.out.println(somaVetor(vetor));
	}
}
