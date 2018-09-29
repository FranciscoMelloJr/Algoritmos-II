package vetores;
/* Armazenar 10 números em um vetor. Depois lê um número e 
 * verifica se o número está presente ou não no vetor. 
 */

import javax.swing.JOptionPane;

public class Aula02Exercicio03 {

	public static void main(String[] args) {
		
		int i; // índice ou posição do vetor
		int n = 10; // tamanho do vetor
		int vetor[] = new int[n]; // declara e aloca espaço para o vetor
		String entrada;
		int numero;
		boolean armazenado = false;
		
		// Lê e armazena os números no vetor
		for (i=0; i<=n-1; i++) {
			entrada = JOptionPane.showInputDialog("Número");
			vetor[i] = Integer.parseInt(entrada);
		}

		// Lê um número
		entrada = JOptionPane.showInputDialog("Digite um número");
		numero = Integer.parseInt(entrada);
		
		//Verifica se o número está armazenado no vetor
		for (i=0; i<=n-1; i++) {
			if (numero == vetor[i])
				armazenado = true;	
		}
		
		//Imprime a mensagem
		if (armazenado)
			System.out.println("Número está armazenado");
		else
			System.out.print("Número não está armazenado");
	}
}
