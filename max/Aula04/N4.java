package Aula04;

public class N4 {

	public static void main(String[] args) {

		int i, n = 5, aux = n - 1, vetor1[] = { 1, 2, 3, 4, 5 }, vetor2[] = { 6, 7, 8, 9, 10 };

		for (i = 0; i < n; i++) {
			System.out.println(vetor1[i] * vetor2[aux]);
			aux--;
		}
	}
}