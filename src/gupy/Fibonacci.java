package gupy;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0, b = 1, n, aux;
		String valida = "";

		System.out.print("Digite um número qualquer: ");
		n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			aux = a;
			a = a + b;
			b = aux;
			if (a == n) {
				valida = "a";
			}
		}
		if (valida == "a") {
			System.out.println("Este número pertence à sequência de Fibonacci.");
		} else {
			System.out.println("Este número não pertence à sequência de Fibonacci.");
		}
		sc.close();
	}
}
