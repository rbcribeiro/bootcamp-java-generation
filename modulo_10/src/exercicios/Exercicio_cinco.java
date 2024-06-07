package exercicios;

import java.util.*;

public class Exercicio_cinco {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int soma = 0;
		int numero;

		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			if (numero > 0) {
				soma += numero;
			}
		} while (numero != 0);
		System.out.println("A soma dos números positivos é: " + soma);
		leia.close();
	}

}
