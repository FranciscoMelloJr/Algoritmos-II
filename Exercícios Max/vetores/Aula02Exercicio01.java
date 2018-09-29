package vetores;
/* Programa para ler um vetor de 10 n�meros e 
 * montar outro vetor com os valores do primeiro
 * multiplicados por 3.
 */

import javax.swing.JOptionPane;

public class Aula02Exercicio01 {

	public static void main(String[] args) {
		
		int i;  // �ndice ou posi��o do vetor
		int n = 10; // tamanho do vetor
		int vetor1[]=new int[n];  // declara��o e aloca��o do primeiro vetor 
		String nro;
		
		// Inserir valores no vetor
		for (i=0; i<=n-1; i++) {
			nro = JOptionPane.showInputDialog("N�mero");
			vetor1[i]=Integer.parseInt(nro);
		}
		
        // Criar outro vetor para armazenar os valores multiplicados 
		int vetor2[]=new int[n]; // declara��o e aloca��o do segundo vetor 
		
		// Multiplicar e armazenar
		for (i=0; i<=n-1; i++) 
			vetor2[i]=vetor1[i]*3;
		    
		// Imprimir o segundo vetor
		for (i=0; i<=n-1; i++)
			System.out.println(vetor2[i]);
            
		
	}
}
