package aula15;

public class N3 {

	static double mediaV(double v[], int i) {

		if (i < v.length)
			return (v[i]/v.length) + mediaV(v, i + 1);
		else
			return 0;
	}

	public static void main(String[] args) {

		double vetor[] = { 1, 3, 6, 10 };

		System.out.println(mediaV(vetor, 0));
	}
}