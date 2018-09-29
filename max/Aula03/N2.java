package Aula03;

public class N2 {

	public static void main(String[] args) {

		int i, k = 100, n = 0, vetor[] = new int[k/2];

		for (i = 0; i < k; i++)
			if (i % 2 != 0) {
				vetor[n] = i;
				n++;
			}
		for (i = 0; i < n; i++)
			System.out.println(vetor[i]);
	}
}