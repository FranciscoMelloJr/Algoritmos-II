package revisaoConteudos;

import java.util.Arrays;
import java.util.Random;

public class N1 {

	static double [] somaVetores(double [] vet1, double [] vet2) {

		double vetSoma [] = new double [vet1.length];
		for (int i=0; i<vetSoma.length; i++)		
			vetSoma[i]=vet1[i] + vet2[i];
				
			return vetSoma;
		
	}

	public static void main(String[] args) {

		int n = 10;
		Random random = new Random();

		double vet1[] = new double[n];
		double vet2[] = new double[n];

		for (int i = 0; i < vet1.length; i++) {
			vet1[i] = random.nextInt(10);
			vet2[i] = random.nextInt(10);
		}

		System.out.println("-----Vetor separado-----");

		for (int i = 0; i < vet1.length; i++) 
			System.out.print(vet1[i] + "  ");
		System.out.println();
		System.out.println();
		for (int i = 0; i < vet2.length; i++) 
			System.out.print(vet2[i] + "  ");
		System.out.println();
		System.out.println();
		System.out.println("-----Vetores somados-----");
		System.out.println(Arrays.toString(somaVetores(vet1, vet2)));
	}
}