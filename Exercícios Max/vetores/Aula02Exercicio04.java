package vetores;
/* Amazenar em dois vetores o pre�o de compra e venda
 * de 5 produtos. O programa verifica os pre�os e imprime 
 * as seguintes mensagens sobre a propor��o dos pre�os:
 * - Lucro menor do que 10%
 * - Lucro maior ou igual a 10% e menor ou igual a 20%
 * - Lucro superior a 20%  
 */
import javax.swing.JOptionPane;

public class Aula02Exercicio04 {

	public static void main(String[] args) {
		int i; // �ndice ou posi��o do vetor
		int n=5; // tamanho do vetor
		double precoCompra[]=new double[n]; //declara e aloca espa�o para o vetor
		double precoVenda[]=new double[n]; //declara e aloca espa�o para o vetor
		String entrada;
		
		double diferenca, percentual; //variaveis para o c�lcula da propor��o
		
		//L� a armazena os pre�os nos vetores
		for (i=0; i<=n-1; i++) {
			entrada=JOptionPane.showInputDialog("Pre�o de Compra");
			precoCompra[i]=Integer.parseInt(entrada);
			entrada=JOptionPane.showInputDialog("Pre�o de Venda");
			precoVenda[i]=Integer.parseInt(entrada);
		}

		//Verifica a propor��o entre os pre�os
		for (i=0; i<=n-1; i++) {
			diferenca = precoVenda[i]-precoCompra[i];
			percentual = (diferenca/precoCompra[i])*100;
			if (percentual < 10)
				System.out.println("Lucro menor do que 10%");
			else
				if (percentual > 20)
					System.out.println("Lucro superior a 20%");
				else 
					System.out.println("Lucro maior ou igual a 10% e menor ou igual a 20%");
		}
	}

}
