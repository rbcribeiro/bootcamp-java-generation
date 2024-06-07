package exercicios;

import java.util.Scanner;

public class Exercicio_tres {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int menores21 = 0;
		int maiores50 = 0;

		while (true) {
			System.out.println("Digite uma idade: ");
			int idade = leia.nextInt();

			if (idade < 0) {
				break;
			}
			if (idade < 21) {
				menores21++;
			}
			if (idade > 50) {
				maiores50++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: " + menores21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);

		leia.close();
	}
}