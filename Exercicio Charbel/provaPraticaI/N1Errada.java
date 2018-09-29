package provaPraticaI;

import javax.swing.JOptionPane;

public class N1Errada {

	public static void main(String[] args) {
		int c=0,i,o,n=3,divisor=0,idade[]=new int[n];
		double resultado = 0,somador=0,maior=0,menor=10,media,nota[]=new double [n],notamaior=0;
		String entrada,entrada2,nome[]=new String[n];
		
			for (i=0; i<n; i++) {
			nome[i]=JOptionPane.showInputDialog("Insira o nome do aluno: ");
			entrada2=JOptionPane.showInputDialog("Insira a idade do aluno: ");
			idade[i]=Integer.parseInt(entrada2);
			for (o=0; o<3;o++) {
			entrada=JOptionPane.showInputDialog("Insira a nota do aluno: ");
			nota[i]=Double.parseDouble(entrada);
			somador=somador+nota[i];
			
			if (idade[i]>20) {
				notamaior=notamaior+nota[i];
				c++;
				resultado=notamaior/c;
			}
		}
			divisor++;
			if (nota[i]<menor)
				menor=nota[i];
			if (nota[i]>maior)
				maior=nota[i];
			}	
			for (i=0; i<n; i++) {
				if (nota[i]==menor)
					System.out.println("A menor nota foi de :"+nome[i]);
			}			
			for (i=0; i<n; i++) {
				if (nota[i]==maior)
					System.out.println("A maior nota foi de : "+nome[i]);
			}
			somador=somador/n;
			media=somador/n;	
			System.out.println("Média geral das notas de todos os alunos: "+media);
			System.out.println("Média dos alunos com mais de 20 anos:"+resultado);
	}
}
