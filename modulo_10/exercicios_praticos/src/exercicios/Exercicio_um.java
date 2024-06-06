package exercicios;

import java.util.*;

public class Exercicio_um {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("Digite o 1º número do intervalo: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o 2º número do intervalo: ");
		numero2 = leia.nextInt();

		if (numero1 >= numero2) {
			System.out.println("Intervalo Inválido!");
		} else {
			System.out.println("No Intervalo entre " + numero1 + " e " + numero2 + ":");
			boolean encontrouMultiplo = false;
			for (int i = numero1; i <= numero2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
					encontrouMultiplo = true;
				}
			}

			if (!encontrouMultiplo) {
				System.out.println("Não há múltiplos de 3 e 5 no intervalo especificado.");
			}
		}
		leia.close();
	}
}