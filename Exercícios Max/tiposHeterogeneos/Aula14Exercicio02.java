package tiposHeterogeneos;

import javax.swing.JOptionPane;

// Classe Funcionario
class Funcionario {
	String nome;
	String depto;
	double horasTrabalho;
	double salarioHora;
}

public class Aula14Exercicio02 {

	// Procedimento para cadastro dos funcionários
	public static void cadastraFuncionario(Funcionario func[], int n) {
		for (int i=0; i<=n-1; i++) {
			func[i] = new Funcionario();
			func[i].nome=JOptionPane.showInputDialog("Nome");
			func[i].depto=JOptionPane.showInputDialog("Departamento");
			func[i].horasTrabalho=Double.parseDouble(JOptionPane.showInputDialog("Horas Trabalhadas"));
			func[i].salarioHora=Integer.parseInt(JOptionPane.showInputDialog("Salário Hora"));
		}
	}
	
	// Procedimento para mostrar todos os funcionários
	public static void mostraFuncionario(Funcionario func[], int n) {
		for (int i=0; i<=n-1; i++) {
			System.out.print(func[i].nome+" ");
			System.out.print(func[i].depto+" ");
			System.out.print(func[i].horasTrabalho+" ");
			System.out.println(func[i].salarioHora);
		}
	}
	
	// Função para retornar o salario mensal
	public static double calculaSalarioMensal(Funcionario func[], int n) {

		return func[n].horasTrabalho*func[n].salarioHora;
	}
	
	// Programa Principal
	public static void main(String[] args) {

		int n=3;
		Funcionario funcionario[] = new Funcionario[n];
		
		cadastraFuncionario(funcionario, n);
		mostraFuncionario(funcionario, n);

		for (int i=0; i<=n-1; i++) {
			System.out.print(funcionario[i].nome+" ");
			System.out.print(funcionario[i].horasTrabalho+" ");
			System.out.print(funcionario[i].salarioHora+" ");
			System.out.println(calculaSalarioMensal(funcionario, i));
		}	
	}
}
