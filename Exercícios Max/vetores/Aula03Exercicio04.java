package vetores;
/* Escreva um programa que leia a altura de 10 atletas. 
 * O programa deve armazenar em um vetor a altura 
 * daqueles atletas que tenham altura maior que a média.
 */
import javax.swing.JOptionPane;

public class Aula03Exercicio04 {

	public static void main(String[] args) {

		int n=10; // tamanho do vetor
		double altura[]=new double[n]; // declara o vetor e aloca espaço
		double alturaMedia[]=new double[n]; //declara outro vetor
		int i; //índice ou posição do vetor
		String entrada;
		
		double media, soma=0;
		
		//Ler e armazenar as alturas
		for (i=0; i<=n-1; i++) {
			entrada=JOptionPane.showInputDialog("Altura");
			altura[i]=Double.parseDouble(entrada);
			soma=soma+altura[i];    //soma todas as alturas
		}
		
		media = soma/n;   //Calcula a média das alturas
		
		//Verificar as alturas maiores que a média e armazenar em outro vetor
		for (i=0; i<=n-1; i++) {
			if (altura[i] > media)
				alturaMedia[i]=altura[i];
		}
		
		//Mostra as alturas maiores que a média
		for (i=0; i<=n-1; i++)
			if (alturaMedia[i] != 0)
				System.out.println(alturaMedia[i]);
	}
}
