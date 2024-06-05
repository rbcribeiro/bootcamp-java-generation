package exercicios_praticos;

import java.util.Scanner;

public class Exercicio_um {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c;

		System.out.println("Digite o valor de A");
		a = leia.nextInt();

		System.out.println("Digite o valor de B");
		b = leia.nextInt();

		System.out.println("Digite o valor de C");
		c = leia.nextInt();
		leia.close();

		if (a + b > c) {
			System.out.println("soma de A + B é maior que C.");
		} else if (a + b < c) {
			System.out.println("soma de A + B é menor que C.");
		} else {
			System.out.println("soma de A + B é igual a C.");
		}
	}
}
