package Aula03;

public class N6 {

	public static void main(String[] args) {

		int i, n = 20, vetor[] = new int[n];

		for (i = 0; i < n; i++) {
			if (i == 0 || i == 1)
				vetor[i] = 1;
			else
				vetor[i] = vetor[i - 1] + vetor[i - 2];
		}
		for (i = 0; i <= n - 1; i++) {
			System.out.print(vetor[i]);
			if (i != n - 1)
				System.out.print(",");
		}
	}
}