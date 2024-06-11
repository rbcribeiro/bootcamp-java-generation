package exercicios;

import java.util.*;

public class Exercicio_quatro {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		System.out.println("Digite o número que você deseja encontrar: ");
		int numeroDigitado = leia.nextInt();

		if (numeros.contains(numeroDigitado)) {
			System.out.println("Número " + numeroDigitado + " foi encontrado!");
		} else {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");
		}
		leia.close();
	}
}
