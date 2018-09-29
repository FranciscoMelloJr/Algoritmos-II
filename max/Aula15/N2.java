package Aula15;

public class N2 {

	static int somaV(int v[], int i) {

		if (i < v.length)
			return v[i] + somaV(v, i + 1);
		else
			return 0;
	}

	public static void main(String[] args) {

		int vetor[] = {1, 3, 6, 9 };

		System.out.println(somaV(vetor, 0));
	}
}