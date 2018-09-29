package aula03;

public class N1 {

	public static void main(String[] args) {

		int aux = 0, i, n = 500 / 5, vetor[] = new int[n];

		for (i = 0; i < n; i++) {
			aux += 5;
			vetor[i] = aux;
		}
		for (i = 0; i < n; i++)
			System.out.println(vetor[i]);
	}
}