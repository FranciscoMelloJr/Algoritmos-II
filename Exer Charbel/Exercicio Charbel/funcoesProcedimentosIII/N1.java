package funcoesProcedimentosIII;

import javax.swing.JOptionPane;

public class N1 {

	public static int fibonacci(int num) {

		if (num < 2)
			return 1;
		else
			return fibonacci(num - 1) + fibonacci(num - 2);
	}

	public static void main(String[] args) {

		int i, n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Números Fibonacci"));
		for (i = 0; i < n; i++)
			System.out.println(fibonacci(i));
	}
}
