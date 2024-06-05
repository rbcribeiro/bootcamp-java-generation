package exercicios_praticos;

import java.util.*;

public class Exercicio_tres {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		boolean primeiraDoacao;

		System.out.println("Digite o seu Nome:");
		nome = leia.nextLine();

		System.out.println("Digite sua idade:");
		idade = leia.nextInt();

		System.out.println("Primeira doação de sangue? (true/false)");
		primeiraDoacao = leia.nextBoolean();

		leia.close();

		if (idade >= 18 && idade < 69 && !primeiraDoacao) {
			System.out.println(nome + " está apto(a) para doar sangue!");
		} else {
			System.out.println(nome + " não está apto(a) para doar sangue!");
		}
	}
}