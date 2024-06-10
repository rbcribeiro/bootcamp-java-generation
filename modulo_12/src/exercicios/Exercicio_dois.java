package exercicios;

import java.util.*;

public class Exercicio_dois {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		System.out.println("Digite um número inteiro: ");
		int numeroDigitado = leia.nextInt();

		if (numeros.contains(numeroDigitado)) {
			int posicao = numeros.indexOf(numeroDigitado);
			System.out.println("O número " + numeroDigitado + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + numeroDigitado + " não foi encontrado.");
		}
		leia.close();
	}
}
