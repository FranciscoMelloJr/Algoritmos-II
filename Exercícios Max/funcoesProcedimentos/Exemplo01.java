package funcoesProcedimentos;

public class Exemplo01 {

	public static int soma (int n1, int n2) {
		int s;
		s = n1 + n2;
		return s;
	}

	public static void main(String[] args) {
		int x=5;
		int y=12;
		int resultado;
		
		resultado = soma(x,y);
		System.out.println(resultado);

	}
}
