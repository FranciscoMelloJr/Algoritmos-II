package funcoesProcedimentos;

public class Exemplo04 {

	public static void cabecalho() {
			System.out.println("-----CALCULAR A POT�NCIA DE UM N�MERO-----");
	}
	
	public static int potencia(int n, int p) {
		int resultado=n;
		
		for (int i=2; i<=p; i++) 
			resultado = resultado*n;
		
		return resultado;
	}
	
	public static void main(String[] args) {

		int x=6;
		int y=2;
		
		cabecalho();
		System.out.println(x+" elevado a "+y+" � igual a "+potencia(x,y));
		System.out.println(y+" elevado a "+x+" � igual a "+potencia(y,x));
	}
}
