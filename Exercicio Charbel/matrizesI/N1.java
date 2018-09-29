package matrizesI;

import javax.swing.JOptionPane;

public class N1 {

	public static void main(String[] args) {

		int divisor=0,linha=10, coluna=10,contador=0;
		double somador=0,matriz [][]= new double[linha][coluna];
		String entrada;
		
		for (int i=0;i<linha;i++) {
			for (int j=0;j<coluna;j++) {
				entrada = JOptionPane.showInputDialog("Número: ");
				matriz[i][j]=Double.parseDouble(entrada);
			}
		}
		for (int i=0;i<linha;i++) {
			for (int j=0;j<coluna;j++) {
				System.out.print(matriz[i][j]+"\t");
			}
				System.out.println();
		}
		for (int i=0;i<linha;i++) {
			for (int j=0;j<coluna;j++) {
				 somador += matriz[i][j];
			}
		}
				divisor = linha*coluna;
				System.out.println("Média aritmética: "+somador/divisor);
				somador = 0;
				for (int i=0;i<linha;i++) {
					for (int j=0;j<coluna;j++) {
						if	(i == j) {
							somador += matriz[i][j];
							contador++;
						}			
					}
				}
				System.out.println("Média diagonal principal: "+somador/contador);
	}
}