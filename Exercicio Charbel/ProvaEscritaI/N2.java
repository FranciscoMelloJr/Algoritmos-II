package ProvaEscritaI;

import javax.swing.JOptionPane;

public class N2 {

	public static void main(String[] args) {
		
		int n=5000,contador=0,media=0,divisor=0,soma=0,i=0, idade[]=new int[n];
		String nome[]=new String[n], sexo[]=new String [n], entrada;
			for (i=0;i<n;i++)  {
				nome[i]=JOptionPane.showInputDialog("Nome");
				sexo[i]=JOptionPane.showInputDialog("Sexo");
				entrada=JOptionPane.showInputDialog("Idade");
				idade[i]=Integer.parseInt(entrada);
			
				if ((sexo[i]).equals("feminino")&(idade[i]>18))
					contador++;
				if ((sexo[i]).equals("masculino")) { // FALTOU "{"
					soma=soma+idade[i];
					divisor++;
	} 				
}	// FALTOU "}"	
				System.out.println("Pessoas do sexo feminino com mais de 18 anos: "+contador);
				media=soma/divisor;
				System.out.println("Enfim :"+media);
	}
}