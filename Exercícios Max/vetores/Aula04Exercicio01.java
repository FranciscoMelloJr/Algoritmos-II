package vetores;
/*Escreva um programa para armazenar 10 n�meros reais (informados pelo usu�rio).
Primeiro armazene os n�meros e depois leia o vetor e imprima:
�O menor n�mero
�O maior n�mero
�A m�dia dos n�meros
�Os n�meros menores do que a m�dia
 */
import javax.swing.JOptionPane;

public class Aula04Exercicio01 {

	public static void main(String[] args) {

		int n=10; // tamanho do vetor
		double vetor[] = new double[n]; //declara o vetor e aloca espa�o
		int i; //�ndice ou posi��o do vetor
		
		double maior, menor, media, soma=0;
		String entrada;
		
		//L� e armazena os n�meros no vetor
		for (i=0; i<=n-1; i++){
			entrada=JOptionPane.showInputDialog("N�mero");
			vetor[i]=Double.parseDouble(entrada);
		}
		
		//Atribui o primeiro valor do vetor as vari�veis "maior" e "menor"
		maior=vetor[0];
		menor=vetor[0];
		
		//L� o vetor e verifica os n�meros maiores, menores e faz a soma
		for (i=0; i<=n-1; i++) {
			if (vetor[i] > maior)
				maior=vetor[i];
			if (vetor[i] < menor)
				menor=vetor[i];
			soma = soma+vetor[i];
		}
		
		// Calcula a m�dia
		media = soma/n;
		
		//Imprime os valores maior e menor e  m�dia
		System.out.println("Maior valor: "+maior);
		System.out.println("Menor valor: "+menor);
		System.out.println("M�dia: "+media);
		
		//L� o vetor e imprime os n�meros menores do que a m�dia
		for (i=0; i<=n-1; i++)
			if (vetor[i]<media)
				System.out.println("N�mero menor do que a m�dia: "+vetor[i]);
		
    }
}	