package tiposHeterogeneos;

import javax.swing.JOptionPane;

class Cliente {
	int codigo;
	String nome;
	String cpf;
	int telefone;
}

public class Aula13Exercicio01 {

	public static void InsereCliente (Cliente cliente[], int codigo) {
		cliente[codigo].codigo=codigo;
		cliente[codigo].nome=JOptionPane.showInputDialog("Nome");
		cliente[codigo].cpf=JOptionPane.showInputDialog("CPF");
		cliente[codigo].telefone=Integer.parseInt(JOptionPane.showInputDialog("telefone"));
	}

	public static void ImprimeClientes (Cliente cliente[], int n) {
		for (int i=0; i<=n-1; i++) {
			System.out.print(cliente[i].codigo+" ");
			System.out.print(cliente[i].nome+" ");
			System.out.print(cliente[i].cpf+" ");
			System.out.println(cliente[i].telefone);
		}	
	}
	
	public static void ConsultaCliente (Cliente cliente[], int codigo) {
		System.out.print(cliente[codigo].codigo+" ");
		System.out.print(cliente[codigo].nome+" ");
		System.out.print(cliente[codigo].cpf+" ");
		System.out.println(cliente[codigo].telefone);
		
	}

	
	public static void main(String[] args) {
		
		int n=10;
		int cd = 0;
		int op, id;
		Cliente c[] = new Cliente[n];
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Menu \n 1-Insere Cliente \n 2-Consulta Cliente \n 3-Imprime Clientes \n 4-Sair"));
			if (op == 1) {
					c[cd]=new Cliente();
					InsereCliente(c, cd);
					cd++;
	
			}
			if (op == 2){
				id = Integer.parseInt(JOptionPane.showInputDialog("Código do Cliente"));
				ConsultaCliente(c,id);
		}
			if (op == 3) 
					ImprimeClientes(c,cd);
		} while (op != 4);
		
	}
}
