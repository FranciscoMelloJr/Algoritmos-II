package buscaOrdenacaoI;

public class N2 {

	public static void main(String[] args) {

		int i;
		int vet[] = { 2, 6, 9, 1, 5, 8, 3, 0 };
		boolean ordenado = true;
		for (i = 0; i < vet.length - 1; i++) {
			if (vet[i] >= vet[i + 1]) {
				ordenado = false;
				break;
			}
		}

		if (ordenado)
			System.out.println("Os valores estão ordenados.");
		else
			System.out.println("Os valores não estão ordenados.");

	}
}