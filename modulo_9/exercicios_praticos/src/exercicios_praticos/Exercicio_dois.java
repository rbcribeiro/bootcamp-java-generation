package exercicios_praticos;

import java.util.*;

public class Exercicio_dois {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;

		System.out.println("Digite o valor:");
		numero = leia.nextInt();
		leia.close();

		if (numero % 2 == 0 && numero >= 0) {
			System.out.println("O número " + numero + " é par e positivo!");
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("O número " + numero + " é par e negativo!");
		} else if (numero % 2 != 0 && numero > 0) {
			System.out.println("O número " + numero + " é impar e positivo!");
		} else {
			System.out.println("O número " + numero + " é par e negativo!");
		}
	}
}
