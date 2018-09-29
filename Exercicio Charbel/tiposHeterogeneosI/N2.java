package tiposHeterogeneosI;

import javax.swing.JOptionPane;

class Aluno {

	String nome;
	int idade;
	char sexo;

}

class Escola {

	int codigo;
	String nome;
	String data;
	Aluno [] alunos;

}

public class N2 {

	static void ImprimeDados(Escola escola[]) {

		for (int i = 0; i < E; i++) {
			if (i!=0)
				System.out.println();
			System.out.println("Código da escola: " + escola[i].codigo);
			System.out.println("Nome da escola: " + escola[i].nome);
			System.out.println("Data de fundação da escola: " + escola[i].data);
			System.out.println("Alunos desta escola: ");
			for (int j = 0; j < A; j++) {
				System.out.print("Nome: " + escola[i].alunos[j].nome + ". ");
				System.out.print("Idade: " + escola[i].alunos[j].idade + " ");
				System.out.println("Sexo: " + escola[i].alunos[j].sexo + " ");
				}	System.out.println("Média da idade dos alunos do sexo masculino da escola "+escola[i].nome+": "+media[i]);
				System.out.println();
	            System.out.println("-----------------------------------------------------------------------");
		}
		System.out.println("Quantidade de alunas em todas as escolas: "+qntF);
        System.out.println("-----------------------------------------------------------------------");
	}

	static void BuscaAluno(Escola escola[], String entrada) {

		int ind=0;
		for (int i = 0; i < E; i++) 
			for (int j = 0; j < A; j++)
				if (entrada.equals(escola[i].alunos[j].nome)) {
					System.out.println("Aluno cadastrado na escola: " + escola[i].nome);
					ind++;
				}
			if (ind==0)	
			System.out.println("Aluno não cadastrado! ");
	}

	static void Sort(Escola []escola){
    	for (int i = 0; i < E; i++) {
    		for (int j = 0; j < E-1; j++) {
    			if (escola[j].nome.compareTo(escola[j+1].nome) > 0) {
    				Escola aux = escola[j+1];
    				escola[j+1] = escola[j];
    				escola[j]= aux;
    			}  
			}		  	
		}
    	for (int i = 0; i < E; i++) {
			for (int j = 0; j < A; j++) {
				for (int k = 0; k < A-1; k++) {
					if (escola[i].alunos[k].idade > escola[i].alunos[k+1].idade) {
						Aluno aux = escola[i].alunos[k+1]; 
						escola[i].alunos[k+1] = escola[i].alunos[k];
						escola[i].alunos[k] = aux;
					}	
				}				
			}
    	}
    }
	
	static void ImprimeOrdenado(Escola escola[]) {
		System.out.println("--------------------------------Ordenado--------------------------------");
    	for (int i = 0; i < E; i++) {
    		if (i!=0)
    			System.out.println();
    		System.out.println("Código da escola: "+escola[i].codigo);
            System.out.println("Nome da escola: "+escola[i].nome);
            System.out.println("Data de fundação da escola: "+escola[i].data);
            System.out.println("Alunos desta escola: ");
            for (int j = 0; j < A; j++) {
                System.out.print("Nome: "+escola[i].alunos[j].nome);
                System.out.print("Idade: "+escola[i].alunos[j].idade);
                System.out.println("Sexo: "+escola[i].alunos[j].sexo);
            }
            System.out.println("Média da idade dos alunos do sexo masculino escola é: "+media[i]);
            System.out.println();
            System.out.println("-----------------------------------------------------------------------");
        }
        System.out.println("Quantidade de alunas em todas escolas: "+qntF);
        System.out.println("----------------------------------------------------------------------------");
    }
	
	static int E=3, A=5;
	static int media[]= new int [E];
	static int qntF=0;
	
	public static void main(String[] args) {
		
		Escola escola[] = new Escola[E];
			
		 escola[0]=new Escola();
	     escola[0].codigo=11111;
	     escola[0].nome="SATC";
	     escola[0].data="11/11/1991";
	     
	     escola[1]=new Escola();
	     escola[1].codigo=22222;
	     escola[1].nome="Unisul";
	     escola[1].data="22/02-1992";
	     
	     escola[2]=new Escola();
	     escola[2].codigo=33333;
	     escola[2].nome="Cedup";
	     escola[2].data="03-03-1993";
	     
	     escola[0].alunos = new Aluno [A];
	     escola[1].alunos = new Aluno [A];
	     escola[2].alunos = new Aluno [A];
	     
	     for (int i = 0; i < E; i++)  {
	    	 escola[i].alunos[0]= new Aluno();
	    	 escola[i].alunos[0].nome="Fernando";
	    	 escola[i].alunos[0].idade=20;
	    	 escola[i].alunos[0].sexo='M';
	         
	    	 escola[i].alunos[1]= new Aluno();
	    	 escola[i].alunos[1].nome="Josias";
	    	 escola[i].alunos[1].idade=20;
	    	 escola[i].alunos[1].sexo='M';
	         
	    	 escola[i].alunos[2]= new Aluno();
	    	 escola[i].alunos[2].nome="Gabriel";
	    	 escola[i].alunos[2].idade=19;
	    	 escola[i].alunos[2].sexo='M';
	         
	    	 escola[i].alunos[3]= new Aluno();
	    	 escola[i].alunos[3].nome="Benedito";
	    	 escola[i].alunos[3].idade=20;
	    	 escola[i].alunos[3].sexo='M';
	        
	    	 escola[i].alunos[4]= new Aluno();
	    	 escola[i].alunos[4].nome="Francisco";
	    	 escola[i].alunos[4].idade=19;
	    	 escola[i].alunos[4].sexo='M';
		
		}

			for (int i = 0; i < E; i++) {
				int qntM=0;
				int mediaM=0;
				for (int j = 0; j < A; j++) {
					if ((escola[i].alunos[j].sexo == ('F') || (escola[i].alunos[j].sexo == ('f')))) 
						qntF++;	
					if ((escola[i].alunos[j].sexo == ('M') | (escola[i].alunos[j].sexo == ('m')))) {
						mediaM+=escola[i].alunos[j].idade;
						qntM++;
						}
					}
			media[i]= (mediaM/qntM);
			}     
	     
	    String entrada;
	     
		ImprimeDados(escola);
		entrada = JOptionPane.showInputDialog("Digite o nome do aluno para busca da escola: ");
		BuscaAluno(escola, entrada);
		Sort(escola);
		ImprimeOrdenado(escola);
	}
}