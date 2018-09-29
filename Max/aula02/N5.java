package aula02;

public class N5 {

	public static void main(String[] args) {

		int i, n = 10, vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0)
				vetor[i] = vetor[i] * 2;
		}
		for (i = 0; i < n; i++)
			System.out.println(vetor[i]);
	}
}