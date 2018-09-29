package vetores;
/*Escreva um programa para armazenar 10 números reais (informados pelo usuário).
Primeiro armazene os números e depois leia o vetor e imprima:
•O menor número
•O maior número
•A média dos números
•Os números menores do que a média
 */
import javax.swing.JOptionPane;

public class Aula04Exercicio01 {

	public static void main(String[] args) {

		int n=10; // tamanho do vetor
		double vetor[] = new double[n]; //declara o vetor e aloca espaço
		int i; //índice ou posição do vetor
		
		double maior, menor, media, soma=0;
		String entrada;
		
		//Lê e armazena os números no vetor
		for (i=0; i<=n-1; i++){
			entrada=JOptionPane.showInputDialog("Número");
			vetor[i]=Double.parseDouble(entrada);
		}
		
		//Atribui o primeiro valor do vetor as variáveis "maior" e "menor"
		maior=vetor[0];
		menor=vetor[0];
		
		//Lê o vetor e verifica os números maiores, menores e faz a soma
		for (i=0; i<=n-1; i++) {
			if (vetor[i] > maior)
				maior=vetor[i];
			if (vetor[i] < menor)
				menor=vetor[i];
			soma = soma+vetor[i];
		}
		
		// Calcula a média
		media = soma/n;
		
		//Imprime os valores maior e menor e  média
		System.out.println("Maior valor: "+maior);
		System.out.println("Menor valor: "+menor);
		System.out.println("Média: "+media);
		
		//Lê o vetor e imprime os números menores do que a média
		for (i=0; i<=n-1; i++)
			if (vetor[i]<media)
				System.out.println("Número menor do que a média: "+vetor[i]);
		
    }
}	