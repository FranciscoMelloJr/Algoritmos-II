package funcoesProcedimentosII;
import javax.swing.JOptionPane;
public class N2 {

	public static double soma(double n1, double n2) {
		return n1 + n2;
	}
	public static double subtrai(double n1, double n2) {
		return n1 - n2;
	}
	public static double multiplica(double n1, double n2) {
		return n1 * n2;
	}
	public static double divide(double n1, double n2) {
		return n1 / n2;
	}
	public static void main(String[] args) {

		int op;
		double v1, v2;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("\n 1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão \n 0-Sair"));
			if ((op < 0) & (op  > 4) ) {
				JOptionPane.showMessageDialog(null,"Erro");
			} else if (op !=0) {
				v1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número: "));
				v2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: "));
				switch (op) {
				case 1:System.out.println(soma(v1, v2));break;
				case 2:System.out.println(subtrai(v1, v2));break;
				case 3:System.out.println(multiplica(v1, v2));	break;
				case 4:System.out.println(divide(v1, v2));	break;
				}
			}
		} while (op != 0);
	}
}