package tiposHeterogeneos;
import javax.swing.JOptionPane;

// Classe Pessoa
class Pessoa {
	String sexo;
	int idade;
	String resposta; 
}

public class Aula14Exercicio01 {

	// Insere os dados
	public static void CadastraPessoa(Pessoa pessoa[], int n) {
		for (int i=0; i<=n-1; i++) {
			pessoa[i] = new Pessoa();
			pessoa[i].sexo=JOptionPane.showInputDialog("Sexo");
			pessoa[i].idade=Integer.parseInt(JOptionPane.showInputDialog("Idade"));
			pessoa[i].resposta=JOptionPane.showInputDialog("Resposta");
		}
	}

	// Contabiliza o número de repostas positivas e negativas
	public static void Respostas(Pessoa pessoa[], int n){
		int cSim=0, cNao=0;
		
		for (int i=0; i<=n-1; i++) {
			if (pessoa[i].resposta.equals("Sim"))
				cSim++;
			else
				cNao++;
		}
		System.out.println("Responderam Sim = "+cSim+" Responderam Não = "+cNao);
	}
	
	// Calcula a média de idade das pessoas
	public static double Idade(Pessoa pessoa[], int n) {
		int soma=0;
		
		for (int i=0; i<=n-1; i++) 
			soma = soma + pessoa[i].idade;
		
		return soma/n-1;
	}
	
	// Programa Principal
	public static void main(String[] args) {

		int n = 5;
		Pessoa p[] = new Pessoa[n];

		CadastraPessoa(p, n);
		Respostas(p, n);
		System.out.println("A média de idade = "+Idade(p, n));
	}
}
