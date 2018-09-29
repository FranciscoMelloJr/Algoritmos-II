package vetores;
/* Escreva um programa que leia o nome e as notas
 * de duas avaliações de 5 alunos. Armazene em dois
 * vetores os nomes e as médias de cada aluno. 
 * Depois imprima as informações
 */
import javax.swing.JOptionPane;

public class Aula03Exercicio05 {

	public static void main(String[] args) {

		int n=5; //tamnho do vetor
		String nome[]=new String[n]; //declara o vetor de nomes
		double media[]=new double[n]; //declara o vetor da media
		int i; //índice ou posição dos vetores
		String entrada;
		
		double nota1,nota2;
		
		//Ler a armazenar as informações
		for (i=0; i<=n-1; i++) {
			entrada=JOptionPane.showInputDialog("Nome");
			nome[i]=entrada;
			entrada=JOptionPane.showInputDialog("Primeira nota");
			nota1=Double.parseDouble(entrada);
			entrada=JOptionPane.showInputDialog("Primeira nota");
			nota2=Double.parseDouble(entrada);
			
			media[i]=(nota1+nota2)/2;  //calcula e armazena a média
		}
		
		//Imprimir os valores armazenados
		for (i=0; i<=n-1; i++) 
			System.out.println("Nome: "+nome[i]+" Média: "+media[i]);
	}
}
