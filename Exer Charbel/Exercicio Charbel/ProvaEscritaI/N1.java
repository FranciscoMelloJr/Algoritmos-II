package ProvaEscritaI;

import javax.swing.JOptionPane;

public class N1 {

	public static void main(String[] args) {

		int n=3, i, idade[]=new int[n];
		String nome[]=new String[n];
		String entrada;
		
		for (i=0;i<n;i++)  {
			nome[i]=JOptionPane.showInputDialog("Nome");
			entrada=JOptionPane.showInputDialog("Idade");
			idade[i]=Integer.parseInt(entrada);
			
		}	do  {  entrada=JOptionPane.showInputDialog("Nome de procura"); // Do e }
					for(i=0;i<n;i++)
						if (entrada==nome[i]) {
							if ((idade[i]>=5) & (idade[i]<=7));  //  (  )
								System.out.println(nome[i]+"Categoria: Infantil A");
							if ((idade[i]>=8) & (idade[i]<=10)); //  (  )
								System.out.println(nome[i]+"Categoria: Infantil B");
							if ((idade[i]>=11) & (idade[i]<=17)); // (  )
								System.out.println(nome[i]+"Categoria: Juvenil");
							if (idade[i]>=18);
								System.out.println(nome[i]+"Categoria: Adulto");
						}
			} while (entrada!=(null));  // while  =!
		}
	}
