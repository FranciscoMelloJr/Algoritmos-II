package provaPraticaII;

import javax.swing.JOptionPane;

public class gabaritoN1 {
	public static void main(String[] args) {
		int nr_meses  = 12;
		int nr_semanas =  4;
		float[][] vendas = new float[nr_meses][nr_semanas];
		
		//Cadastro das vendas
		for (int m=0; m<nr_meses; m++) {
			for (int s=0; s<nr_semanas; s++) {
				String valorDigitado = JOptionPane.showInputDialog(null, "Informe o valor das vendas da semana " + (s+1) + " do mês " + (m+1) + ":");
				float valorNumerico = Float.parseFloat(valorDigitado);
				vendas[m][s] = valorNumerico;
			}
		}
		
		//Mostra as vendas
		System.out.println(" === VENDAS REALIZADAS === ");
		System.out.println("Mês \tSem1\tSem2\tSem3\tSem4");
		for (int m=0; m<nr_meses; m++) {
			System.out.print("Mês " + (m+1) + ":\t");
			for (int s=0; s<nr_semanas; s++) {
				System.out.print(vendas[m][s] + "\t");
			}
			System.out.println("");
		}
		System.out.println(" ====== ");
		
		
		int indMesMaisVendido = -1; //b)
		float totalVendasMesMaisVendido = -1; //b)
		float totalVendasAno = 0; //d)
		
		float totalSemana1 = 0; //c)
		float totalSemana2 = 0; //c)
		float totalSemana3 = 0; //c)
		float totalSemana4 = 0; //c)
		
		for (int m=0; m<nr_meses; m++) {
			//a)
			float totalMes = 0;
			for (int s=0; s<nr_semanas; s++) {
				totalMes += vendas[m][s];
				
				//c)
				switch (s) {
					case 0: totalSemana1 += vendas[m][s];
							break;
					case 1: totalSemana2 += vendas[m][s];
							break;
					case 2: totalSemana3 += vendas[m][s];
							break;
					case 3: totalSemana4 += vendas[m][s];
							break;
					default: System.out.println("Erro");
				}
			}
			System.out.println("Total das vendas do mês " + (m+1) + ": " + totalMes);
			
			//b)
			if (totalMes > totalVendasMesMaisVendido) {
				totalVendasMesMaisVendido = totalMes;
				indMesMaisVendido = m;
			}
			
			totalVendasAno += totalMes; //d)
		}
		
		//b)
		System.out.println("O mês em que se vendeu mais foi " + (indMesMaisVendido+1));
		
		//c)
		//Outra forma de resolver a questão c)
		/*float totalSemana1 = 0; //c)
		float totalSemana2 = 0; //c)
		float totalSemana3 = 0; //c)
		float totalSemana4 = 0; //c)
		for (int m=0; m<nr_meses; m++) { //Semana 1
			totalSemana1 += vendas[m][0];
		}
		for (int m=0; m<nr_meses; m++) { //Semana 2
			totalSemana2 += vendas[m][1];
		}
		for (int m=0; m<nr_meses; m++) { //Semana 3
			totalSemana3 += vendas[m][2];
		}
		for (int m=0; m<nr_meses; m++) { //Semana 4
			totalSemana4 += vendas[m][3];
		}*/
		
		//c)
		System.out.println("Total de vendas por semana:");
		System.out.println("Semana 1: R$ " + totalSemana1);
		System.out.println("Semana 2: R$ " + totalSemana2);
		System.out.println("Semana 3: R$ " + totalSemana3);
		System.out.println("Semana 4: R$ " + totalSemana4);
		
		//d)
		System.out.println("Total vendido no ano: " + totalVendasAno);
		
		
		//e)
		String valorDigitado = JOptionPane.showInputDialog(null, "Informe o primeiro mês para consulta:");
		int indiceMes = Integer.parseInt(valorDigitado) - 1;
		float totalMesBusca = 0;
		for (int s=0; s<nr_semanas; s++) {
			totalMesBusca += vendas[indiceMes][s];
		}
		System.out.println("Total de vendas do mês informado: " + totalMesBusca);
		
		valorDigitado = JOptionPane.showInputDialog(null, "Informe o segundo mês para consulta:");
		indiceMes = Integer.parseInt(valorDigitado) - 1;
		totalMesBusca = 0;
		for (int s=0; s<nr_semanas; s++) {
			totalMesBusca += vendas[indiceMes][s];
		}
		System.out.println("Total de vendas do mês informado: " + totalMesBusca);
		
		
	}
}
