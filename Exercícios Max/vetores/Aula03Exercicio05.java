package vetores;
/* Escreva um programa que leia o nome e as notas
 * de duas avalia��es de 5 alunos. Armazene em dois
 * vetores os nomes e as m�dias de cada aluno. 
 * Depois imprima as informa��es
 */
import javax.swing.JOptionPane;

public class Aula03Exercicio05 {

	public static void main(String[] args) {

		int n=5; //tamnho do vetor
		String nome[]=new String[n]; //declara o vetor de nomes
		double media[]=new double[n]; //declara o vetor da media
		int i; //�ndice ou posi��o dos vetores
		String entrada;
		
		double nota1,nota2;
		
		//Ler a armazenar as informa��es
		for (i=0; i<=n-1; i++) {
			entrada=JOptionPane.showInputDialog("Nome");
			nome[i]=entrada;
			entrada=JOptionPane.showInputDialog("Primeira nota");
			nota1=Double.parseDouble(entrada);
			entrada=JOptionPane.showInputDialog("Primeira nota");
			nota2=Double.parseDouble(entrada);
			
			media[i]=(nota1+nota2)/2;  //calcula e armazena a m�dia
		}
		
		//Imprimir os valores armazenados
		for (i=0; i<=n-1; i++) 
			System.out.println("Nome: "+nome[i]+" M�dia: "+media[i]);
	}
}
