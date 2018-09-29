package vetores;
/* Armazenar 10 n�meros em um vetor. Depois l� um n�mero e 
 * verifica se o n�mero est� presente ou n�o no vetor. 
 */

import javax.swing.JOptionPane;

public class Aula02Exercicio03 {

	public static void main(String[] args) {
		
		int i; // �ndice ou posi��o do vetor
		int n = 10; // tamanho do vetor
		int vetor[] = new int[n]; // declara e aloca espa�o para o vetor
		String entrada;
		int numero;
		boolean armazenado = false;
		
		// L� e armazena os n�meros no vetor
		for (i=0; i<=n-1; i++) {
			entrada = JOptionPane.showInputDialog("N�mero");
			vetor[i] = Integer.parseInt(entrada);
		}

		// L� um n�mero
		entrada = JOptionPane.showInputDialog("Digite um n�mero");
		numero = Integer.parseInt(entrada);
		
		//Verifica se o n�mero est� armazenado no vetor
		for (i=0; i<=n-1; i++) {
			if (numero == vetor[i])
				armazenado = true;	
		}
		
		//Imprime a mensagem
		if (armazenado)
			System.out.println("N�mero est� armazenado");
		else
			System.out.print("N�mero n�o est� armazenado");
	}
}
